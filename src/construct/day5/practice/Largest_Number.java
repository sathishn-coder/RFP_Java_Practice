package construct.day5.practice;

import java.util.Scanner;

public class Largest_Number {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is a Largest");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is a Largest");
			
		}
		else {
			System.out.println(c+" is a Largest");
		}
	}

}
