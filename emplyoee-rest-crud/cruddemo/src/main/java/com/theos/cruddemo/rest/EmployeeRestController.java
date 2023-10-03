package com.theos.cruddemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theos.cruddemo.entity.Employee;
import com.theos.cruddemo.service.EmployeeService;
import com.theos.cruddemo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;
    public EmployeeRestController(EmployeeService theemployeeService){
        employeeService=theemployeeService;
    }
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){

        Employee employee=employeeService.findById(employeeId);
        if(employee==null)
            throw new RuntimeException("Employee id not found :"+ employeeId);
        return employee;
    }
}
