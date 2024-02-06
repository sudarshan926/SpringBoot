package com.tech;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	public EmployeeController() {
		System.out.println("Inside EmployeeController");
	}
	
	@GetMapping("/get")
	public String EmployeeController1() {
		
		return "abcd";
	}
	
	@GetMapping("/url/{aid}")
	public int EmployeeController12(@PathVariable("aid")int Id) {
		System.out.println(Id);
		return Id ;
		
	}
	
	@GetMapping("/getemp")
	public Employee EmployeeGet( Employee e) {
		e.setId(1);
		e.setName("abcd");
		e.setCompany("zenser");
		e.setSallary(230000);
		System.out.println(e);
		return e;
		
	}
	
	@GetMapping("/getemp1")
	public Employee EmployeeGet2(@RequestBody Employee e) {
		
		System.out.println(e);
		return e;	
	}
	@RequestMapping("/getemp2")
	public Employee EmployeeGet3(@RequestBody Employee e) {
		
		System.out.println(e);
		return e;	
	}

	@PutMapping("/put")
	public Employee EmployeePut(@RequestBody Employee e) {
		System.out.println(e);	
		return e;
	}
	
	@PutMapping("/putemp/{aid}/{name}/{company}")
	public String EmployeePut1(@PathVariable("aid")int id,@PathVariable("name")String name,
			@PathVariable("company")String company) {
			System.out.println(id+" "+name+" "+company);
		return id+" "+name+" "+company;
	}
	
	@PostMapping("/postman")
	public Employee EmployeePost(@RequestBody Employee e) {
		System.out.println(e);
		return e;
	}
	
	@DeleteMapping("/deleteemp/{aid}")
	public int DeleteEmploee(@PathVariable("aid")int id) {
		System.out.println(id);
		return id;
	}
	
}
