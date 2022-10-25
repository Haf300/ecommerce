package com.cohort20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("inside index()");
		return "index";
	}
	
	@RequestMapping("/registrationPage")
	public String registration() {
		
		return "registrationPage";
	}
	
	@RequestMapping("/welcomePage")
	public String welcome() {
   
		return "welcomePage";
}
	
}	
	
	
	
	
	

