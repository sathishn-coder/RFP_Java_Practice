package oops.day9.practice;

import java.util.ArrayList;

public class CompanyEmpWage {


	    // Instance Variables
	    String companyName;

	    int empRatePerHour;

	    int numOfWorkingDays;

	    int maxHoursPerMonth;

	    int totalEmpWage;

	    // Collection for Daily Wages
	    ArrayList<Integer> dailyWages =
	            new ArrayList<>();

	    // Constructor
	    public CompanyEmpWage(String companyName,
	                          int empRatePerHour,
	                          int numOfWorkingDays,
	                          int maxHoursPerMonth) {

	        this.companyName = companyName;

	        this.empRatePerHour = empRatePerHour;

	        this.numOfWorkingDays = numOfWorkingDays;

	        this.maxHoursPerMonth = maxHoursPerMonth;
	    }

}
