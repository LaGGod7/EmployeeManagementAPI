package org.example.employeemanagementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmployeeManagementApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementApiApplication.class, args);
    }
    @GetMapping
    public String hello() {
        return "Hello World";
    }

}
