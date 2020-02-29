package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ems.dto.DegreeDTO;
import com.ems.model.Degree;
import com.ems.service.DegreeService;

@RestController
public class DegreeController {
	
	@Autowired
	DegreeService degreeService;

	@RequestMapping("/degree")
	ModelAndView degree() {
		System.out.println("In degree");
		return new ModelAndView("degree");
	}
	
	@RequestMapping("/addDegree")
	ModelAndView addDegree(@ModelAttribute("degree") DegreeDTO degreeDto) {
		degreeService.addDegree(degreeDto);
		return new ModelAndView(new RedirectView("/degreeDetails",true));
	}
	
	@RequestMapping("/updateDegree")
	ModelAndView updateDegree(@RequestParam("degreeId") String degreeId) {
		ModelAndView modelAndView = new ModelAndView("degree");
		DegreeDTO degreeDto = degreeService.updateDegree(Long.parseLong(degreeId));
		modelAndView.addObject("degree",degreeDto);
		return modelAndView;
		
	}
	
	@RequestMapping("/degreeDetails")
	ModelAndView showDegrees() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("degree",degreeService.findAll());
		modelAndView.setViewName("show_degree");
		return modelAndView;
		
	}
	@RequestMapping("/deleteDegree")
	public ModelAndView deleteDegree(@RequestParam("degreeId") String degreId){
		degreeService.deleteDegree(Long.parseLong(degreId));
		return new ModelAndView(new RedirectView("/degreeDetails",true));
	}
	
}
