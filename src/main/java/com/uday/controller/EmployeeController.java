package com.uday.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uday.model.Employee;

@RestController
public class EmployeeController {
	
	
	@GetMapping("/getEmployee")
	public Employee getEmployee() {
		Employee e1=Employee.builder().id(10).name("uday").address("Hyderabad").designation("SE").degree("BTech").build();
		
		return e1;
		
	}
}
 