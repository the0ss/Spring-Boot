package com.theos.cruddemo.rest;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theos.cruddemo.entity.Employee;
import com.theos.cruddemo.service.EmployeeService;

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
    @PostMapping("/employee")
    public Employee add(@RequestBody Employee employee){
        employee.setId(0);
        Employee dbEmployee=employeeService.save(employee);
        return dbEmployee;
    }
    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee){
        Employee dbEmployee=employeeService.save(employee);
        return dbEmployee;
    }
    @DeleteMapping("/employee/{empid}")
    public String delete(@PathVariable int empid){
        Employee employee=employeeService.findById(empid);
        if (employee == null )
            throw new RuntimeException("Employee id is not found: "+ empid);
        employeeService.delete(empid);
        return "Deleted Employee id: "+empid;
    }
}
