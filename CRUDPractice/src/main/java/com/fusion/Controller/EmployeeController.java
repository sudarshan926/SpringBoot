package com.fusion.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fusion.dto.Employee;
import com.fusion.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	public EmployeeController() {
		System.out.println("Inside EmployeeController");
	}

	@PostMapping("/createemp")
	public Employee createEmployee(@RequestBody Employee e) {
		return employeeService.createEmployeeService(e);
	}

	@GetMapping("/getallemp")
	public Iterable<Employee> GetAllEmployee() {
		return employeeService.GetAllEmployeeService();
	}

	@GetMapping("/getempbyid/{aid}")
	public Employee GetAllById(@PathVariable("aid") int id) {
		return employeeService.getallemployeeById(id);
	}

	@DeleteMapping("/deleteemp/{aid}")
	public int DeleteEmployee(@PathVariable("aid") int id) {
		return employeeService.deleteEmployee(id);
	}
	
}