package kyu8;

import org.junit.Test;

import java.util.Random;

import static java.lang.Math.abs;
import static org.junit.Assert.*;

public class ReturnNegativeTest {

    private static final int NUM_RANDOM_TESTS = 10;
    private static final int MAX_X = 1000;

    private final Random random = new Random();

    @Test
    public void test1() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
    }

    @Test
    public void test2() {
        assertEquals(-9, ReturnNegative.makeNegative(-9));
    }

    @Test
    public void test3() {
        assertEquals(0, ReturnNegative.makeNegative(0));
    }

    @Test
    public void testRandomPositives() {
        for(int i = 0; i < NUM_RANDOM_TESTS; i++) {
            int x = random.nextInt(MAX_X - 1) + 1;
            assertEquals(-abs(x), ReturnNegative.makeNegative(x));
        }
    }

    @Test
    public void testRandomNegatives() {
        for(int i = 0; i < NUM_RANDOM_TESTS; i++) {
            int x = -random.nextInt(MAX_X);
            assertEquals(-abs(x), ReturnNegative.makeNegative(x));
        }
    }
}