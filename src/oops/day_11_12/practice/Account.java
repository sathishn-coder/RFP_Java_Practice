package oops.day_11_12.practice;

public class Account {
	private double balance;

    // Constructor
    public Account(double balance) {

        if (balance > 0) {

            this.balance = balance;
        }
    }

    // Credit Method
    public void credit(double amount) {

        balance += amount;
    }

    // Debit Method
    public void debit(double amount) {

        if (amount > balance) {

            System.out.println(
                    "Debit amount exceeded account balance");

        } else {

            balance -= amount;

            System.out.println(
                    "Amount Debited Successfully");
        }
    }

    // Getter
    public double getBalance() {

        return balance;
    }

}
