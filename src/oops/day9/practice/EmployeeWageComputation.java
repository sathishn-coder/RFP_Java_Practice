package oops.day9.practice;

import java.util.ArrayList;
import java.util.Random;

public class EmployeeWageComputation {

    // Constants
    public static final int IS_ABSENT = 0;
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    // Collection to store company wages
    ArrayList<CompanyEmpWage> companyList =
            new ArrayList<>();

    // Method to add company details
    public void addCompany(String companyName,
                           int empRatePerHour,
                           int numOfWorkingDays,
                           int maxHoursPerMonth) {

        CompanyEmpWage company =
                new CompanyEmpWage(
                        companyName,
                        empRatePerHour,
                        numOfWorkingDays,
                        maxHoursPerMonth);

        companyList.add(company);
    }

    // Method to compute wages for all companies
    public void computeWages() {

        for (CompanyEmpWage company : companyList) {

            int totalEmpHours = 0;
            int totalWorkingDays = 0;

            Random random = new Random();

            System.out.println("\n================================");

            System.out.println("Company Name : "
                    + company.companyName);

            while (totalEmpHours <= company.maxHoursPerMonth
                    && totalWorkingDays < company.numOfWorkingDays) {

                totalWorkingDays++;

                int empHours = 0;

                // Random Attendance
                int empCheck = random.nextInt(3);

                // Switch Case
                switch (empCheck) {

                    case IS_PART_TIME:

                        empHours = 4;

                        System.out.println(
                                "Day " + totalWorkingDays
                                        + " : Part Time Employee");

                        break;

                    case IS_FULL_TIME:

                        empHours = 8;

                        System.out.println(
                                "Day " + totalWorkingDays
                                        + " : Full Time Employee");

                        break;

                    default:

                        empHours = 0;

                        System.out.println(
                                "Day " + totalWorkingDays
                                        + " : Employee Absent");
                }

                totalEmpHours += empHours;

                int dailyWage =
                        empHours * company.empRatePerHour;

                company.dailyWages.add(dailyWage);

                System.out.println(
                        "Daily Wage : " + dailyWage);

                System.out.println(
                        "Total Hours : " + totalEmpHours);

                System.out.println("----------------------------");
            }

            // Calculate Total Wage
            company.totalEmpWage =
                    totalEmpHours * company.empRatePerHour;

            // Final Output
            System.out.println("\nTotal Working Days : "
                    + totalWorkingDays);

            System.out.println("Total Working Hours : "
                    + totalEmpHours);

            System.out.println("Total Employee Wage : "
                    + company.totalEmpWage);

            // Display Daily Wages
            System.out.println("\nDaily Wages");

            for (int wage : company.dailyWages) {

                System.out.println(wage);
            }
        }
    }

    // Main Method
    public static void main(String[] args) {

        System.out.println(
                "Welcome to Employee Wage Computation Program");

        EmployeeWageComputation employee =
                new EmployeeWageComputation();

        // Add Multiple Companies
        employee.addCompany(
                "TCS", 20, 20, 100);

        employee.addCompany(
                "Infosys", 25, 22, 120);

        employee.addCompany(
                "Wipro", 30, 25, 140);

        // Compute Wages
        employee.computeWages();
    }
}
