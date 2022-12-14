package com.sayan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sayan.services.CustomLogger;
import com.sayan.services.Global;

@RestController
@RequestMapping("/api")
public class Rest_Welcome {
	
	@Value("${application.author.firstname}")
	private String myFistName;
	
	@Value("${application.author.lastname}")
	private String myLastName;
	
	@Autowired
	CustomLogger logger;
	
	@GetMapping({ "/", "/welcome" })
	public ResponseEntity<?> welcome() {
		logger.log(Global.GET_REQUEST);
		return new ResponseEntity<>("Hi From "+myFistName+" "+myLastName, HttpStatus.OK);
	}
	
}
