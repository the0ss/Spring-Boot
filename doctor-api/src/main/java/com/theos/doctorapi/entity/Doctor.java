package com.theos.doctorapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="specialization")
    private String specialization;

    @Column(name="maxappointments")
    private int maxAppointments;

    public Doctor(){}

    public Doctor(int id, String name, String specialization, int maxAppointments) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.maxAppointments = maxAppointments;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getMaxAppointments() {
        return maxAppointments;
    }

    public void setMaxAppointments(int maxAppointments) {
        this.maxAppointments = maxAppointments;
    }

    @Override
    public String toString() {
        return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", maxAppointments="
                + maxAppointments + "]";
    }

}
