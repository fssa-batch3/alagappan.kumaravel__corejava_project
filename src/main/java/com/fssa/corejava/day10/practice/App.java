package com.fssa.corejava.day10.practice;

public class App {

	public static void main(String[] args) {
		try {
			User user1 = new User("Alagappan", "alagappan@gmail.com", 1);
			User user2 = new User("Alagappan k", "alagappan@gmail.com", 2);// same email
			User user3 = new User("Praveen", "praveengmail.com", 3);// invalid email

			UserValidator.register(user1); 
			UserValidator.register(user2); 
			UserValidator.register(user3); 
		} catch (UserAlreadyExistsException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InvalidEmailException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
