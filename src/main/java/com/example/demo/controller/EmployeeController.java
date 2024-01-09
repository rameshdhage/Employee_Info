package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployeeInfo( @RequestBody Employee employee){
		
		Employee employee1=employeeservice.saveEmployee(employee);
		
		return ResponseEntity.ok().body(employee1);
		
	}

	@GetMapping("/FindLeadByMobileNumber/{mobilenumber}")
	public Employee fetchLeadByMobileNumber(@PathVariable double mobilenumber) {
		
		return employeeservice.getLeadByMobileNumber(mobilenumber);
	}
}
