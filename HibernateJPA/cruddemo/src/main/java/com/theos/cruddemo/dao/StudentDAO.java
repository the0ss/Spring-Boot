package com.theos.cruddemo.dao;

import java.util.List;
import com.theos.cruddemo.entity.Student;

public interface StudentDAO {
    
    void save(Student student);

    Student findByid(Integer id);

    List<Student> findAll();

    void update(Student theStudent);

    void delete(Integer id);
}
