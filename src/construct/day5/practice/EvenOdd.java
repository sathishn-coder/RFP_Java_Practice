package construct.day5.practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Even number "+num);
		}
		else {
			System.out.println("Odd number "+num);
		}

	}

}
