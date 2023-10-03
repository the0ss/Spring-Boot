package com.theos.restcrud.rest;

import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.dsig.SignatureMethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theos.restcrud.entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/test")
public class StudentRestController {
    private List<Student> myStu=new ArrayList<>();
    @PostConstruct
    public void sett(){
        myStu.add(new Student("Swarn", "Lata"));
        myStu.add(new Student("Shivam", "Singh"));
    }
    
    @GetMapping("/student")
    public List<Student> seeStu(){
        return myStu;
    }
    @GetMapping("/student/{sid}")
    public Student seeId(@PathVariable int sid){
        
        return myStu.get(sid);

    }
}
