package com.fssa.corejava.day10.practice;

class EmailValidator {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		if(emailId == null) {
			throw new InvalidEmailException("Invalid email input");
		}
		if(!emailId.trim().isEmpty()) {
			throw new InvalidEmailException("Invalid email input");
		}
		if(!emailId.contains("@")) {
			throw new InvalidEmailException("Invalid email input");
		}
		return true;
	}
}