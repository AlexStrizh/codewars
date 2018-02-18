package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class GrasshopperSummationTest {
    @Test
    public void test1() {
        assertEquals(1,
                GrasshopperSummation.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                GrasshopperSummation.summation(8));
    }
    @Test
    public void test3() {
        assertEquals(253,
                GrasshopperSummation.summation(22));
    }
    @Test
    public void test4() {
        assertEquals(5050,
                GrasshopperSummation.summation(100));
    }
    @Test
    public void test5() {
        assertEquals(22791,
                GrasshopperSummation.summation(213));
    }
    @Test
    public void test6() {
        Random rand = new Random();
        for (int i = 0; i < 50; ++i) {
            int n = rand.nextInt(100) + 1;
            assertEquals((int) (0.5*n*(1 + n)),
                    GrasshopperSummation.summation(n));
        }
    }
}