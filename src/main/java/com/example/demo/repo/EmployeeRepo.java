package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepo  extends CrudRepository<Employee, Integer>{
	

	public Employee findBymobilenumber(double mobilenumber);

}
