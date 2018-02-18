package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class DetermineOffspringTest {
    @Test
    public void tests() {
        // Make tests execute in a random order.
        Random r = new Random();
        if (r.nextBoolean()) {
            assertEquals("Congratulations! You're going to have a son.", DetermineOffspring.chromosomeCheck("XY"));
            assertEquals("Congratulations! You're going to have a daughter.", DetermineOffspring.chromosomeCheck("XX"));
        } else {
            assertEquals("Congratulations! You're going to have a daughter.", DetermineOffspring.chromosomeCheck("XX"));
            assertEquals("Congratulations! You're going to have a son.", DetermineOffspring.chromosomeCheck("XY"));
        }
    }
}