package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

@RestController               // @restcontroller=@Controller+@ResponseBody
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value={"/","/login"})
	ModelAndView login() {
		System.out.println("In Login Form!");
		return new ModelAndView("login");
	}
	
	@RequestMapping("/dashboard")
	ModelAndView showDashboard() {
		System.out.println("In Dashboard!!");
		return new ModelAndView("home");
	}
	
	@RequestMapping("/employee")
	ModelAndView employee() {
		System.out.println("In Dashboard!!");
		return new ModelAndView("employee");
	}
	@RequestMapping("/saveEmployee")
	ModelAndView addEmployee(@ModelAttribute("emp") Employee emp) {
		employeeService.addEmployee(emp);
		return new ModelAndView("home");
	}
	
	@RequestMapping("/employee_details")
	ModelAndView showAllEmployee() {
		System.out.println("In Dashboard!!");
		return new ModelAndView("show_employee");
	}
	
	@RequestMapping("/addDesignation")
	ModelAndView addDesignation() {
		System.out.println("In Dashboard!!");
		return new ModelAndView("designation");
	}
	
	@RequestMapping("/addLeaveCategories")
	ModelAndView addLeaveCategories() {
		System.out.println("In leave_categories!!");
		return new ModelAndView("leave_category");
	}
	
	@RequestMapping("/addTrainer")
	ModelAndView addTrainer() {
		System.out.println("In addTrainer!!");
		return new ModelAndView("trainer");
	}
	
	@RequestMapping("/addTrainingCategory")
	ModelAndView addTrainingCategories() {
		System.out.println("In trainingCategory!!");
		return new ModelAndView("training_category");
	}

	
	@RequestMapping("/addBankDetails")
	ModelAndView addBankDetails() {
		System.out.println("In trainingCategory!!");
		return new ModelAndView("bank-details");
	}

	
}
