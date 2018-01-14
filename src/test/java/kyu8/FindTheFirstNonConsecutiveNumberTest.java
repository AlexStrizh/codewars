package kyu8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class FindTheFirstNonConsecutiveNumberTest {
    @Test public void basicTests() {
        assertEquals(Integer.valueOf(6), FindTheFirstNonConsecutiveNumber.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        assertEquals(null, FindTheFirstNonConsecutiveNumber.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(Integer.valueOf(6), FindTheFirstNonConsecutiveNumber.find(new int[]{4, 6, 7, 8, 9, 11}));
        assertEquals(Integer.valueOf(11), FindTheFirstNonConsecutiveNumber.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        assertEquals(null, FindTheFirstNonConsecutiveNumber.find(new int[]{31, 32}));
        assertEquals(Integer.valueOf(0), FindTheFirstNonConsecutiveNumber.find(new int[]{-3, -2, 0, 1}));
        assertEquals(Integer.valueOf(-1), FindTheFirstNonConsecutiveNumber.find(new int[]{-5, -4, -3, -1}));
    }

    @Test public void randomTests() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int length = random.nextInt(15) + 1;
            int[] array = new int[length];
            Arrays.setAll(array, j -> random.nextInt(1000000));
            assertEquals("For input \"" + Arrays.toString(array) + '"', kata(array), FindTheFirstNonConsecutiveNumber.find(array));
        }
    }

    private static Integer kata(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] + 1) {
                return array[i];
            }
        }
        return null;
    }
}