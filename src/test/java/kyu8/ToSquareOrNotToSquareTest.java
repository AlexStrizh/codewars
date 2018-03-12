package kyu8;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ToSquareOrNotToSquareTest {
    @Test
    public void basicTests() {
        int[] input = new int[] { 4, 3, 9, 7, 2, 1 };
        int[] expected = new int[] { 2, 9, 3, 49, 4, 1 };
        assertEquals(Arrays.toString(expected), Arrays.toString(ToSquareOrNotToSquare.squareOrSquareRoot(input)));

        input = new int[] { 100, 101, 5, 5, 1, 1 };
        expected = new int[] { 10, 10201, 25, 25, 1, 1 };
        assertEquals(Arrays.toString(expected), Arrays.toString(ToSquareOrNotToSquare.squareOrSquareRoot(input)));

        input = new int[] { 1, 2, 3, 4, 5, 6 };
        expected = new int[] { 1, 4, 9, 2, 25, 36 };
        assertEquals(Arrays.toString(expected), Arrays.toString(ToSquareOrNotToSquare.squareOrSquareRoot(input)));
    }

    @Test
    public void randomTests() {
        for(int r=0;r<30;r++)
        {
            int len = (int)(Math.random() * 17 + 3);
            int[] array = new int[len];
            for(int i=0;i<len;i++)
            {
                array[i] = (int)(Math.random() * 100 + 1);
            }

            int[] expected = new int[array.length];
            for(int i=0;i<array.length;i++)
            {
                double sqrt = Math.sqrt(array[i]);
                if(sqrt == (int)sqrt)
                {
                    expected[i] = (int)sqrt;
                }
                else
                {
                    expected[i] = array[i] * array[i];
                }
            }

            assertEquals(Arrays.toString(expected), Arrays.toString(ToSquareOrNotToSquare.squareOrSquareRoot(array)));
        }
    }
}