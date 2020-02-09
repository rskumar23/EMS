package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ems.model.Course;
import com.ems.model.Employee;
import com.ems.service.CourseService;
import com.ems.service.EmployeeService;

@RestController               // @restcontroller=@Controller+@ResponseBody
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/addEmployee")
	ModelAndView addEmployee(@ModelAttribute("emp") Employee emp) {
		employeeService.addEmployee(emp);
		return new ModelAndView("home");
	}
	@RequestMapping("/addCourses")
	ModelAndView addCourses(@ModelAttribute("course") Course course) {
		courseService.addCourses(course);
		return new ModelAndView("home");
	}
	
	@RequestMapping("/dashboard")
	ModelAndView showDashboard() {
		System.out.println("In Dashboard!!");
		return new ModelAndView("home");
	}
	
	@RequestMapping(value={"/","/login"})
	ModelAndView login() {
		System.out.println("In Login Form!");
		return new ModelAndView("login");
	}
	
	@RequestMapping("/employee")
	ModelAndView employee() {
		System.out.println("In Dashboard!!");
		return new ModelAndView("employee");
	}
	@RequestMapping("/employee_details")
	ModelAndView showAllEmployee() {
		System.out.println("In Dashboard!!");
		return new ModelAndView("show_employee");
	}
	@RequestMapping("/courses")
	ModelAndView addCourse() {
		System.out.println("In Dashboard!!");
		return new ModelAndView("courses");
	}
	
	@RequestMapping("/course_details")
	ModelAndView showAllCourses(){
		System.out.println("In Show Courses!!");
		
		return new ModelAndView("show_courses");
	}
	
	@RequestMapping("/notice")
	ModelAndView addNotice() {
		System.out.println("In Notice!!");
		return new ModelAndView("notice");
	}
	
	@RequestMapping("/leaveCategories")
	ModelAndView addLeaveCategories() {
		System.out.println("In leave_categories!!");
		return new ModelAndView("leave_category");
	}
	
	@RequestMapping("/trainingCategory")
	ModelAndView addTrainingCategories() {
		System.out.println("In trainingCategory!!");
		return new ModelAndView("training_category");
	}
	
	@RequestMapping("/bankDetails")
	ModelAndView addBankDetails() {
		System.out.println("In trainingCategory!!");
		return new ModelAndView("bank-details");
	}

	@RequestMapping("/addTrainer")
	ModelAndView addTrainer() {
		System.out.println("In addTrainer!!");
		return new ModelAndView("trainer");
	}
}
