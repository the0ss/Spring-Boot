package com.theos.cruddemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.theos.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDAOimpl implements StudentDAO {

    private EntityManager entityManager;
    @Autowired
    public StudentDAOimpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findByid(Integer id) {
        return entityManager.find(Student.class,id);
    }
    
}