package kyu8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsItEvenTest {
    private IsItEven num;

    @Before
    public void setUp() throws Exception {
        num = new IsItEven();
    }

    @After
    public void tearDown() throws Exception {
        num = null;
    }

    @Test
    public void tests() {
        assertEquals(true, num.isEven(0));
        assertEquals(false, num.isEven(0.5));
        assertEquals(false, num.isEven(1));
        assertEquals(true, num.isEven(2));
        assertEquals(true, num.isEven(-4));
        assertEquals(false, num.isEven(15));
        assertEquals(true, num.isEven(20));
        assertEquals(true, num.isEven(220));
        assertEquals(false, num.isEven(222222221));
        assertEquals(true, num.isEven(500000000));
    }
}