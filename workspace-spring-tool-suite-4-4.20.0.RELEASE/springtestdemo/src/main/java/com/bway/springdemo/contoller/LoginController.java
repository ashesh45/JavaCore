package com.bway.springdemo.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springdemo.model.User;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String getLogin() {
		
		return "LoginForm";
	}
	
	
	@PostMapping("/login")
	public String postlogin(@ModelAttribute User u,Model model) {
			if(u.getUsername().equals("admin") && u.getPassword().equals("admin")) {
				
				model.addAttribute("uname", u.getUsername());
				return "Home";
				
			}
			
			model.addAttribute("msg","Invalid username or password");
		
  return "LoginForm";
	}

}
