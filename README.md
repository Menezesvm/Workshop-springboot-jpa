# Spring Boot and JPA Workshop

*Leia em [Português](LEIAME.md)*

Project: Web services with Spring Boot and JPA / Hibernate, developed during the **Java COMPLETO** course, taught by Prof. Nélio Alves (DevSuperior).

## About the project

- Create a Spring Boot Java project
- Implement the domain model
- Structure logical layers: resource, service, repository
- Configure a test database (H2)
- Seed the database
- CRUD - Create, Retrieve, Update, Delete
- Exception handling (`ResourceNotFoundException`, `DatabaseException`)

## Technologies used

Back end

- Java 17
- Spring Boot 4
- Spring Data JPA
- Hibernate
- Maven
- H2 Database
- PostgreSQL

## Installation

To run the project on your machine you'll need:

1. Clone the repository:
   ```bash
   git clone https://github.com/Menezesvm/Workshop-springboot-jpa.git
   ```
2. Open the cloned project
3. Start the Spring project via the `DeveloperApplication` class
4. Open the H2 database console using the URL provided in the `application-test.properties` file

## Usage

Once the project is running, you can call the API (e.g. with Postman) to access the available resources:

**Users** — full CRUD

- `GET /users` — list all users
- `GET /users/{id}` — retrieve a user by id
- `POST /users` — create a new user
- `PUT /users/{id}` — update an existing user
- `DELETE /users/{id}` — delete a user

**Orders, products and categories** — read-only

- `GET /orders` and `GET /orders/{id}`
- `GET /products` and `GET /products/{id}`
- `GET /categories` and `GET /categories/{id}`

Requests for a non-existent `id` return `404 Not Found` with a standardized error body.

## Author

**Vinicius Menezes**
[LinkedIn](https://linkedin.com/in/viniciusmenezes2)

## Acknowledgements

Project developed during the Java COMPLETO course on Udemy, taught by Prof. Nélio Alves (DevSuperior).
