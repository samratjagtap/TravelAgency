package com.example;



public class Activity {
    private String activityName;
    private String description;
    private double cost;
    private int capacity;
    private int spacesAvailable;

    public Activity(String activityName, String description, double cost, int capacity) {
        this.activityName = activityName;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.spacesAvailable = capacity;
    }

    public String getActivityName() {
        return activityName;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpacesAvailable() {
        return spacesAvailable;
    }

    public boolean signUp() {
        if (spacesAvailable > 0) {
            spacesAvailable--;
            return true;
        }
        return false;
    }


}
