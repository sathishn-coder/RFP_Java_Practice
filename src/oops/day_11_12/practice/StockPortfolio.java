package oops.day_11_12.practice;

import java.util.ArrayList;

public class StockPortfolio {
	 // Collection for Stocks
    ArrayList<Stock> stockList =
            new ArrayList<>();

    // Add Stock
    public void addStock(Stock stock) {

        stockList.add(stock);
    }

    // Print Stock Report
    public void printStockReport() {

        double totalValue = 0;

        System.out.println("\n===== STOCK REPORT =====");

        for (Stock stock : stockList) {

            double stockValue =
                    stock.calculateStockValue();

            totalValue += stockValue;

            System.out.println(
                    "\nStock Name : "
                            + stock.stockName);

            System.out.println(
                    "Number Of Shares : "
                            + stock.numberOfShares);

            System.out.println(
                    "Share Price : "
                            + stock.sharePrice);

            System.out.println(
                    "Stock Value : "
                            + stockValue);
        }

        System.out.println(
                "\nTotal Stock Value : "
                        + totalValue);
    }

}
