package com.sarah.people.service;


import com.sarah.people.dto.request.PersonRequestDTO;
import com.sarah.people.dto.response.PersonResponseDTO;
import com.sarah.people.entity.Person;
import com.sarah.people.repository.PersonRepository;
import com.sarah.people.util.PersonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor


public class PersonServiceImplements implements PersonService {

    private final PersonRepository personRepository;

    private final PersonMapper personMapper;


    @Override
    public PersonResponseDTO findById(Long id) {
        Person person = returnUser(id);

        return personMapper.toPersonDTO(person);
    }

    @Override
    public List<PersonResponseDTO> findAll() {


        return personMapper.toPeopleDTO(personRepository.findAll());


    }

    @Override
    public PersonResponseDTO register(PersonRequestDTO personDTO) {

        Person person = personMapper.toPerson(personDTO);

        return personMapper.toPersonDTO(personRepository.save(person));


    }

    @Override
    public PersonResponseDTO update(Long id, PersonRequestDTO personDTO) {
        Person person = returnUser(id);

        personMapper.updatePersonData(person, personDTO);

        return personMapper.toPersonDTO(personRepository.save(person));
    }

    @Override
    public String delete(Long id) {
        personRepository.deleteById(id);
        return "Person ID "+ id + " deleted";



    }

    private Person returnUser(Long id) {
        return personRepository.findById(id).orElseThrow(()-> new RuntimeException("This person was not found in the database."));

    }
}
