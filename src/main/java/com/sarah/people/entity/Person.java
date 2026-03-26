package com.sarah.people.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbPeople")
@NoArgsConstructor
@Getter
@Setter


public class Person {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)

    private Long id;

    @Column(name = "name", nullable = false)

    private String name;

    @Column(name = "cpf", nullable = false, unique = true)

    private String cpf;

    @Column(name = "age", nullable = false)

    private Integer age;

    @Builder

    public Person(String name, String cpf, Integer age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;

    }




}
