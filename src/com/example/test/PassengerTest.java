package com.example.test;

import com.example.Activity;
import com.example.Passenger;
import com.example.StandardPassenger;
import org.junit.Test;
import static org.junit.Assert.*;

public class PassengerTest {

    @Test
    public void testAddActivitySignedUp() {
        Passenger passenger = new StandardPassenger("John", 1, 100.0);
        Activity activity = new Activity("Hiking", "Mountain hiking", 50.0, 10);
        passenger.addActivity(activity);
        assertEquals(1, passenger.getActivities().size());
    }
}

