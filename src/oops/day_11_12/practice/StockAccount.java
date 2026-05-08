package oops.day_11_12.practice;

import java.util.ArrayList;

public class StockAccount {
	ArrayList<CompanyShares> companyList =
            new ArrayList<>();

    // Buy Shares
    public void buy(String symbol,
                    int shares) {

        CompanyShares company =
                new CompanyShares(symbol, shares);

        companyList.add(company);

        System.out.println(
                "Shares Purchased Successfully");
    }

    // Sell Shares
    public void sell(String symbol,
                     int shares) {

        for (CompanyShares company
                : companyList) {

            if (company.stockSymbol
                    .equalsIgnoreCase(symbol)) {

                if (company.numberOfShares
                        >= shares) {

                    company.numberOfShares -= shares;

                    company.transactionDate =
                            java.time.LocalDateTime.now();

                    System.out.println(
                            "Shares Sold Successfully");

                } else {

                    System.out.println(
                            "Insufficient Shares");
                }

                return;
            }
        }

        System.out.println("Company Not Found");
    }

    // Display Shares
    public void display() {

        System.out.println(
                "\n===== COMPANY SHARES =====");

        for (CompanyShares company
                : companyList) {

            System.out.println(
                    "\nStock Symbol : "
                            + company.stockSymbol);

            System.out.println(
                    "Number Of Shares : "
                            + company.numberOfShares);

            System.out.println(
                    "Transaction Date : "
                            + company.transactionDate);
        }
    }

}
