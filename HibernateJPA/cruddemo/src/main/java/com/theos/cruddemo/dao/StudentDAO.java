package com.theos.cruddemo.dao;

import com.theos.cruddemo.entity.Student;

public interface StudentDAO {
    
    void save(Student student);

    Student findByid(Integer id);
}
