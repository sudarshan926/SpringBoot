package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	public StudentController() {
		System.out.println("Inside StudentController");
	}

	@RequestMapping("/hi")
	public String GetName() {
		
		return "Developer";	
	}

	@RequestMapping("/hi1/{fname}/{lname}")
	public String GetName1(@PathVariable String Fname, @PathVariable String Lname ) {
		
		   return "Fname "+Fname+" "+"Lname "+Lname;
	}
}
