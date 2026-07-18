package org.example.employeemanagementapi;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/emp")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping
    public ResponseEntity<List<EmployeeResponse>> getEmployees() {
        List<EmployeeResponse> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }


    @GetMapping("{id}")
    public ResponseEntity<EmployeeResponse> getEmployId(@PathVariable Integer id) {
        EmployeeResponse employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }


    @GetMapping("/search/{name}")
    public ResponseEntity<List<EmployeeResponse>> searchName(@PathVariable String name) {
        List<EmployeeResponse> employees = employeeService.getByName(name);
        return ResponseEntity.ok(employees);
    }

    @PostMapping
    public ResponseEntity<EmployeeResponse> addEmployee(@Valid @RequestBody EmployeeRequest employee) {
        EmployeeResponse response = employeeService.addEmp(employee);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(response);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> delEmpById(@PathVariable Integer id) {
        employeeService.delEmployeeById(id);
        return new ResponseEntity<>("Employee deleted successfully", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeResponse> updateEmployee(@PathVariable Integer id, @RequestBody EmployeeRequest employee) {
        EmployeeResponse updatedEmployee = employeeService.updateEmployees(id, employee);
        return ResponseEntity.ok(updatedEmployee);
    }


}
