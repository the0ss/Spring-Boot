package com.theos.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theos.cruddemo.dao.EmployeeRepository;
import com.theos.cruddemo.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployee){
        employeeRepository=theEmployee;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
    @Override
    public Employee findById(int theId) {
        Optional<Employee> result= employeeRepository.findById(theId);
        Employee thEmployee=null;
        if(result.isPresent())
            thEmployee=result.get();
        else
            throw new RuntimeException("Didnot Find eid: "+theId);
        return thEmployee;
    }
    @Override
    public Employee save(Employee thEmployee) {
        return employeeRepository.save(thEmployee);
    }
    @Override
    public void delete(int theId) {
        employeeRepository.deleteById(theId);
    }
    
}
