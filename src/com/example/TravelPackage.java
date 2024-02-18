package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.example.Passenger;



public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;


    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Passenger capacity reached. Cannot add more passengers.");
        }
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getActivityName());
                System.out.println("Description: " + activity.getDescription());
                System.out.println("Cost: " +" $" + activity.getCost());
                System.out.println("Capacity: " + activity.getCapacity());
                System.out.println("Spaces Available: " + activity.getSpacesAvailable());
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Passenger List for Travel Package: " + name );
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("Name: " + passenger.getName());
            System.out.println("Passenger Number: " + passenger.getPassengerNumber());
        }
    }

    public void printPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Name: " + passenger.getName());
        System.out.println("Passenger Number: " + passenger.getPassengerNumber());

        if (passenger instanceof StandardPassenger || passenger instanceof GoldPassenger) {
            System.out.println("Balance: " + passenger.getBalance());
        }
        List<Activity> activities = passenger.getActivities();
        if (!activities.isEmpty()) {
            System.out.println("Activities Signed Up:");
            for (Activity activity : activities) {
                System.out.println("- Activity: " + activity.getActivityName());
                System.out.println("  Destination: " + findDestinationByActivity(activity).getName());
                double pricePaid = calculatePrice(passenger, activity);
                System.out.println("  Price Paid: " + pricePaid);
            }
        }
    }

    private Destination findDestinationByActivity(Activity activity) {
        for (Destination destination : itinerary) {
            List<Activity> activities = destination.getActivities();
            if (activities.contains(activity)) {
                return destination;
            }
        }
        return null;
    }

    private double calculatePrice(Passenger passenger, Activity activity) {
        if (passenger instanceof StandardPassenger) {
            return activity.getCost();
        } else if (passenger instanceof GoldPassenger) {
            double discount = 0.1 * activity.getCost();
            return activity.getCost() - discount;
        } else { // PremiumPassenger
            return 0.0; // Premium passengers sign up for activities for free
        }
    }

    public void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : itinerary) {
            List<Activity> activities = destination.getActivities();
            for (Activity activity : activities) {
                int remainingCapacity = activity.getCapacity() - countPassengersForActivity(activity);
                System.out.println("- Activity: " + activity.getActivityName() + " (Remaining Capacity: " + remainingCapacity + ")");
            }
        }
    }

    private int countPassengersForActivity(Activity activity) {
        int count = 0;
        for (Passenger passenger : passengers) {
            if (passenger.getActivities().contains(activity)) {
                count++;
            }
        }
        return count;
    }

    public List<Destination> getItinerary() {
        return itinerary;
    }
}

