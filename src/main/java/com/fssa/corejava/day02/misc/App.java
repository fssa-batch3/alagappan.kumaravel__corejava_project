package com.fssa.corejava.day02.misc;

public class App {
	public static void main(String[] args) {
		
		Academy academy = new Academy();
		academy.setAcademyName("FreshWorks Software Academy");
		academy.setCode("A100");
		academy.setId(001);
		
		Student std1 = new Student();
		std1.setId(001);
		std1.setName("Alagappan");
		std1.setEmail("alagappan@gmail.com");
		
		System.out.println(Student.count);
		
		Student std2 = new Student();
		std2.setId(002);
		std2.setName("Praveen");
		std2.setEmail("praveen@gmail.com");
		System.out.println(Student.count);
	}
}
