package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ems.dto.CourseDTO;
import com.ems.model.Course;
import com.ems.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/course")
	ModelAndView course() {
		System.out.println("In course!!");
		return new ModelAndView("courses");
	}
	
	@RequestMapping("/addCourses")
	ModelAndView addCourses(@ModelAttribute("course") CourseDTO courseDto) {
		courseService.addCourses(courseDto);
		System.out.println("in addCourse");
		return new ModelAndView(new RedirectView("/courseDetails",true));
	}
	
	@RequestMapping("/updateCourse")
	ModelAndView updateCourse(@RequestParam("courseId") String courseId) {
		ModelAndView modelAndView = new ModelAndView("courses");
		Course course = courseService.updateCourse(Integer.parseInt(courseId));
		modelAndView.addObject("course",course);
		return modelAndView;
	}
	
	@RequestMapping("/courseDetails")
	public ModelAndView showCourses() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("courses", courseService.findAll());
		modelAndView.setViewName("show_courses");
		return modelAndView;
	}
	
	@RequestMapping("/deleteCourse")
	public ModelAndView deleteCourse(@RequestParam("courseId") String courseId) {
		courseService.deleteCourse(Integer.parseInt(courseId));
		return new ModelAndView(new RedirectView("/courseDetails",true));
		
	}

}
