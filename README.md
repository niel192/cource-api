Course API

This is a simple REST API project that provides CRUD functionality for managing courses. The API is built with Java and uses Spring Boot framework.
Features

    • Get a list of all courses.    
    • Get a single course by ID.    
    • Create a new course.    
    • Update an existing course.
    • Delete a course.
    
Prerequisites

    • Java 8 or higher
    • Maven
    • MySQL
    
Getting Started

To run the application locally, follow these steps:

    1. Clone the repository:
       git clone https://github.com/niel192/cource-api.git
    2. Create a new MySQL database:
       CREATE DATABASE course_api_db;
    3. Open the application.properties file in the src/main/resources directory and update the following properties with your own database credentials:
       spring.datasource.url=jdbc:mysql://localhost:3306/course_api_db
       spring.datasource.username=your_username
       spring.datasource.password=your_password
    4. Build the project:
       mvn clean package
    5. Run the application:
       java -jar target/course-api-0.0.1-SNAPSHOT.jar
       
The application will start running on http://localhost:8080. You can use a REST client such as Postman to interact with the API.

Built With

    • Java
    • Spring Boot
    • MySQL
