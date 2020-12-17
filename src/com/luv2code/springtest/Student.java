package com.luv2code.springtest;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	@NotNull(message="is required")
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1 ,message="is required")
	private String lastName;
	
	
	private String gender;
	
	@NotNull(message="is required")
	@Min(value=18 , message="Must be greater than or equal to 18")
	@Max(value=27 , message="Must be lesser than or equal to 27")
	private int age;
	
//	@Pattern(regexp="[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message="Format is Invalid")
	private String email;
	
	private String[] SubjectInterest;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getSubjectInterest() {
		return SubjectInterest;
	}
	public void setSubjectInterest(String[] subjectInterest) {
		SubjectInterest = subjectInterest;
	}
	

}
