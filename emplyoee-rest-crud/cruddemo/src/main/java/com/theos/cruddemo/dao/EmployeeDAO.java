package com.theos.cruddemo.dao;

import java.util.List;

import com.theos.cruddemo.entity.Employee;

public interface EmployeeDAO {
    
    List<Employee> findAll();
    
    Employee findbyId(int theId);

    Employee save(Employee thEmployee);

    void delete(int theId);
    
}
