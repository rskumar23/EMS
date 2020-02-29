package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ems.model.Role;
import com.ems.service.RoleService;

@RestController 
public class RoleController {

	@Autowired
	RoleService roleService;
	
	@RequestMapping("/roles")
	ModelAndView roles() {
		System.out.println("In Roles!!");
		return new ModelAndView("roles");
	}
	
	@RequestMapping("/addRoles")
	ModelAndView addRoles(@ModelAttribute("role") Role role) {
		System.out.println(role);
		roleService.addRoles(role);
		return new ModelAndView("roles");
	}
}
