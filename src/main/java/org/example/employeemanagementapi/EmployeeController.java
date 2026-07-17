package org.example.employeemanagementapi;


import jakarta.validation.Valid;
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
    public List<Employee> getEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("{id}")
    public Employee getEmployebyId(@Valid @PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }


    @GetMapping("/search/{name}")
    public List<Employee> searchName(@PathVariable String name) {
        return employeeService.getbyName(name);
    }

    @PostMapping
    public void addEmployee(@Valid @RequestBody  Employee employee){
        employeeService.addEmp(employee);
    }


    @DeleteMapping("/{id}")
    public String delEmpbyId(@PathVariable Integer id) {
        employeeService.delEmpbyId(id);
        return "Employee deleted successfully";
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Integer id,@RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }





}
