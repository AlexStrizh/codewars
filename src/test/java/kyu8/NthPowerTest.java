package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthPowerTest {
    @Test
    public void basicTests() {
        assertEquals(-1, NthPower.nthPower(new int[] {1,2}, 2));
        assertEquals(8, NthPower.nthPower(new int[] {3,1,2,2}, 3));
        assertEquals(4, NthPower.nthPower(new int[] {3,1,2}, 2));
    }

    @Test
    public void advancedTests() {
        assertEquals(9261, NthPower.nthPower(new int[] {7,14,9,21,15}, 3));
        assertEquals(169, NthPower.nthPower(new int[] {2,7,13,17}, 2));
        assertEquals(50625, NthPower.nthPower(new int[] {11,23,3,4,15,112,12,4}, 4));
    }

    @Test
    public void moreTests() {
        assertEquals(1, NthPower.nthPower(new int[] {2,1,2,1,2,1}, 5));
        assertEquals(-1, NthPower.nthPower(new int[] {11,23,3,4,15}, 7));
        assertEquals(-1, NthPower.nthPower(new int[] {3,2,1,2,3,1}, 6));
    }

    public int nthPowerSol(int[] array, int n) {
        return n >= array.length ? -1 : (int) Math.pow(array[n], n);
    }

    private static int randomInRange(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    @Test
    public void randomTests() {
        int[] array = new int[randomInRange(2,5)];
        int n = randomInRange(2,6);
        for (int i = 0; i < 50; i++) {
            for (int k = 0; k < array.length; k++) {
                array[k] = randomInRange(2,15);
            }
            assertEquals(nthPowerSol(array, n), NthPower.nthPower(array, n));
        }
    }
}