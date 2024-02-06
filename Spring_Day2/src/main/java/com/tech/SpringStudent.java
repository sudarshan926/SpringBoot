package com.tech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringStudent {
	
	public SpringStudent() {
		System.out.println("inside SpringStudent");
	}

	@RequestMapping("/hi")
	public String GetName() {
		return "Developer";
	}
	
	@GetMapping("/hi1")
	public String GetName1(){
		return "Hello GetMapping  ";	
	}
	
	@PostMapping("/create")
	public Student GetName2(@RequestBody Student s) {
	
		return s;
		
	}
}
