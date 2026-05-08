package construct.day6.practice;

import java.util.Scanner;

public class Stopwatch {
	public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Press ENTER to Start Stopwatch");
	        sc.nextLine();

	        long start = System.currentTimeMillis();

	        System.out.println("Press ENTER to Stop Stopwatch");
	        sc.nextLine();

	        long end = System.currentTimeMillis();

	        long elapsed = end - start;

	        System.out.println("Elapsed Time = "
	                + elapsed / 1000.0 + " seconds");
		
	}

}
