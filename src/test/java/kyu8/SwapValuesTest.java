package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapValuesTest {
    @Test
    public void IntTest() {
        Integer[] args = new Integer[]{1,2};

        SwapValues r= new SwapValues(args);
        r.swapValues();
        assertEquals("Failed swapping numbers",2,r.arguments[0] );
        assertEquals("Failed swapping numbers",1,r.arguments[1] );
    }

    @Test
    public void StringTest() {
        String[] args = new String[]{"a","b"};

        SwapValues r= new SwapValues(args);
        r.swapValues();
        assertEquals("Failed swapping Strings","b",r.arguments[0] );
        assertEquals("Failed swapping Strings","a",r.arguments[1] );
    }

    @Test
    public void differentSubtypesTest() {
        Object[] args = new Object[]{"1",2};

        SwapValues r= new SwapValues(args);
        r.swapValues();
        assertEquals("Failed swapping objects",2,r.arguments[0] );
        assertEquals("Failed swapping objects","1",r.arguments[1] );
    }

    @Test
    public void arraysTest() {
        Object[] args = new Object[]{new String[]{"1"},new Integer[]{2}};

        SwapValues r= new SwapValues(args);
        r.swapValues();
        assertEquals("Failed swapping arrays",2,((Object[])r.arguments[0])[0] );
        assertEquals("Failed swapping arrays","1",((Object[])r.arguments[1])[0] );
    }
}