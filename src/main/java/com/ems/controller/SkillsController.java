package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ems.dto.SkillsDTO;
import com.ems.model.Skills;
import com.ems.service.SkillService;

@RestController
public class SkillsController {
	
	@Autowired
	SkillService skillsService;
	
	@RequestMapping("/skills")
	ModelAndView skills() {
		System.out.println("In skill!!");
		return new ModelAndView("skills");
	}
	
	@RequestMapping("/addSkills")
	ModelAndView addSkills(@ModelAttribute("skills") Skills skills) {
		skillsService.addSkillls(skills);
		return new ModelAndView(new RedirectView("/showAllSkills", true));
	}
	
	@RequestMapping("/showAllSkills")
	ModelAndView showAllSkills() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("skills", skillsService.findAll());
		modelAndView.setViewName("show_skills");
		return modelAndView;
	}
	
	@RequestMapping("/updateSkills")
	ModelAndView updateSkills(@RequestParam("skillId") String skillId) {
		ModelAndView modelAndView = new ModelAndView("skills");
		SkillsDTO skillsDTO = skillsService.updateSkills(Long.parseLong(skillId));
		modelAndView.addObject("skills",skillsDTO);
		return modelAndView;
	}
	
	@RequestMapping("deleteSkills")
	ModelAndView deleteSkills(@RequestParam("skillId") String skillId) {
		skillsService.deleteSkills(Long.parseLong(skillId));
		return new ModelAndView(new RedirectView("/showAllSkills",true));
	}

}
