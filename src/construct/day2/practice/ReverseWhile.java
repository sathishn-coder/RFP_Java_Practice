package construct.day2.practice;

import java.util.Scanner;

public class ReverseWhile {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n>0) {
			int u=n%10;
			System.out.print(u);
			n/=10;
		}

	}

}
