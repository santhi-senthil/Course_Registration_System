package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.CourseRegistery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Registoryrepo extends JpaRepository<CourseRegistery,Integer> {
}
