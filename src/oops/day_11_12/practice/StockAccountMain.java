package oops.day_11_12.practice;

import java.util.Scanner;

public class StockAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        StockPortfolio portfolio =
                new StockPortfolio();

        System.out.print(
                "Enter Number of Stocks : ");

        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println(
                    "\nEnter Details for Stock "
                            + i);

            System.out.print("Stock Name : ");
            String name = sc.nextLine();

            System.out.print(
                    "Number of Shares : ");

            int shares = sc.nextInt();

            System.out.print("Share Price : ");
            double price = sc.nextDouble();

            sc.nextLine();

            // Create Stock Object
            Stock stock =
                    new Stock(name,
                            shares,
                            price);

            portfolio.addStock(stock);
        }

        // Print Report
        portfolio.printStockReport();

	}

}
