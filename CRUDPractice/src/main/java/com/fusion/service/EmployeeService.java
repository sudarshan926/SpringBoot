package com.fusion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fusion.dao.EmployeeDao;
import com.fusion.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public EmployeeService() {
		System.out.println("Inside EmployeeService");
	}
	
	public Employee createEmployeeService(Employee e) {

		Employee e1 = dao.save(e);
		System.out.println(e1);
		return e1;
	}
	public Iterable<Employee> GetAllEmployeeService() {
		Iterable<Employee> e1 = dao.findAll();
		System.out.println(e1);
		return e1;

	}
	public Employee getallemployeeById(int id) {
		Optional<Employee> emp = dao.findById(id);
		if (emp.isPresent()) {
			Employee e3 = emp.get();
			System.out.println("Employee is present :" + id);
			return e3;
		} else {
			System.out.println("employee is not present :" + id);
			return new Employee();
		}
	}
	public int deleteEmployee(int id) {

		if (dao.existsById(id)) {
			dao.deleteById(id);
			System.out.println("Employee deleted---->" + id);
			return id;
		} else {
			System.out.println("Employee not Deleted--->" + id);
			return 0;
		
		}
	}
}
