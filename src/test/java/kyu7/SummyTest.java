package kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummyTest {
    @Test
    public void basicTests() {
        assertEquals(Summy.summy("1 2 3"), 6);
        assertEquals(Summy.summy("1 2 3 4"), 10);
        assertEquals(Summy.summy("1 2 3 4 5"), 15);
        assertEquals(Summy.summy("10 10"), 20);
        assertEquals(Summy.summy("0 0"), 0);
    }
}