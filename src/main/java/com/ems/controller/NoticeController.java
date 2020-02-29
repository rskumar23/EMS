package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.ems.dto.NoticeDTO;
import com.ems.model.Employee;
import com.ems.model.Notice;
import com.ems.service.NoticeService;

@RestController
public class NoticeController {
	
	@Autowired
	NoticeService noticeService;
	
	@RequestMapping("/notice")
	ModelAndView notice() {
		System.out.println("In Notice!!");
		return new ModelAndView("notice");
	}
	
	@RequestMapping("/addNotice")
	ModelAndView addNotice(@ModelAttribute("notice") NoticeDTO noticeDto) {
		System.out.println("In addNotice >>" + noticeDto.getId() +" "+noticeDto.getNoticeTitle());
		noticeService.addNotice(noticeDto);
		return new ModelAndView(new RedirectView("/notice_details",true));
	}
	
	@RequestMapping("/notice_details")
	public ModelAndView showNotices() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("notices",noticeService.findAll());
		modelAndView.setViewName("show_notices");
		return modelAndView;
	}
	
	@RequestMapping("/updateNotice")
	public ModelAndView updateNotice(@RequestParam("noticeId") String noticeId) {
		ModelAndView modelAndView = new ModelAndView("notice");
		NoticeDTO noticeDto = noticeService.updateNotice(Long.parseLong(noticeId));
		modelAndView.addObject("notice",noticeDto);
		return modelAndView;
	}
	
	@RequestMapping("/deleteNotice")
	public ModelAndView deleteNotice(@RequestParam("noticeId") String noticeId,RedirectAttributes redirect) {
		//ModelAndView modelAndView = new ModelAndView();
		noticeService.deleteNotice(Long.parseLong(noticeId));
		//modelAndView.setViewName("show_notices");
		return new ModelAndView(new RedirectView("/notice_details",true));
	}
	

}
