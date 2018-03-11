package kyu8;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SumWithoutHighestAndLowestNumberTest {
    @Test
    public void SumOnlyOneElement() {
        assertEquals(0, SumWithoutHighestAndLowestNumber.sum(new int[] { 6 }));
    }

    @Test
    public void SumOnlyTwoElements() {
        assertEquals(0, SumWithoutHighestAndLowestNumber.sum(new int[] { 6, 7 }));
    }

    @Test
    public void SumPositives() {
        assertEquals(16, SumWithoutHighestAndLowestNumber.sum(new int[] { 6, 2, 1, 8, 10 }));
    }

    @Test
    public void SumPositivesWithDoubleMax() {
        assertEquals(17, SumWithoutHighestAndLowestNumber.sum(new int[] { 6, 0, 1, 10, 10 }));
    }

    @Test
    public void SumNegatives() {
        assertEquals(-28, SumWithoutHighestAndLowestNumber.sum(new int[] { -6, -20, -1, -10, -12}));
    }

    @Test
    public void SumMixed() {
        assertEquals(3, SumWithoutHighestAndLowestNumber.sum(new int[] { -6, 20, -1, 10, -12}));
    }

    @Test
    public void SumEmptyArray() {
        assertEquals(0, SumWithoutHighestAndLowestNumber.sum(new int[0]));
    }

    @Test
    public void SumNullArray() {
        assertEquals(0, SumWithoutHighestAndLowestNumber.sum(null));
    }

    @Test
    public void SumRandom() {
        for(int r=0; r<20;r++)
        {
            int[] numbers = new int[6];
            for(int i=0; i< numbers.length; i++)
            {
                numbers[i] = (int)Math.floor(Math.random() * 1100 - 500);
            }

            int sum = 0;
            for(int i = 0 ; i < numbers.length; i++) {
                sum += numbers[i];
            }

            int min = Arrays.stream(numbers).min().getAsInt();
            int max = Arrays.stream(numbers).max().getAsInt();

            int expected = sum - min - max;

            assertEquals(expected, SumWithoutHighestAndLowestNumber.sum(numbers));
        }
    }

}