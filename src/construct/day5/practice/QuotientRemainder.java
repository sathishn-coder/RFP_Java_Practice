package construct.day5.practice;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

	}

}
