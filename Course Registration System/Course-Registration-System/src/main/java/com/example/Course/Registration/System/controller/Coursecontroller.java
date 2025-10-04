package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistery;
import com.example.Course.Registration.System.service.Courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")

public class Coursecontroller {


    @Autowired
    Courseservice courseservice;

    @GetMapping("courses")
    public List<Course>availableCourse(){
        return courseservice.availableCourse();
    }
    @GetMapping("courses/enrolled")
    public List<CourseRegistery> enrolledStudents(){
        return  courseservice.enrolledStudents();
    }


    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,@RequestParam("emailId") String emailId,@RequestParam("courseName") String courseName){

        courseservice.enrollCourse(name,emailId,courseName);

        return "Congratulations"+ name +"Enrollement Succesfull for"+ courseName;

    }
}
