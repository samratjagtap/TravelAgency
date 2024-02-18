package com.example.test;

import com.example.Activity;
import com.example.Destination;
import org.junit.Test;
import static org.junit.Assert.*;

public class DestinationTest {

    @Test
    public void testAddActivity() {
        Destination destination = new Destination("Beach");
        Activity activity = new Activity("Snorkeling", "Underwater exploration", 30.0, 15);
        destination.addActivity(activity);
        assertEquals(1, destination.getActivities().size());
    }
}
