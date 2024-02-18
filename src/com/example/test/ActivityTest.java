package com.example.test;

import com.example.Activity;
import org.junit.Test;
import static org.junit.Assert.*;

public class ActivityTest {

    @Test
    public void testSignUp() {
        Activity activity = new Activity("Hiking", "Mountain hiking", 50.0, 10);
        assertTrue(activity.signUp());
        assertEquals(9, activity.getSpacesAvailable());
    }

    @Test
    public void testSignUpWhenFull() {
        Activity activity = new Activity("Hiking", "Mountain hiking", 50.0, 1);
        assertTrue(activity.signUp());
        assertFalse(activity.signUp()); // Try signing up when activity is full
    }
}

