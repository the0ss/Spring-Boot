package com.theos.validationspringmvc;

import com.theos.validationspringmvc.validation.CourseCode;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String lastName;

    // @NotNull(message = "is required")
    // @Min(value = 0,message = "greater than zero")
    // @Max(value = 10,message = "Less than ten")
    // private Integer freePasses;

    @CourseCode 
    private String courseCode;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    // public Integer getFreePasses() {
    //     return freePasses;
    // }

    // public void setFreePasses(Integer freePasses) {
    //     this.freePasses = freePasses;
    // }
    
}
