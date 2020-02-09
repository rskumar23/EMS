package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.model.Course;

public interface CourseRepository  extends JpaRepository<Course, Long>{

}
