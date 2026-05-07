package construct.day2.practice;

import java.util.Scanner;

public class ReverseFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int reverse = 0;

        for (; n != 0; n = n / 10) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
        }

        System.out.println("Reverse Number: " + reverse);

	}

}
