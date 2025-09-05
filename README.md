 University Management System

A Spring Boot REST API project implementing a basic University Management System.  
This project demonstrates CRUD operations for core university entities using Spring Data JPA and MySQL.  

Designed as a learning portfolio project, showcasing clean architecture and RESTful practices.



 Features
- CRUD operations for 8 entities: Student, Professor, Course, Classroom, LibraryBook, Event, Notice  
- RESTful API endpoints using standard HTTP methods (`GET`, `POST`, `PUT`, `DELETE`)  
- Database operations via Spring Data JPA  
- Connected to MySQL database  



 Technologies Used
- Java 17+  
- Spring Boot 3+  
- Spring Data JPA / Hibernate  
- MySQL  
- Maven  



 Database Setup
Create a MySQL database (e.g., `university_db`) and update `application.properties`:

spring.datasource.url=jdbc:mysql://localhost:3306/university_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Running the Project
- Open in your IDE (IntelliJ/Eclipse)
- Make sure MySQL is running and database exists


Run the application:
- mvn spring-boot:run
- Test APIs with Postman or Swagger
