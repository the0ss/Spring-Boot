package com.theos.validationspringmvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    private String coursePrefix;
    @Override
    public void initialize(CourseCode thCourseCode){
        coursePrefix=thCourseCode.value();
    }
    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
        boolean result=theCode.startsWith(coursePrefix);
        
        return result;
    }
    
}
