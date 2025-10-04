package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseRegistery {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private  String name;
     private String emailId;
     private String courseName;

    public CourseRegistery(String name, String emailId, String courseName) {
        this.name = name;
        this.emailId = emailId;
        this.courseName = courseName;
    }

    public int getId() {
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public CourseRegistery(int id, String name, String emailId, String courseName) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.courseName = courseName;
    }

    public CourseRegistery() {
    }
}
