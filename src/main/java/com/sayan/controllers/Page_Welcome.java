package com.sayan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sayan.services.CustomLogger;
import com.sayan.services.Global;

@Controller
@RequestMapping("/")
public class Page_Welcome {
	
	@Value("${application.author.firstname}")
	private String myFistName;
	
	@Value("${application.author.lastname}")
	private String myLastName;
	
	@Autowired
	CustomLogger logger;

	@GetMapping({"/", "/page"})
	public String welcomePage(Model model) {
		logger.log(Global.GET_REQUEST);
		
		model.addAttribute("myFirstName", this.myFistName);
		model.addAttribute("myLastName", this.myLastName);
		
		return "welcome";
	}
	
}
