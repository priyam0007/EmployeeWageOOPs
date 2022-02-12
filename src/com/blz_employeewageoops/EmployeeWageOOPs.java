package com.blz_employeewageoops;

import java.util.Random;

public class EmployeeWageOOPs {
	
	public static void main(String[] args) {
			EmpCalculation emp = new EmpCalculation();
			emp.empCheck();
			DailyWage wage = new DailyWage();
			wage.dailyWageCalculation();
		}
	}
	class EmpCalculation {
		public static int empHrs;
		public void empCheck() {
			Random random = new Random();
			int empCheck = random.nextInt(2);
			if(empCheck == 1) {
				System.out.println("Employee is present");
				empHrs = 8;
			}
			else{
				System.out.println("Employee is absent");
			}
		}
	}
	class DailyWage{
		public static final int WAGE_PER_HOUR = 20;
		
		public void dailyWageCalculation() {
		int totalDailyWage = EmpCalculation.empHrs * WAGE_PER_HOUR;
		System.out.println("Daily employee wage is "+totalDailyWage);
		}
	}