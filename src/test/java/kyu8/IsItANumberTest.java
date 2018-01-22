package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsItANumberTest {
    IsItANumber myUtil = new IsItANumber();

    @Test
    public void testRandomNumber() throws Exception {

        // Try to test for behavior, rather than specific inputs
        // Otherwise people may try to cheat, and only program for exercise inputs!
        for (int i = 0; i < 100; i++) {
            Double a = Math.random();
            String aa = ""+a;
            Double b = Math.random();
            String bb = ""+b;
            Double c = Math.random();
            String cc = ""+c;
            String dd = "fsda243fs";

            assertEquals(true,myUtil.isDigit(aa));
            assertEquals(true,myUtil.isDigit(bb));
            assertEquals(true,myUtil.isDigit(cc));
            assertEquals(false,myUtil.isDigit(dd));
        }
    }

    @Test
    public void test0() throws Exception
    {
        assertEquals(false,myUtil.isDigit("s2324"));
    }
    @Test
    public void test1() throws Exception
    {
        assertEquals(false,myUtil.isDigit("3 4"));
    }
    @Test
    public void test2() throws Exception
    {
        assertEquals(false,myUtil.isDigit("3-4"));
    }
    @Test
    public void test3() throws Exception
    {
        assertEquals(false,myUtil.isDigit("3  4   "));
    }
    @Test
    public void test4() throws Exception
    {
        assertEquals(true,myUtil.isDigit("34.65"));
    }
    @Test
    public void test5() throws Exception
    {
        assertEquals(true,myUtil.isDigit("-0"));
    }
    @Test
    public void test6() throws Exception
    {
        assertEquals(false,myUtil.isDigit(" "));
    }
    @Test
    public void test7() throws Exception
    {
        assertEquals(false,myUtil.isDigit(""));
    }
    @Test
    public void test8() throws Exception
    {
        assertEquals(true,myUtil.isDigit("0.0"));
    }
}