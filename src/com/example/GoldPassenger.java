package com.example;

public class GoldPassenger extends Passenger {
    private double balance;

    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, balance);

    }

    public double getBalance() {
        return balance;
    }

    public void applyDiscount(double cost) {
        double discountedAmount = cost * 0.10;
        double finalCost = cost - discountedAmount; // Calculate final cost after discount
        balance -= finalCost ;

    }




}

