package com.theos.cruddemo.service;

import java.util.List;

import com.theos.cruddemo.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();
    
    Employee findById(int theId);

    Employee save(Employee thEmployee);

    void delete(int theId);
}
