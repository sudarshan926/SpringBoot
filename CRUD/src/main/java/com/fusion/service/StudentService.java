package com.fusion.service;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fusion.Student;
import com.fusion.dao.StudentDao;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	public StudentService() {
		System.out.println("inside student.StudentService");
	}

	public Student studentInsertservice(Student s) {
		Student s1=dao.save(s);
		System.out.println(s1);
		return s1;
	}


	@Autowired
	StudentDao studentDao;
	public Iterable<Student> GetAllService() {
		Iterable<Student>stud=studentDao.findAll();
		return stud;
	}

	
	public Student getAllByIdService(int id) {
		
		java.util.Optional<Student> s1=studentDao.findById(id);
		
		if(s1.isPresent()) {
			System.out.println("Is Present :"+id);
			Student s2=s1.get();
			System.out.println(s2);
			return s2;
		}else {
			System.out.println("Is Not Present :"+id);
			return new Student();
		}
		
	}


}
