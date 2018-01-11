package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class ConvertANumberToAStringTest {
    @Test
    public void basicTests() {
        assertEquals("67", ConvertANumberToAString.numberToString(67));
        assertEquals("79585", ConvertANumberToAString.numberToString(79585));
        assertNotEquals(79585, ConvertANumberToAString.numberToString(79585));
        assertEquals("3", ConvertANumberToAString.numberToString(1+2));
        assertEquals("-1", ConvertANumberToAString.numberToString(1-2));
    }

    @Test
    public void randomTests() {
        Random randGen = new Random();
        System.out.println("Testing 20 random integers...");
        for (int i = 0; i < 20; i++) {
            int num = randGen.nextInt(100000);
            assertEquals("Should convert " + num + " to its correct string representation", Integer.toString(num), ConvertANumberToAString.numberToString(num));
        }
    }
}