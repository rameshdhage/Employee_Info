package com.example.demo.entity;


import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee123")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty
	int LeadId ;
	
    @NotNull
    @Pattern(regexp = "^[a-zA-Z]+$", message = "First name must contain only alphabets")
    String firstname;
    
    @Pattern(regexp = "^[a-zA-Z]*$", message = "Middle name must contain only alphabets")
    String middlename;
	
    @NotNull
    @Pattern(regexp = "^[a-zA-Z]+$", message = "First name must contain only alphabets")
	String lastname;
    
    @NotNull
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Mobile number must contain only digits, with the first digit greater than 5")
    double mobilenumber;
    
    @NotNull
    @Pattern(regexp = "^(Male|Female|Others)$", message = "Gender must be Male, Female, or Others")
	String Gender;
    
    @NotNull
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    Date DOB;
    
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    String email;

	public int getLeadId() {
		return LeadId;
	}

	public void setLeadId(int leadId) {
		LeadId = leadId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(double mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
