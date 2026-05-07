package construct.day3.practice;

import java.util.ArrayList;
import java.util.List;

public class Problem_1 {

	// Constants
    static final int IS_PRESENT = 1;
    static final int IS_PART_TIME = 2;

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;

    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        int totalSalary = 0;

        List<Integer> dailyWages = new ArrayList<>();

        while (totalEmpHours < MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) { // 0< 100 && 0 < 20

            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 3); // 0,1,2
            int empHours = 0;

            switch (empCheck) {
                case IS_PRESENT:
                    empHours = FULL_DAY_HOURS;
                    break;

                case IS_PART_TIME:
                    empHours = PART_TIME_HOURS;
                    break;

                default:
                    empHours = 0; // Absent
            }

            totalEmpHours += empHours;

            int dailyWage = empHours * WAGE_PER_HOUR;
            totalSalary += dailyWage;

            dailyWages.add(dailyWage);

            System.out.println("Day " + totalWorkingDays +
                    " | Hours: " + empHours +
                    " | Daily Wage: " + dailyWage);
        }

        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalEmpHours);
        System.out.println("Total Salary: " + totalSalary);

        System.out.println("\nDaily Wages List:");
        for (int wage : dailyWages) {
            System.out.print(wage + " ");
        }
    }

}
