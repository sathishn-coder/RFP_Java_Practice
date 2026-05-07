package construct.day5.practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4 digit year: ");
        int year = sc.nextInt();

        if (year < 1000 || year > 9999) {
            System.out.println("Invalid Year");
            return;
        }

        if ((year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is not a Leap Year");

	}

}
