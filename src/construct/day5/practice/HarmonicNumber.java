package construct.day5.practice;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter N: ");
	        int n = sc.nextInt();

	        if (n == 0) {
	            System.out.println("N should not be 0");
	            return;
	        }

	        double harmonic = 0.0;

	        for (int i = 1; i <= n; i++) {
	            harmonic += (double) 1 / i;
	        }

	        System.out.println("Harmonic Value = " + harmonic);

	}

}
