# Workshop Spring Boot e JPA

*Read in [English](README.md)*

Projeto: Web services com Spring Boot e JPA / Hibernate, desenvolvido durante o curso **Java COMPLETO**, ministrado pelo Prof. Nélio Alves (DevSuperior).

## Sobre o projeto

- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções (`ResourceNotFoundException`, `DatabaseException`)

## Tecnologias utilizadas

Back end

- Java 17
- Spring Boot 4
- Spring Data JPA
- Hibernate
- Maven
- H2 Database
- PostgreSQL

## Instalação

Para rodar o projeto na sua máquina é necessário:

1. Clonar o repositório:
   ```bash
   git clone https://github.com/Menezesvm/Workshop-springboot-jpa.git
   ```
2. Abrir o projeto clonado
3. Iniciar o projeto Spring através da classe `DeveloperApplication`
4. Abrir o banco de dados H2 através da URL disponibilizada no arquivo `application-test.properties`

## Uso

Após iniciar o projeto, você pode realizar chamadas de API utilizando o Postman, para acessar os recursos disponíveis:

**Usuários** — CRUD completo

- `GET /users` — lista todos os usuários
- `GET /users/{id}` — busca um usuário pelo id
- `POST /users` — cria um novo usuário
- `PUT /users/{id}` — atualiza um usuário existente
- `DELETE /users/{id}` — remove um usuário

**Pedidos, produtos e categorias** — leitura

- `GET /orders` e `GET /orders/{id}`
- `GET /products` e `GET /products/{id}`
- `GET /categories` e `GET /categories/{id}`

Requisições para um `id` inexistente retornam `404 Not Found` com um corpo padronizado de erro.

## Autor

**Vinicius Menezes**
[LinkedIn](https://linkedin.com/in/viniciusmenezes2)

## Agradecimentos

Projeto desenvolvido durante o curso Java COMPLETO da Udemy, ministrado pelo Prof. Nélio Alves (DevSuperior).
