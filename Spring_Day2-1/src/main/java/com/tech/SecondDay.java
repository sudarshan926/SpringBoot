package com.tech;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondDay {
	
	public SecondDay() {
		System.out.println("Inside constructor");
	}
	
	@RequestMapping("/login")
	public String Index() {
		
		return "index.jsp";
	}
	
}
