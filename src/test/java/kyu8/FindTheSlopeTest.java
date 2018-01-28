package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheSlopeTest {
    @Test
    public void test1() {
        FindTheSlope s = new FindTheSlope();

        int[] test1 = {12, -18, -15, -18};
        int[] test2 = {3, -20, 5, 8};
        int[] test3 = {17, -3, 17, 8};
        int[] test4 = {1, -19, -2, -7};
        int[] test5 = {19, 3, 20, 3};
        int[] test6 = {6, -12, 15, -3};
        int[] test7 = {15, -3, 15, -3};
        int[] test8 = {9, 3, 19, -17};

        int[] test9 = {1, 24, 2, 88};
        int[] test10 = {4, 384, 8, 768};
        int[] test11 = {4, 16, 4, 18};
        int[] test12 = {7, 28, 9, 64};
        int[] test13 = {18, -36, 12, 36};
        int[] test14 = {36, 580, 42, 40};
        int[] test15 = {1, 2, 2, 6};
        int[] test16 = {-6, 57, -6, 84};
        int[] test17 = {92, 12, 96, 64};
        int[] test18 = {1, 2, 2, 6};
        int[] test19 = {90, 54, 90, 2};
        int[] test20 = {3, 6, 4, 9};
        int[] test21 = {-2, -5, 2, 3};
        int[] test22 = {3, 3, 2, 0};
        int[] test23 = {6, -12, 15, -3};
        int[] test24 = {36, 80, 36, 42};
        int[] test25 = {16, 8, 32, 8};

        assertEquals("0", s.slope(test1));
        assertEquals("14", s.slope(test2));
        assertEquals("undefined", s.slope(test3));
        assertEquals("-4", s.slope(test4));
        assertEquals("0", s.slope(test5));
        assertEquals("1", s.slope(test6));
        assertEquals("undefined", s.slope(test7));
        assertEquals("-2", s.slope(test8));

        assertEquals("64", s.slope(test9));
        assertEquals("96", s.slope(test10));
        assertEquals("undefined", s.slope(test11));
        assertEquals("18", s.slope(test12));
        assertEquals("-12", s.slope(test13));
        assertEquals("-90", s.slope(test14));
        assertEquals("4", s.slope(test15));
        assertEquals("undefined", s.slope(test16));
        assertEquals("13", s.slope(test17));
        assertEquals("4", s.slope(test18));
        assertEquals("undefined", s.slope(test19));
        assertEquals("3", s.slope(test20));
        assertEquals("2", s.slope(test21));
        assertEquals("3", s.slope(test22));
        assertEquals("1", s.slope(test23));
        assertEquals("undefined", s.slope(test24));
        assertEquals("0", s.slope(test25));
    }
}