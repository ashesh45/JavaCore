package com.bway.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springdemo.model.Doctor;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String getLogin() {
		
		return "/login";
	}
	
	
	@PostMapping("/login")
	public String postlogin(@ModelAttribute Doctor d,Model model) {
			if(d.getUsername().equals("admin") && d.getPassword().equals("admin")) {
				
				model.addAttribute("uname", d.getUsername());
				return "home";
				
			}
			
			model.addAttribute("msg","Invalid username or password");
 		
             return "login";
	}
	

}
