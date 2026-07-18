package org.example.employeemanagementapi;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class EmployeeRequest {
    @NotBlank(message = "name cannot be blank")
    private String name;

    @Positive(message = "Salary must be positive")
    private Integer salary;

    public EmployeeRequest(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
