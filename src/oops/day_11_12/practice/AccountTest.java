package oops.day_11_12.practice;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        Account account =
                new Account(1000);

        System.out.println(
                "Initial Balance : "
                        + account.getBalance());

        System.out.print(
                "Enter Debit Amount : ");

        double amount = sc.nextDouble();

        account.debit(amount);

        System.out.println(
                "Current Balance : "
                        + account.getBalance());

	}

}
