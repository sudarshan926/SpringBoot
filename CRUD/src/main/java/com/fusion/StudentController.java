package com.fusion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fusion.dao.StudentDao;
import com.fusion.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	public StudentController() {
		System.out.println("Inside Student Controller");	
	}
	

	@RequestMapping("/login")
   public String StudentMapping() {
	return "Hello_Developer";
		
	}

	
	@PostMapping("/create")
	public Student CreateStudent(@RequestBody Student s) {
	System.out.println("Inside CreateStudent");
	Student s1=	service.studentInsertservice(s);
	System.out.println(s1);
		return s1;
	}
	
	@GetMapping("/getall")
	public Iterable<Student>GetAllStudent() {
		System.out.println("Inside GetAllStudent");
		 Iterable<Student> stud= service.GetAllService();
		return  stud;
	}
	
	@GetMapping("/getfind/{aid}")
	public Student GetAllByID(@PathVariable("aid")int id) {
		
	    Student stud =service.getAllByIdService(id);
	    System.out.println(stud);
		return stud;
		
	}
}
