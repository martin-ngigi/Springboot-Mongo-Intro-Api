package com.mongoapi.mongointro.controller;

import com.mongoapi.mongointro.dao.EmployeeDAO;
import com.mongoapi.mongointro.model.Employee;
import com.mongoapi.mongointro.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/employees")
public class EmployeeController {
    @Autowired
    EmployeeDAO employeeDAO;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    //http://localhost:8080/api/v1/employees/create-employee
    @PostMapping("/create-employee")
    public Employee create(@RequestBody Employee employee){
        employee.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));
        return employeeDAO.save(employee);
    }

    //http://localhost:8080/api/v1/employees/employees-list
    @GetMapping("/employees-list")
    public List<Employee> getAllEmployees(){
        return employeeDAO.findAll();
    }

}
