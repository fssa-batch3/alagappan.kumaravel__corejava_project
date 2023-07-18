package com.fssa.corejava.day05.practice;

public class StudentDepartment {

	public static void main(String[] args) {

		Department dept = new Department("Fwsa", 001);
		
		Student std = new Student("Alagappan", 1100, dept);
		System.out.print(std.toString());

	}

}
