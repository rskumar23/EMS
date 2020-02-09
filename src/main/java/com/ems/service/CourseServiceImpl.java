package com.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.model.Course;
import com.ems.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository courseRepository;
	
	public void addCourses(Course c) {
		courseRepository.save(c);
		
	}

}
