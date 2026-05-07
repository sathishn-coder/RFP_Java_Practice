package construct.day5.practice;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("Prime Factors are:");

        for (int i = 2; i * i <= n; i++) {

            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }

        if (n > 1)
            System.out.println(n);

	}

}
