package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoZerosForHerosTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: noBoringZeros");
        testing(NoZerosForHeros.noBoringZeros(1450), 145);
        testing(NoZerosForHeros.noBoringZeros(960000), 96);
        testing(NoZerosForHeros.noBoringZeros(1050), 105);
        testing(NoZerosForHeros.noBoringZeros(-1050), -105);
    }
}