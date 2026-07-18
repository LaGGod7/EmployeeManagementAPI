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
    public ResponseEntity<List<Employee>>  getEmployees(){
        List<Employee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }


    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployebyId( @PathVariable Integer id){
        Employee employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }


    @GetMapping("/search/{name}")
    public ResponseEntity<List<Employee>> searchName(@PathVariable String name) {
        List<Employee> employees = employeeService.getbyName(name);
        return ResponseEntity.ok(employees);
    }

    @PostMapping
    public ResponseEntity<String> addEmployee(@Valid @RequestBody  Employee employee){
        employeeService.addEmp(employee);
        return new ResponseEntity<>("Employee added successfully", HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> delEmpbyId(@PathVariable Integer id) {
        employeeService.delEmpbyId(id);
        return new ResponseEntity<>("Employee deleted successfully", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@Valid @PathVariable Integer id,@RequestBody Employee employee) {
        Employee updatedEmployee = employeeService.updateEmployee(id, employee);
        return ResponseEntity.ok(updatedEmployee);
    }





}
