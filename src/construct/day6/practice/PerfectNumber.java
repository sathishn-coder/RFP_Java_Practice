package construct.day6.practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		int sum=0; //28 -> 1 2 4 7 14
		int num=sc.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		
		if(num==sum) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}

	}

}
