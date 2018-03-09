package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertNumberToReversedArrayOfDigitsTest {
    @Test
    public void basicTests() {
        String msg = "Should work with some preset numbers";
        assertArrayEquals(msg, new int[] {1,3,2,5,3}, ConvertNumberToReversedArrayOfDigits.digitize(35231));
        assertArrayEquals(msg, new int[] {7,5,3,2,8,5,3,2}, ConvertNumberToReversedArrayOfDigits.digitize(23582357));
        assertArrayEquals(msg, new int[] {8,3,7,4,6,7,4,8,9}, ConvertNumberToReversedArrayOfDigits.digitize(984764738));
        assertArrayEquals(msg, new int[] {0,2,9,3,9,8,2,6,7,5,4}, ConvertNumberToReversedArrayOfDigits.digitize(45762893920L));
        assertArrayEquals(msg, new int[] {4,9,3,8,3,8,2,0,7,8,4,5}, ConvertNumberToReversedArrayOfDigits.digitize(548702838394L));
    }

    @Test
    public void randomTests() {
        int i, x;
        long y;
        System.out.println("Testing 37 random numbers...");
        for (i = x = 1; i <= 37; x = ++i) {
            y = (long) (10 + Math.ceil((9 * Math.pow(1.7, x) - 10) * Math.random()));
            assertArrayEquals("Should work with " + y, digitizeAns(y), ConvertNumberToReversedArrayOfDigits.digitize(y));
        }
    }

    private int[] digitizeAns(long n) {
        String numStr = Long.toString(n);
        int[] numArr = new int[numStr.length()];
        for (int i = numStr.length()-1; i >= 0; i--) {
            numArr[numStr.length() - 1 - i] = Integer.parseInt(numStr.substring(i, i+1));
        }
        return numArr;
    }
}