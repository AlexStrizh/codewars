package kyu8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class FindNumbersWhichAreDivisibleByGivenNumberTest {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(n -> n % divider == 0).toArray();
    }

    @Test public void testSimple()
    {
        assertTrue(Arrays.equals(new int[] {2,4,6}, FindNumbersWhichAreDivisibleByGivenNumber.divisibleBy(new int[] {1,2,3,4,5,6},2)));
        assertTrue(Arrays.equals(new int[] {3,6}, FindNumbersWhichAreDivisibleByGivenNumber.divisibleBy(new int[] {1,2,3,4,5,6},3)));
        assertTrue(Arrays.equals(new int[] {0,4}, FindNumbersWhichAreDivisibleByGivenNumber.divisibleBy(new int[] {0,1,2,3,4,5,6},4)));
    }

    @Test public void testRandom()
    {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int divider = 2 + r.nextInt(10);
            int[] numbers = r.ints(100,0,100).toArray();
            assertTrue(Arrays.equals(divisibleBy(numbers, divider), FindNumbersWhichAreDivisibleByGivenNumber.divisibleBy(numbers, divider)));
        }
    }
}