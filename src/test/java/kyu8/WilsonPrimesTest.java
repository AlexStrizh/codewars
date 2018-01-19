package kyu8;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

public class WilsonPrimesTest {
    private int n;
    private boolean expected;

    public WilsonPrimesTest(int n, boolean expected) {
        this.n = n;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: isValid({0})={1}")
    public static Iterable<Object[]> data() {
        ArrayList<Object[]> lst = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            int a = rnd.nextInt(600);
            boolean b;
            if (a == 5 || a == 13 || a == 563)
                b = true;
            else
                b = false;
            lst.add(new Object[] { a, b });
        }
        lst.add(new Object[] { 5, true });
        lst.add(new Object[] { 563, true });
        return lst;
    }

    @Test
    public void test_validPrimes() {
        assertEquals(expected, WilsonPrimes.am_i_wilson(n));
    }
}