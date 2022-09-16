package com.kenzie.app;

public class StockHolding {
    // Create private instance properties
    private String name;
    private String ticker;
    private double price;
    private int numShares;

    // Create constructor

    public StockHolding(String name, String ticker, double price) {
        this.name = name;
        this.ticker = ticker;
        this.price = price;
        this.numShares = 0;
    }

    // create getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumShares() {
        return numShares;
    }

    public void setNumShares(int numShares) {
        this.numShares = numShares;
    }

    // create buy, sell, and getBalance methods
    public void buy(int shares){
        numShares += shares;
        System.out.println("You bought "+shares+" shares for $" + price*shares);
    }

    public double sell(int shares){
        if(shares > numShares){
            return 0;
        }else{
            numShares -= shares;
        }

        return shares * price;
    }

    public double getBalance(){
        return numShares*price;
    }

}
