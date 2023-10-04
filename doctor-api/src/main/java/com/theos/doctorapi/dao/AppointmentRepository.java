package com.theos.doctorapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theos.doctorapi.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{
    
}
