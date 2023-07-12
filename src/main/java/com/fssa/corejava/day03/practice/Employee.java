package com.fssa.corejava.day03.practice;

public class Employee {

	private int id;
    private String name;
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");
    
        User user1 = new User("Alagappan", "Aa1add", "alagappan@gmail.com");
        System.out.println(user1.toString());
        System.out.println("id="+ e1.id + ", " + "name=" + e1.name);
        System.out.println("id="+ e2.id + ", " + "name=" + e2.name);

    }
	
}