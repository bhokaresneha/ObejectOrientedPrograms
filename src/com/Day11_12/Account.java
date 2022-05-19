package com.Day11_12;
import java.util.Scanner;

public class Account {
        public static void main(String[] args) {
            int amount =80000;
            int debit ;
            System.out.println("Enter Amount You Want to Withdrawal");
            Scanner scanner = new Scanner(System.in);
            debit= scanner.nextInt();
            if (debit <= amount)
                System.out.println(debit+"Amount Withdrawal Successfully!!!!!!");
            else
                System.out.println("Insufficient Balance !!!!!");

        }


    }
