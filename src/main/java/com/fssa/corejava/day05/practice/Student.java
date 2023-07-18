package com.fssa.corejava.day05.practice;

class Student {
	String name;
	int id;
	Department department;
	
	// Create a constructor and assign department and respective attributes
	
	
	public Student(String name, int id, Department department) {
		
		this.name = name;
		this.id = id;
		this.department = department;
		
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", department details = " + this.department.toString() + "]";
	}
	
}
