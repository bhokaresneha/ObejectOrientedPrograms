/* Problem Statement=>
                        1. Stock Account Management
                        a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
                        Print a Stock Report with the total value of each Stock and the total value of Stock.
                        b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of Share, and Share Price
                        c. Logic -> Calculate the value of each stock and the total value
                        d. O/P -> Print the Stock Report.
                        e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read
                        from the input file. Have functions in the Class to calculate the value of each
                        stock and the value of total stocks.
* */
package com.bridgelabz.Day11_12;
import java.util.Scanner;

public class  StockPortfolio{
    //variable initialization
    static String shareName;
    static int noOfShares;
    static double sharePrice = 0.0;
    static double stockValue = 0.0;
    static double totalStockValue = 0.0;

    //creating object of Scanner class to take input from user
    static Scanner sc = new Scanner(System.in);
    public static void getStockDetails()
    {

        System.out.println("Enter how many stocks you want to buy : ");
        int n= sc.nextInt();
      // getting details regarding stock from user
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Share Name: ");
            shareName = sc.next();
            System.out.println("Enter number of Shares: ");
            noOfShares = sc.nextInt();
            System.out.println("Enter Share Price: ");
            sharePrice = sc.nextDouble();
    // calculating stock value
            stockValue = calculateStockValue(noOfShares, sharePrice);
            System.out.println("Stock value for Share"+i+", "+shareName+" is "+stockValue);
            totalStockValue += stockValue;
        }
        System.out.println("Total stock value is "+totalStockValue);
    }
    public static double calculateStockValue(int noOfShares, double sharePrice){
        return noOfShares*sharePrice;
    }
    public static void main(String[] args) {
        System.out.println("*************Welcome to STOCK MANAGEMENT SYSTEM **************************");
        getStockDetails();
    }
}
