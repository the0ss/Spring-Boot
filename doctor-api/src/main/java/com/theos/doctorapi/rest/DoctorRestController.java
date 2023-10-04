package com.theos.doctorapi.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theos.doctorapi.dao.DoctorRepository;
import com.theos.doctorapi.entity.Doctor;

@RestController
@RequestMapping("/api")
public class DoctorRestController {
    
    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors(){
        List<Doctor> doctors= doctorRepository.findAll();
        return doctors;
    }
    @GetMapping("/doctor/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable int id) {
        Optional<Doctor> optionalDoctor = doctorRepository.findById(id);
        return optionalDoctor.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor) {
        Doctor savedDoctor = doctorRepository.save(doctor);
        return ResponseEntity.ok(savedDoctor);
    }
    @DeleteMapping("/doctors/{id}")
    public String delete(@PathVariable int id){

        doctorRepository.deleteById(id);
        return "Deleted";
    }

}
