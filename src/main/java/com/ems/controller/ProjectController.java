package com.ems.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProjectController {
	
	@RequestMapping("/addProject")
	ModelAndView addProject() {
		System.out.println("In addTrainer!!");
		return new ModelAndView("project");
	}

}
