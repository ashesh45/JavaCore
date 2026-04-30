package com.bway.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springdemo.model.Doctor;



@Controller
public class SignUpController {



	@GetMapping("/signup")
	public String getSignup() {
		
		return "Signup";
	}

	
	@PostMapping("/signup")
	public String postsignup(@ModelAttribute Doctor u, Model model) {

	    if (u.getName() != null && !u.getName().isEmpty() &&
	        u.getEmail() != null && !u.getEmail().isEmpty() &&
	        u.getUsername() != null && !u.getUsername().isEmpty() &&
	        u.getPassword() != null && !u.getPassword().isEmpty()) {
	    	

//            model.addAttribute("doctor",u);
//            return "doctor";
	    	
	        model.addAttribute("msg1", "Signup successful! Please login.");
	        return "login";
	    } else {
	        model.addAttribute("msg", "All fields are required");
	        return "signup";
	    }
	}
}
