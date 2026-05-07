package construct.day2.practice;

import java.util.Scanner;

public class Arithmeticoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a: ");
	        int a = sc.nextInt();

	        System.out.print("Enter b: ");
	        int b = sc.nextInt();

	        System.out.print("Enter c: ");
	        int c = sc.nextInt();

	        System.out.println("a + b * c = " + (a + b * c));
	        System.out.println("c + a / b = " + (c + a / b));
	        System.out.println("a % b + c = " + (a % b + c));
	        System.out.println("a * b + c = " + (a * b + c));

	}

}
