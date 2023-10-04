package com.theos.doctorapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theos.doctorapi.dao.AppointmentRepository;
import com.theos.doctorapi.entity.Appointment;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentRestController {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping()
    public List<Appointment> getAllAppointment(){
        List<Appointment> appointment=appointmentRepository.findAll();
        return appointment;
    }
    @PostMapping("/book")
    public String bookAppointment(@RequestBody Appointment appointment){
        // Check if the doctor has available slots, and the appointment time is valid

        // Implement validation logic here
        
        appointmentRepository.save(appointment);
        return "Appointment Saved!";
    }
}
