# People API

A REST API for managing people, built with **Java Spring Boot** and **PostgreSQL**.

## Technologies Used

- Java 21
- Spring Boot 4.0.4
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

## Features

- Create, read, update and delete (CRUD) operations for people
- RESTful API design
- PostgreSQL database integration

## Prerequisites

Before running this project, make sure you have installed:

- Java 21
- Maven
- PostgreSQL

## Database Setup

1. Create a PostgreSQL database called `peopleAPI`:
sql
CREATE DATABASE "peopleAPI";
The tables will be created automatically when you run the application.

### Configuration
Open src/main/resources/application.properties and update with your database credentials:

spring.datasource.url=jdbc:postgresql://localhost:5432/peopleAPI
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

### How to Run
mvn spring-boot:run
The API will start on http://localhost:8080.

### API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | `/people` | Get all people |
| GET | `/people/{id}` | Get a person by ID |
| POST | `/people` | Create a new person |
| PUT | `/people/{id}` | Update a person |
| DELETE | `/people/{id}` | Delete a person |

Request Example:
```
{
  "name": "Sarah",
  "cpf": "123.456.789-00",
  "age": 25
}

Response Example:

{
  "id": 1,
  "name": "Sarah",
  "cpf": "123.456.789-00",
  "age": 25
}
```

### Project Structure

```
src/
└── main/
    └── java/
        └── com/
            └── sarah/
                └── people/
                    ├── controller/
                    │   └── PersonController.java
                    ├── dto/
                    │   ├── request/
                    │   │   └── PersonRequestDTO.java
                    │   └── response/
                    │       └── PersonResponseDTO.java
                    ├── entity/
                    │   └── Person.java
                    ├── repository/
                    │   └── PersonRepository.java
                    ├── service/
                    │   ├── PersonService.java
                    │   └── PersonServiceImplements.java
                    ├── util/
                    │   └── PersonMapper.java
                    └── PeopleApplication.java
```

--- Sarah Souza ----
