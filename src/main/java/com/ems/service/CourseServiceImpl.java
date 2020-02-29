package com.ems.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ems.dto.CourseDTO;
import com.ems.model.Course;
import com.ems.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository courseRepository;
	
	public void addCourses(CourseDTO courseDto) {
		Course course = convertDtoToModel(courseDto);
		courseRepository.save(course);
	}
	
	public List<Course> findAll() {
		
		return courseRepository.findAll();
	}
	@Override
	public void deleteCourse(long courseId) {
		
		courseRepository.deleteById(courseId);
	}

	public Course updateCourse(long courseId) {
		return courseRepository.findById(courseId).get();
	}
	
	public Course convertDtoToModel(CourseDTO courseDto) {
		System.out.println("In Course convertDtoToModel(CourseDTO courseDto) >>");
		Course course = new Course();
		if(courseDto.getId() != null) {
			course.setId(courseDto.getId());
		}
		course.setCrsUid(courseDto.getCrsUid());
		course.setName(courseDto.getName());
		course.setStrtDate(courseDto.getStrtDate());
		course.setEndDate(courseDto.getEndDate());
		course.setTrainerUid(courseDto.getTrainerUid());
		course.setCategory(courseDto.getCategory());
		course.setType(courseDto.getType());
		return course;
	}

}
