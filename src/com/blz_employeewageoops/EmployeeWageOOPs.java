package com.blz_employeewageoops;

import java.util.Random;

public class EmployeeWageOOPs {
	public static void main(String[] args) {
		Attendence attendence = new Attendence();
		attendence.empCheck();
	}
}
class Attendence {
	public static final int IS_PRESENT = 1;
	public static final int IS_ABSENT = 0;
	public void empCheck() {
		Random random = new Random();
		int emp = random.nextInt(2);
		switch(emp) {
		case IS_PRESENT: 
			System.out.println("Employee is present");
			break;
		case IS_ABSENT:
			System.out.println("Employee is absent");
			break;
		default:
			System.out.println("Welcome");
		}
	}
}


