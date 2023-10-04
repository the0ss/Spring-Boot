package com.theos.doctorapi.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="doctor")
    private int doctor_id;
    
    @Column(name="time")
    private LocalDateTime appointmentDateTime;
    
    public Appointment(){}

    public Appointment(int id, int doctor, LocalDateTime appointmentDateTime) {
        this.id = id;
        this.doctor_id = doctor;
        this.appointmentDateTime = appointmentDateTime;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoctor() {
        return doctor_id;
    }

    public void setDoctor(int doctor) {
        this.doctor_id = doctor;
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    @Override
    public String toString() {
        return "Appointment [id=" + id + ", doctor=" + doctor_id + ", appointmentDateTime=" + appointmentDateTime + "]";
    }

    
}

