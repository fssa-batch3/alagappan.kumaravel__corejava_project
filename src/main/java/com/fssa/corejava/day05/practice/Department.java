package com.fssa.corejava.day05.practice;

class Department {
	String deptName;
	
	int deptId;
	
	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}
	public void printDepartmentDetails() {
		System.out.println("Department name: " + this.deptName);
		System.out.println("Dept id: " + this.deptId);
	}
	
	@Override
	public String toString() {
		return "deptName=" + deptName + ", deptId=" + deptId;
	}
	
}
