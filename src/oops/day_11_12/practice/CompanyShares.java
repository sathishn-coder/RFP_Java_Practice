package oops.day_11_12.practice;

import java.time.LocalDateTime;

public class CompanyShares {
	String stockSymbol;

    int numberOfShares;

    LocalDateTime transactionDate;

    public CompanyShares(String stockSymbol,
                         int numberOfShares) {

        this.stockSymbol = stockSymbol;

        this.numberOfShares = numberOfShares;

        this.transactionDate =
                LocalDateTime.now();
    }

}
