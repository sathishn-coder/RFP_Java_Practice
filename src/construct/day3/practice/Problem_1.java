package construct.day3.practice;

import java.util.ArrayList;
import java.util.List;

public class Problem_1 {

	// Constants
    static final int IS_PRESENT = 1;
    

    public static void main(String[] args) {

    	System.out.println("Welcome to Employee Wage Computation");

        int isEmployeePresent = getEmployeePresence();
        if (isEmployeePresent == IS_PRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    private static int getEmployeePresence() {
        return (int) (Math.random() * 2);
    }
}
