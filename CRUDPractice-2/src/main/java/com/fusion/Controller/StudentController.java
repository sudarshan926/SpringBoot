package com.fusion.Controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fusion.dto.Student;
import com.fusion.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	public StudentController() {
		System.out.println("Inside StudentController");
	}
	
	
	@PostMapping("/put")
	public Student CreateStudent(@RequestBody Student s) {
		Student s1=studentService.StudentService(s);
		return s1;
	}
	
	@PostMapping("/postall")
	public List<Student> InsertAllStudent(@RequestBody List<Student> s) {
		List<Student> s1=studentService.InsertStudentService(s);
		return s1;	
	}
	
	@GetMapping("/get")
	public Iterable<Student> getAllStudent(){
		System.out.println("inside StudentController.getAllStudent started");
		Iterable<Student> stud=studentService.getAllStudentservice();
		System.out.println("response from studentService.getAllStudentservice() is "+stud);
		System.out.println("inside StudentController.getAllStudent ended");
		return stud;
	}
	
	@GetMapping("/getbyid/{eid}")
	public Optional<Student> getByIdStudent(@PathVariable("eid")int id) {
		Optional<Student> stud=	studentService.getByIdstudentservice(id);
		return stud;
	}
	@PutMapping("/put/{eid}")
	public Student Updatestudent(@RequestBody Student stud,@PathVariable("eid") int a) {
	Student stud1=studentService.UpdateStudentService(stud, a);	
	System.out.println(stud1);
	return stud1;
	}
	
	@DeleteMapping("/delete/{id}")
	public Iterable<Student> deleteByIdstudent(@PathVariable int id) {
		Iterable<Student> std= studentService.deleteStudentService(id);
		return std;
	}

}
