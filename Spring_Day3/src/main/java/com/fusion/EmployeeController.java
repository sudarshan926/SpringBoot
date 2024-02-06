package com.fusion;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	 public EmployeeController() {
		System.out.println("Inside Employee");
	}
	 
	 @RequestMapping("/hii")
	 public Employee Employee(Employee e) {
		
		 e.setFname("Vikas");
		 e.setLname("Rahul");
		System.out.println(e);
		return e; 
	 }
	 
	@GetMapping("/hii1")
	 public Employee Employee1(Employee e) {
		 new Employee();
		 e.setFname("Vikas");
		 e.setLname("Rahul");
		System.out.println(e);
		return e; 
	 }
	@DeleteMapping("/delete/{aid}")
	public void Delete(@PathVariable("aid")int id) {
		System.out.println(id);
	}
	@DeleteMapping("/deleteemp")
	public void DeleteParam(@RequestParam("aid")int id) {
		System.out.println(id);
	}
	@PutMapping("/update")
	public Employee PutEmployee(@RequestBody Employee e) {
		
		System.out.println(e);
		return e;
	}
	@PostMapping("/create")
	public Employee PostEmployee(@RequestBody Employee e) {
		System.out.println(e);
		
		return e;	
	}
	
}
