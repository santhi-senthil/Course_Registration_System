package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistery;
import com.example.Course.Registration.System.repository.Courserepo;
import com.example.Course.Registration.System.repository.Registoryrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Courseservice {

    @Autowired
    Courserepo courserepo;

    @Autowired
    Registoryrepo registoryrepo;
    public List<Course> availableCourse() {
      return courserepo.findAll();
    }

    public List<CourseRegistery> enrolledStudents() {
   return registoryrepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistery courseRegistery=new CourseRegistery(name,emailId,courseName);

        registoryrepo.save(courseRegistery);
    }
}
