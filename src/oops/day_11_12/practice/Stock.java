package oops.day_11_12.practice;

public class Stock {
	// Instance Variables
    String stockName;

    int numberOfShares;

    double sharePrice;

    // Constructor
    public Stock(String stockName,
                 int numberOfShares,
                 double sharePrice) {

        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    // Method to calculate stock value
    public double calculateStockValue() {

        return numberOfShares * sharePrice;
    }

}
