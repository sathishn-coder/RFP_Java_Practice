package oops.day10.practice;

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

    // Setter Method
    public void setTotalEmpWage(int totalEmpWage) {

        this.totalEmpWage = totalEmpWage;
    }

    // Getter Method
    public int getTotalEmpWage() {

        return totalEmpWage;
    }

    @Override
    public String toString() {

        return "Company Name : " + companyName
                + "\nTotal Employee Wage : "
                + totalEmpWage;
    }

}
