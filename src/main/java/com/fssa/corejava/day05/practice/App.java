package com.fssa.corejava.day05.practice;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Account myAccount1 = new Account();
		myAccount1.setBalance(5500.00d);
		AxisAccount myAxisAccount = new AxisAccount();
		myAxisAccount.withdraw(myAccount1, 70.00d);
		System.out.println("AXIS : "+myAccount1.getBalance());
		
		Account myAccount2 = new Account();
		myAccount2.setBalance(10500.00d);
		IciciAccount myIciciAccount = new IciciAccount();
		myIciciAccount.withdraw(myAccount2, 70.00d);
		System.out.println("ICICI : "+myAccount2.getBalance());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
