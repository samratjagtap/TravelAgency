package com.example;

public class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber, 0.0); // Premium passengers have 0 balance by default
    }
}
