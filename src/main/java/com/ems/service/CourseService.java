package com.ems.service;

import java.util.List;

import com.ems.dto.CourseDTO;
import com.ems.model.Course;

public interface CourseService {

	public void addCourses(CourseDTO courseDto);
	
	public List<Course> findAll();

	public void deleteCourse(long courseId);
	
	public Course updateCourse(long courseId);
}
