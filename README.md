# Pet Management System using Spring Boot

This project is a Pet Management System implemented using Spring Boot framework. It provides functionalities to manage student records efficiently, including adding new Pet, updating existing Pet, deleting Pet, and retrieving Pet information.

## Technologies Used

Spring Boot: Framework for building the application.
Spring Data JPA: For interacting with the database.
MySQL: Database management system used to store student records.
Maven: Dependency management and build automation tool.
RESTful API: To expose endpoints for CRUD operations.

## API Endpoints
GET /Pet: Retrieve all Pets.
GET /Pet/{id}: Retrieve a specific Pet by ID.
POST /Pet: Create a new Pet record.
PUT /Pet/{id}: Update an existing Pet record.
DELETE /Pet/{id}: Delete a Pet record by ID.

## Usage
You can use tools like Postman or curl to interact with the RESTful APIs provided by the application. Here are some sample requests:

Retrieve all Pet: GET http://localhost:8080/students
Retrieve a specific Pet by ID: GET http://localhost:8080/Pet/{id}
Create a new student record: POST http://localhost:8080/Pets
Request Body: JSON data representing the new Pet.
Update an existing Pet record: PUT http://localhost:8080/Pet/{id}
Request Body: JSON data representing the updated Pet.
Delete a student record by ID: DELETE http://localhost:8080/Pet/{id}

## Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

