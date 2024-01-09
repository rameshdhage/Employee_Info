package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeerepo;
	
	
	public Employee saveEmployee( Employee employee) {
		
		return employeerepo.save(employee);
		
	}
	
	public Employee getLeadByMobileNumber(double mobilenumber) {
		
	return	employeerepo.findBymobilenumber(mobilenumber);
	}

}
