package com.theos.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theos.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    
}
