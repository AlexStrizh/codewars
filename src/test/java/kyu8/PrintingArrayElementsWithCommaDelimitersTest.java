package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrintingArrayElementsWithCommaDelimitersTest {
    @Test
    public void testInteger() {
        Integer[] array=new Integer[]{2,4,5,2};
        assertEquals("2,4,5,2",PrintingArrayElementsWithCommaDelimiters.printArray(array));
    }
}