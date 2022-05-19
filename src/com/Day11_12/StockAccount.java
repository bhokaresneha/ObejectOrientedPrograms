package com.Day11_12;

import java.util.Scanner;

public class StockAccount {
    public static int amount=100000;
    static Scanner scanner = new Scanner(System.in);
    public static void Sell(){
        System.out.println("How much You Want to sell Stocks");
        int Stocks= 50 ;
        int sellStocks= scanner.nextInt();
        int totalSellStocks = sellStocks - Stocks  ;
        System.out.println("Total Stocks sell " + sellStocks);
        Stocks = - totalSellStocks ;
        System.out.println("Remaining Stocks are " + Stocks);
        int debit = amount + sellStocks;
        System.out.println("Remaining Stocks are " + debit);
    }
    public static void Buy(){
        int Stocks  = 50 ;
        System.out.println("Enter How Much Stocks You Want to Buy");
        int buyStocks= scanner.nextInt();
        int totalBuyStocks = Stocks + buyStocks ;
        System.out.println("Total Stocks buy " + buyStocks);
        Stocks = + totalBuyStocks;
        System.out.println("Remaining Stocks are " + Stocks );
        int credit = amount - buyStocks  ;
        System.out.println("Total Stocks buy " + credit);
    }

    public static void main(String[] args) {
        Sell();
        Buy();
    }
}