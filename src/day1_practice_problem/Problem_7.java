package day1_practice_problem;

import java.util.Scanner;

public class Problem_7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num>=1582) {
			if(num%4==0 && num%400==0) {
				System.out.println("Leap Year");
			}
			else {
				System.out.println("Not a Leap Year");
			}
		}
		else {
			System.out.println("put a input value is above 1582");
		}

	}

}
