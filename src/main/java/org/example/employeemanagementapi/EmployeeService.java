package org.example.employeemanagementapi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getal() {
        return employeeRepository.findAll();
    }

    public Employee getbyId(Integer id) {
        return employeeRepository.findById(id).orElseThrow(()->new IllegalStateException(id+"Not found"));
    }


    public void addEmp(Employee employee) {
        employeeRepository.save(employee);
    }


    public void delEmpbyId(Integer id) {
        employeeRepository.deleteById(id);
    }

    public void UpdateEmp(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee updateEmployee(Integer id, Employee employee) {
        Employee e = employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee not found"));
        e.setName(employee.getName());
        e.setSalary(employee.getSalary());
        return employeeRepository.save(e);
    }

    public List<Employee> getbyName(String name) {
        if (name == null || name.isBlank()) {
            throw new RuntimeException("Name cannot be empty");
        }
        return employeeRepository.findByName(name);
    }
}
