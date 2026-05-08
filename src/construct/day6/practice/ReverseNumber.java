package construct.day6.practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		while(num!=0) {
			int u=num%10;
			System.out.print(u);
			num/=10;
		}

	}

}
