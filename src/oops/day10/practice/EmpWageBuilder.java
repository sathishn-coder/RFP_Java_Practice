package oops.day10.practice;

import java.util.ArrayList;
import java.util.Random;

public class EmpWageBuilder implements IEmpWageBuilder {

    // Constants
    public static final int IS_ABSENT = 0;

    public static final int IS_PART_TIME = 1;

    public static final int IS_FULL_TIME = 2;

    // ArrayList for Multiple Companies
    ArrayList<CompanyEmpWage> companyList =
            new ArrayList<>();

    // Add Company Method
    @Override
    public void addCompanyEmpWage(
            String companyName,
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

    // Method to compute wage for company
    private void computeCompanyWage(
            CompanyEmpWage company) {

        int totalEmpHours = 0;

        int totalWorkingDays = 0;

        Random random = new Random();

        System.out.println("\n==========================");

        System.out.println(
                "Company : " + company.companyName);

        // Wage Calculation
        while (totalEmpHours
                <= company.maxHoursPerMonth
                && totalWorkingDays
                < company.numOfWorkingDays) {

            totalWorkingDays++;

            int empHours = 0;

            int empCheck = random.nextInt(3);

            // Switch Case
            switch (empCheck) {

                case IS_PART_TIME:

                    empHours = 4;

                    System.out.println(
                            "Day " + totalWorkingDays
                                    + " : Part Time");

                    break;

                case IS_FULL_TIME:

                    empHours = 8;

                    System.out.println(
                            "Day " + totalWorkingDays
                                    + " : Full Time");

                    break;

                default:

                    empHours = 0;

                    System.out.println(
                            "Day " + totalWorkingDays
                                    + " : Absent");
            }

            totalEmpHours += empHours;

            // Daily Wage
            int dailyWage =
                    empHours
                            * company.empRatePerHour;

            // Store Daily Wage
            company.dailyWages.add(dailyWage);

            System.out.println(
                    "Daily Wage : " + dailyWage);

            System.out.println(
                    "Total Hours : " + totalEmpHours);

            System.out.println("----------------------");
        }

        // Total Wage
        int totalWage =
                totalEmpHours
                        * company.empRatePerHour;

        company.setTotalEmpWage(totalWage);

        System.out.println(
                "\nTotal Wage : " + totalWage);

        // Display Daily Wages
        System.out.println("\nDaily Wages");

        for (int wage : company.dailyWages) {

            System.out.println(wage);
        }
    }

    // Compute Wages for all companies
    @Override
    public void computeEmpWage() {

        for (CompanyEmpWage company
                : companyList) {

            computeCompanyWage(company);
        }
    }

    // Get Total Wage by Company Name
    @Override
    public int getTotalWage(
            String companyName) {

        for (CompanyEmpWage company
                : companyList) {

            if (company.companyName
                    .equalsIgnoreCase(companyName)) {

                return company.getTotalEmpWage();
            }
        }

        return 0;
    }
}
