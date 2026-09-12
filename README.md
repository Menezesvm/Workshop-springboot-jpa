# Workshop Spring Boot e JPA

Projeto: Web services com Spring Boot e JPA / Hibernate, desenvolvido durante o curso **Java COMPLETO**, ministrado pelo Prof. Nélio Alves (DevSuperior).

## Sobre o projeto

- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções

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

Após iniciar o projeto, você pode realizar chamadas de API utilizando o Postman, para recuperar os recursos disponíveis:

- Para recuperar os usuários: `GET /users`
- Para recuperar um usuário: `GET /users/{id}`
- Para recuperar os pedidos: `GET /orders`
- Para recuperar um pedido: `GET /orders/{id}`
- Para recuperar os produtos: `GET /products`
- Para recuperar um produto: `GET /products/{id}`
- Para recuperar as categorias: `GET /categories`
- Para recuperar uma categoria: `GET /categories/{id}`

## Autor

**Vinicius Menezes**
[LinkedIn](https://linkedin.com/in/viniciusmenezes2)

## Agradecimentos

Projeto desenvolvido durante o curso Java COMPLETO da Udemy, ministrado pelo Prof. Nélio Alves (DevSuperior).
