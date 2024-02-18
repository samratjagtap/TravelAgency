package com.example.test;

import com.example.Destination;
import com.example.TravelPackage;
import org.junit.Test;
import static org.junit.Assert.*;

public class TravelPackageTest {

    @Test
    public void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Europe Tour", 20);
        Destination destination = new Destination("Paris");
        travelPackage.addDestination(destination);
        assertEquals(1, travelPackage.getItinerary().size());
    }
}

