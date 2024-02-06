package com.fusion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fusion.dao.StudentDAO;
import com.fusion.dto.Student;

@Service
public class StudentService {

	@Autowired
	StudentDAO studentDAO;
	public Student StudentService(Student s) {
		Student s1=studentDAO.save(s);
		System.out.println(s1);
		return s1;
	}
	public Iterable<Student> getAllStudentservice() {
		System.out.println("inside StudentService.getAllStudent started");
		Iterable<Student> stud=studentDAO.findAll();
		System.out.println("response from studentDAO.findAll() is "+stud);
		System.out.println("inside StudentService.getAllStudent ended");
		return stud;
	}
	public Optional<Student> getByIdstudentservice(int id) {
		Optional<Student> stud=studentDAO.findById(id);
		if(stud.isPresent()) {
			stud.get();
			System.out.println("founf Id--->"+id);
			return stud;
		}else {
			System.out.println("not found Id---->"+id);
			return  Optional.of(new Student());
		}	
	}
	
	public Student UpdateStudentService(Student stud, int a) {
		
		Optional<Student> stud1=studentDAO.findById(a);
		Student stdupdate =new Student();
		if(stud1.isPresent()) {
			Student existingStudent =stud1.get();
			System.out.println("existingStudent :"+existingStudent);
			
			if(stud.getId()==0) {
				stdupdate.setId(existingStudent.getId());
			}else {
				stdupdate.setId(stud.getId());
			}
			if(stud.getName()==null) {
				stdupdate.setName(existingStudent.getName());
			}else {
				stdupdate.setName(stud.getName());
			}
			if(stud.getCity()==null) {
				stdupdate.setCity(existingStudent.getCity());
			}else {
				
				  stdupdate.setCity(stud.getCity());
			}
		     Student updateDate=studentDAO.save(stdupdate);
		     System.out.println("updateDate :"+updateDate);
			return updateDate;
		}else {
			System.out.println(" in student not present id---->"+stud.getId());
			return new Student();
		}
	}
	
	public Iterable<Student> deleteStudentService(int id) {
	
		  studentDAO.deleteById(id);
		  Iterable<Student> stud=studentDAO.findAll();
			System.out.println(stud);
			return stud; 
	}
	
	public List<Student>  InsertStudentService(List<Student> s) {
		List<Student> sb=(List<Student>) studentDAO.saveAll(s);
		System.out.println("Save all"+sb);
		return sb;
	}
}
