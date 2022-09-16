package com.kenzie.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Kenzie Stock Exchange");
        Scanner in = new Scanner(System.in);
        System.out.println("What is the Stock's name?");
        String name = in.nextLine();
        System.out.println("What is the Stock's ticker symbol?");
        String ticker = in.nextLine();
        System.out.println("What is the Stock's current price?");
        double price = Double.parseDouble(in.nextLine());

        // Create your StockHolding using the values above
        StockHolding stock = new StockHolding(name, ticker, price);
        // Create your Execution Loop
            // print the menu
            // collect which option they chose from Scanner
            // perform the operation: Check your balance, buy, sell, or exit
            // repeat!
        int input = 0;
        int numOfShares;
        double amount;
        while(input != 4) {
            System.out.println("Enter a selection (1-4)\n" +
                    "1. Check your Balance\n" +
                    "2. Buy\n" +
                    "3. Sell\n" +
                    "4. Exit");
            input = in.nextInt();

            switch (input){
                case 1:
                    System.out.println("You own "+stock.getNumShares()+" shares of "+stock.getName()+" ("+stock.getTicker()+")\n" +
                                        "Your balance is: $" + stock.getBalance());
                    break;
                case 2:
                    System.out.println("How many shares would you like to buy?");
                    numOfShares = in.nextInt();
                    stock.buy(numOfShares);
                    break;
                case 3:
                    System.out.println("How many shares would you like to sell?");
                    numOfShares = in.nextInt();
                    amount = stock.sell(numOfShares);
                    if(amount > 0) {
                        System.out.println("You sold " + numOfShares + " shares for $" + amount);
                    }else{
                        System.out.println("You do not have enough shares!");
                    }

            }
        }

        System.out.println("Goodbye!");
    }
}
