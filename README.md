# Backend for Math Game

This is a Spring Boot RESTful backend application developed in Java to support the Math Game Android app.
It uses REST API and PostgreSQL for storing and retrieving player scores, replacing the original Firebase based leaderboard system.

Developed this app as a personal project to learn and practice building RESTful APIs with Java and Spring Boot.

## How to Setup

Create a PostgreSQL database and update application.properties

```bash
server.port=8080

spring.datasource.url=jdbc:postgresql://localhost:5432/math_game_leaderboard
spring.datasource.username=your_pg_username
spring.datasource.password=your_pg_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

## How to Run

```bash
mvn spring-boot:run
```
The API will be available at http://localhost:8080/api/scores

### API Calls Example
#### Submit a new score
```http
POST http://localhost:8080/api/scores
Content-Type: application/json

{
  "points": 250,
  "time": 40
}
```
#### Get the leaderboard
```http
GET http://localhost:8080/api/scores/leaderboard
```

