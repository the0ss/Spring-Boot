package com.theos.cruddemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.theos.cruddemo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
@Repository
public class EmployeeDAOimpl implements EmployeeDAO{

    private EntityManager entityManager;
    @Autowired
    public EmployeeDAOimpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query=entityManager.createQuery("From Employee", Employee.class);
        List<Employee> employees=query.getResultList();
        return employees;
    }

    @Override
    public Employee findbyId(int theId) {
        Employee employee=entityManager.find(Employee.class,theId);
        return employee;
    }

    @Override
    public Employee save(Employee thEmployee) {
        Employee dbEmployee=entityManager.merge(thEmployee);
        return dbEmployee;
    }

    @Override
    public void delete(int theId) {
        Employee employee=entityManager.find(Employee.class,theId);
        entityManager.remove(employee);
    }
    
}
