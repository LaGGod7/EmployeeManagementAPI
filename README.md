# Employee Management API

A RESTful Employee Management API built using Spring Boot.

## Features

- ✅ Create Employee
- ✅ Get All Employees
- ✅ Get Employee by ID
- ✅ Update Employee
- ✅ Delete Employee
- ✅ Search Employee by Name
- ✅ Bean Validation
- ✅ Global Exception Handling for Validation Errors
- ✅ Custom Employee Not Found Exception

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker
- Maven
- Jakarta Bean Validation

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/v1/emp` | Get all employees |
| GET | `/api/v1/emp/{id}` | Get employee by ID |
| GET | `/api/v1/emp/search/{name}` | Search employees by name |
| POST | `/api/v1/emp` | Create employee |
| PUT | `/api/v1/emp/{id}` | Update employee |
| DELETE | `/api/v1/emp/{id}` | Delete employee |

## Validation Rules

- Employee name cannot be blank.
- Salary must be a positive number.

## Future Improvements

- ResponseEntity
- DTOs
- Pagination
- Sorting
- Spring Security (JWT)
