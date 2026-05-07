package construct.day4.practice;

public class Emp_UC4 {

	public static void main(String[] args) {
		 int empWage = 0;
	        int isEmployeePresent = Emp_UC3.getEmployeePresence();
	        switch (isEmployeePresent) {
	            case Emp_UC1.IS_FULL_TIME:
	                empWage = Emp_UC2.calculateDailyEmployeeWage(Emp_UC1.FULL_DAY_HOUR);
	                break;
	            case Emp_UC1.IS_PART_TIME:
	                empWage = Emp_UC2.calculateDailyEmployeeWage(Emp_UC1.PART_TIME_HOUR);
	                break;
	            default:
	                empWage = Emp_UC2.calculateDailyEmployeeWage(0);
	        }
	        System.out.println("Employee Wage Daily: " + empWage);

	}

}
