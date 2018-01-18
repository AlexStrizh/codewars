package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class GrasshopperArrayMeanTest {
    @Test
    public void test1() {
        assertEquals(1,
                GrasshopperArrayMean.findAverage(new int[]{1}));
    }
    @Test
    public void test2() {
        assertEquals(4,
                GrasshopperArrayMean.findAverage(new int[]{1,3,5,7}));
    }
}