package oops.day8.practice;

import java.util.ArrayList;
import java.util.Random;

public class Emp_UC7 {
	
	// Class Variables
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static final int EMP_RATE_PER_HOUR = 20;

    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    // Method to compute employee wage
    public void computeEmployeeWage() {

        // Welcome Message
        System.out.println("Welcome to Employee Wage Computation Program");

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalSalary = 0;

        // Collection to store daily wages
        ArrayList<Integer> dailyWages = new ArrayList<>();

        Random random = new Random();

        // Calculate wages till condition reaches
        while (totalEmpHrs <= MAX_HRS_IN_MONTH
                && totalWorkingDays < NUM_OF_WORKING_DAYS) {

            totalWorkingDays++;

            // Random attendance
            int empCheck = random.nextInt(3);

            // Switch Case
            switch (empCheck) {

                case IS_PART_TIME:

                    empHrs = 4;

                    System.out.println("Day " + totalWorkingDays
                            + " : Employee is Part Time");

                    break;

                case IS_FULL_TIME:

                    empHrs = 8;

                    System.out.println("Day " + totalWorkingDays
                            + " : Employee is Full Time");

                    break;

                default:

                    empHrs = 0;

                    System.out.println("Day " + totalWorkingDays
                            + " : Employee is Absent");
            }

            // Total Hours
            totalEmpHrs += empHrs;

            // Daily Wage
            int dailyWage = empHrs * EMP_RATE_PER_HOUR;

            // Store in Collection
            dailyWages.add(dailyWage);

            // Total Salary
            totalSalary += dailyWage;

            System.out.println("Daily Wage : " + dailyWage);
            System.out.println("Total Hours : " + totalEmpHrs);
            System.out.println("--------------------------------");
        }

        // Final Output
        System.out.println("\nTotal Working Days : "
                + totalWorkingDays);

        System.out.println("Total Employee Hours : "
                + totalEmpHrs);

        System.out.println("Total Employee Salary : "
                + totalSalary);

        // Print Collection
        System.out.println("\nDaily Wages List");

        for (int wage : dailyWages) {

            System.out.println(wage);
        }
    }

    // Main Method
    public static void main(String[] args) {

        // Object Creation
        Emp_UC7 employee =
                new Emp_UC7();

        // Method Call
        employee.computeEmployeeWage();
    }

}
