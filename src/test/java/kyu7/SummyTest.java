package kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummyTest {
    @Test
    public void testBasic() {
        assertEquals(6, Summy.summy("1 2 3"));
    }

    @Test
    public void testMaxInts() {
        long huge = Integer.MAX_VALUE;
        long expect = (long) huge + 1L + 2L + 3L;
        assertEquals(expect, Summy.summy(String.valueOf(huge) + " 1 2 3"));
    }

    @Test
    public void randomTests() {
        for (int i = 0; i < 40; i++) {
            StringBuilder sb = new StringBuilder();
            long total = 0;
            for (int j = 0; j < (int) Math.ceil(Math.random() * 10); j++) {
                long a = (long) Math.ceil(Math.random() * Math.pow(10, 8));
                String s = String.valueOf(a) + " ";
                sb.append(s);
                total += a;
            }
            String testString = sb.toString().substring(0, sb.toString().length() - 1);
            assertEquals(total, Summy.summy(testString));
        }
    }
}