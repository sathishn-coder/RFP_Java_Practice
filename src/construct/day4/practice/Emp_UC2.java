package construct.day4.practice;

public class Emp_UC2 {
	public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 5;

    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int TOTAL_WORKING_HOURS = 100;
    public static final int TOTAL_WORKING_DAYS = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

        int empWage = 0;
        int isEmployeePresent = getEmployeePresence();

        if (isEmployeePresent == Emp_UC2.IS_FULL_TIME) {
            empWage = calculateDailyEmployeeWage(Emp_UC2.FULL_DAY_HOUR);
        } else {
            empWage = calculateDailyEmployeeWage(0);
        }
        System.out.println("Employee Wage Daily: " + empWage);
    }

    public static int calculateDailyEmployeeWage(int workingHours) {
        return workingHours * Emp_UC1.WAGE_PER_HOUR;
    }

    private static int getEmployeePresence() {
        return (int) (Math.random() * 2);
    }

	}


