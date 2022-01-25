package com.NepalCode.SpringDependency;

public class Student {
	
	private String studentName; // dependency in the form of literals
	private int stuid; // dependency in the form of literals
	
	// there are two types of dependency injection: constructor and setter injection
	
	public Student(String studentName, int stuid) {
		this.studentName = studentName;
		this.stuid = stuid;
		
	}
	
	public Student(int stuid) {
		this.stuid= stuid;
	}
	
	
	
	public void displayInfo() {
		System.out.println("Student name is: " + studentName +  " student id is: " + stuid);
		
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	
	

}
