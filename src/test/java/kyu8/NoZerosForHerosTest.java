package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoZerosForHerosTest {
    private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
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
        testing(NoZerosForHeros.noBoringZeros(-105), -105);
        testing(NoZerosForHeros.noBoringZeros(0), 0);
        testing(NoZerosForHeros.noBoringZeros(2016), 2016);
    }
    //............
    private static int noBoringZerosSol(int n) {
        if (n == 0) return n;
        while (n % 10 == 0) {
            n = n / 10;
        }
        return n;
    }
    //............
    @Test
    public void test2() {
        System.out.println("Random Tests");
        int i = 0;
        while (i < 100) {
            int k = randInt(100, 10000);
            testing(NoZerosForHeros.noBoringZeros(1000 * k), noBoringZerosSol(1000 * k));
            testing(NoZerosForHeros.noBoringZeros(-1000 * k), noBoringZerosSol(-1000 * k));
            testing(NoZerosForHeros.noBoringZeros(2 * k), noBoringZerosSol(2 * k));
            testing(NoZerosForHeros.noBoringZeros(k), noBoringZerosSol(k));
            i++;
        }
    }
}