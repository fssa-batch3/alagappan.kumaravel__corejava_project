package com.fssa.corejava.day10.practice;

import java.util.ArrayList;

public class UserValidator {
	static ArrayList<User> arr = new ArrayList<User>();
	public static boolean register(User user) throws UserAlreadyExistsException, InvalidEmailException{
		if (user == null) {
			throw new UserAlreadyExistsException("User Object Cannot be Null");
		}
		EmailValidator.isValidEmail(user.getEmailId());

		for (User element : arr) {
			if (element.getEmailId() == user.getEmailId()) {
				throw new UserAlreadyExistsException("User already added");
			}
		}

		arr.add(user);
		return true;
	}
}
