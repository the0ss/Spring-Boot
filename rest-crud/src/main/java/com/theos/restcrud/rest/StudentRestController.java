package com.theos.restcrud.rest;

import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.dsig.SignatureMethod;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
        
        if(sid>=myStu.size()||sid<0)
            throw new StudentNotFoundException("Student id not found : "+ sid);
        return myStu.get(sid);
    }
    // @ExceptionHandler
    // public ResponseEntity<StudentErrorException> handleException(StudentNotFoundException exc){
    //     StudentErrorException error=new StudentErrorException();
    //     error.setStatus(HttpStatus.NOT_FOUND.value());
    //     error.setMessage(exc.getMessage());
    //     error.setTimeStamp(System.currentTimeMillis());

    //     return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    // }
    // @ExceptionHandler
    // public ResponseEntity<StudentErrorException> handleException(Exception exc){
    //     StudentErrorException error=new StudentErrorException();
    //     error.setStatus(HttpStatus.BAD_REQUEST.value());
    //     error.setMessage("Wrong Request");
    //     error.setTimeStamp(System.currentTimeMillis());

    //     return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    // }
}
