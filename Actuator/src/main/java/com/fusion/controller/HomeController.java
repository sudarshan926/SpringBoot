package com.fusion.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fusion.test.Student;

@RestController
public class HomeController {

	@Autowired
	 private Student stud;
	
	@RequestMapping("/get")
	public Map<String, String> GetStudent(){
		return Map.of("sudarshan","Surnar");	
	}
}
