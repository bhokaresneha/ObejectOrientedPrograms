package com.Day11_12;

import com.Day11_12.Stock;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    static Scanner scanner = new Scanner(System.in);

    ArrayList<Stock> arrayList = new ArrayList();

    public void addStock() {
        Stock share=new Stock();
        System.out.println("Enter Name For Stocks");
        share.setStockName(scanner.next());
        System.out.println("Enter  NoOfShares");
        share.setNoOfShares(scanner.nextInt());
        System.out.println("Enter sharePrize");
        share.setSharePrize(scanner.nextInt());
        arrayList.add(share);
    }

    public void displayStock() {
        for (Stock shareDetails : arrayList) {
            System.out.print(shareDetails + " ");
        }
    }

    void totalValue() {
        int TotalValue = Stock.getNoOfShare() * Stock.getSharePrize();
        System.out.println("Total Value of shares is " + TotalValue);

    }

    public static void main(String[] args) {
        StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.addStock();
        stockPortfolio.displayStock();
        stockPortfolio.totalValue();

    }
}