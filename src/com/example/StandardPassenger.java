package com.example;
import com.example.Activity;
import com.example.Destination;

public class StandardPassenger extends Passenger {

    private double balance;

    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, balance);
    }


    public double getBalance() {
        return balance;
    }

    public void deductCost(double cost) {
        balance -= cost;
    }
}
