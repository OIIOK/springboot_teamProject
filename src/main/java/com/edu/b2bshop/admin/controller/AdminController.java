package com.edu.b2bshop.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@GetMapping("/admin")
	public ModelAndView getMain() {
		ModelAndView mav= new ModelAndView("admin/index");
		return mav;
	}
}
