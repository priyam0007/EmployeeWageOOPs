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
	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;
	public static int empHrs;
	public void empCheck() {
		Random random = new Random();
		int empCheck = random.nextInt(3);
		switch(empCheck) {
		case IS_FULLTIME:
			System.out.println("Employee is present and worked full-time");
			empHrs = 8;
			break;
		case IS_PARTTIME:
			System.out.println("Employee is present and worked part-time");
			empHrs = 4;
			break;
			
		default:
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