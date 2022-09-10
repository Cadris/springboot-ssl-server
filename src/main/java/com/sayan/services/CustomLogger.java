package com.sayan.services;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Service
public class CustomLogger {

	public void log(String data) {
		System.out.println(ServletUriComponentsBuilder.fromCurrentRequestUri().toUriString()+": "+data);
	}
	
	public void log() {
		log("");
	}
}
