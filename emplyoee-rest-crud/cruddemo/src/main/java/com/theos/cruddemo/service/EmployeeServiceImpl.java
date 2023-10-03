package com.theos.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theos.cruddemo.dao.EmployeeDAO;
import com.theos.cruddemo.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){
        employeeDAO=theEmployeeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
    @Override
    public Employee findById(int theId) {
        return employeeDAO.findbyId(theId);
    }
    @Override
    @Transactional
    public Employee save(Employee thEmployee) {
        return employeeDAO.save(thEmployee);
    }
    @Override
    @Transactional
    public void delete(int theId) {
        employeeDAO.delete(theId);
    }
    
}
