package construct.day4.practice;

public class Emp_UC3 {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
        int empWage = 0;

        int isEmployeePresent = getEmployeePresence();

        if (isEmployeePresent == Emp_UC1.IS_FULL_TIME) {
            empWage = Emp_UC2.calculateDailyEmployeeWage(Emp_UC1.FULL_DAY_HOUR);
        } else if (isEmployeePresent == Emp_UC1.IS_PART_TIME) {
            empWage = Emp_UC2.calculateDailyEmployeeWage(Emp_UC1.PART_TIME_HOUR);
        } else {
            empWage = 0;
        }
        System.out.println("Employee Wage Daily: " + empWage);

    }

    public static int getEmployeePresence() {
        return (int) (Math.random() * 3);
    }
}
