# Employee Management API

A RESTful Employee Management API built with **Spring Boot** that demonstrates modern backend development practices such as layered architecture, DTOs, validation, exception handling, and PostgreSQL integration.

## 🚀 Features

* CRUD Operations
* Search Employees by Name
* Bean Validation
* Global Exception Handling
* Custom Exceptions
* DTOs (Request & Response)
* ResponseEntity for HTTP Responses
* PostgreSQL Database Integration
* Spring Data JPA

---

## 🛠 Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven
* Jakarta Bean Validation
* Docker (PostgreSQL)

---

## 📁 Project Structure

```text
src/main/java
├── controller
├── service
├── repository
├── entity
├── dto
│   ├── EmployeeRequest
│   └── EmployeeResponse
├── exception
└── EmployeeManagementApiApplication
```

---

## 📌 API Endpoints

| Method | Endpoint                    | Description             |
| ------ | --------------------------- | ----------------------- |
| GET    | `/api/v1/emp`               | Get all employees       |
| GET    | `/api/v1/emp/{id}`          | Get employee by ID      |
| GET    | `/api/v1/emp/search/{name}` | Search employee by name |
| POST   | `/api/v1/emp`               | Create a new employee   |
| PUT    | `/api/v1/emp/{id}`          | Update an employee      |
| DELETE | `/api/v1/emp/{id}`          | Delete an employee      |

---

## ✅ Validation

Employee creation and update requests are validated using Jakarta Bean Validation.

Example validations:

* Name cannot be blank.
* Salary must be positive.

---

## ⚠️ Exception Handling

The project uses a centralized `GlobalExceptionHandler` to handle exceptions.

Handled exceptions include:

* EmployeeNotFoundException → **404 Not Found**
* MethodArgumentNotValidException → **400 Bad Request**

---

## 📦 DTO Architecture

The API uses DTOs to separate the API layer from the database layer.

### EmployeeRequest

Used for incoming client requests.

Fields:

* name
* salary

### EmployeeResponse

Returned to the client.

Fields:

* id
* name
* salary

This prevents exposing internal entity details and keeps the API independent of the database model.

---

## 🗄 Database

* PostgreSQL
* Spring Data JPA
* Hibernate ORM

---

## ▶️ Running the Project

1. Start the PostgreSQL database (Docker or local installation).
2. Configure `application.properties`.
3. Run the Spring Boot application.
4. Access the API at:

```text
http://localhost:8081/api/v1/emp
```

---

## 📚 Concepts Learned

* REST API Development
* Layered Architecture
* Dependency Injection
* Spring Data JPA
* CRUD Operations
* ResponseEntity
* Bean Validation
* Global Exception Handling
* Custom Exceptions
* DTO Pattern
* PostgreSQL Integration

---

## 🔮 Future Improvements

* Pagination & Sorting
* JPA Relationships
* Lombok
* Spring Security (JWT Authentication)
* MapStruct
* Swagger / OpenAPI Documentation
* Unit & Integration Testing
