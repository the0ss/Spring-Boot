package com.theos.doctorapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theos.doctorapi.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
    
}
