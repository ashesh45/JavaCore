package com.bway.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
	
	@GetMapping("/")
	public String getIndex() {
		
		return "index";
		
	}

}
