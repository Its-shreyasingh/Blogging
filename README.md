# Blogging Platform API 

A robust RESTful Backend API built with **Java** and **Spring Boot**, designed for a blogging ecosystem. This project handles user management, blog post creation, and secure data persistence using **PostgreSQL**.

---

##  Tech Stack
* **Language:** Java 17
* **Framework:** Spring Boot 3.x
* **Security:** Spring Security (Basic Auth / JWT)
* **Database:** PostgreSQL
* **ORM:** Spring Data JPA (Hibernate)
* **Build Tool:** Maven
* **API Testing:** Postman

---

## System Architecture

The project follows a **Layered Architecture** to ensure clean separation of concerns and maintainability:
1.  **Controller Layer**: Exposes REST endpoints and handles HTTP status codes.
2.  **Service Layer**: Contains the core "business logic" (e.g., mapping DTOs to Entities).
3.  **Repository Layer**: Communicates with PostgreSQL using Spring Data JPA.
4.  **Model Layer**: Represents the database schema via Java Entities.(User,Post,Category).

 ---
##  Features
- **User Management:** Create and manage user profiles.
- **Blogging Engine:** Full CRUD operations for blog posts.
- **Relational Mapping:** One-to-Many relationship between Users and Posts.
- **Data Persistence:** Automated schema updates with Hibernate.
- **Security:** Protected endpoints requiring authentication.

---

##  Getting Started

### 1. Prerequisites
- JDK 17 or higher
- PostgreSQL installed and running
- Maven installed

### 2. Database Setup
Create a database named `blog_db` in your PostgreSQL instance:
```sql
CREATE DATABASE blog_db;
```

### 3.Configuration
Update `src/main/resources/application.properties` with your PostgreSQL credentials:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/blog
spring.datasource.username=your_postgres_username
spring.datasource.password=your_postgres_password
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

spring.application.name=project

spring.security.user.name=user
spring.security.user.password=password
server.port=8080
```

### 4.Run the Application
```
# 1. Clone the repository
git clone https://github.com/Its-shreyasingh/Blogging.git

# 2. Navigate into the project
cd Blogging Platform API

# 3. Build and Run
mvn spring-boot:run
```
---

## API Reference

### POSTS
|Method|Endpoint |Description |
|:----| :---- |:----|
| `POST` | `/api/v1/posts` | Create a new blog post |
| `GET` | `/api/v1/posts` | Fetch all public posts |
| `GET` | `/api/v1/posts/{id}` | Get details of a specific post |

### USERS
|Method|Endpoint |Description |
|:----| :---- |:----|
| `POST` | `/api/v1/users` | Register a new user |
| `GET` | `/api/v1/users/{id}/posts` | Fetch all posts by a specific author |
---


## 👤 Author

Developed  by **[Shreya Singh](https://github.com/Its-shreyasingh)**

---