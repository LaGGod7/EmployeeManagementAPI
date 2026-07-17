package org.example.employeemanagementapi;

public class EmployeeNotFoundException extends RuntimeException {
            public EmployeeNotFoundException(String message) {
                super(message);
            }
}
