package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class PythagoreanTripleTest {
    PythagoreanTriple pT = new PythagoreanTriple();

    // valid cases
    static int[] p1 = { 3, 4, 5 };
    static int[] p2 = { 5, 12, 13 };
    static int[] p3 = { 6, 8, 10 };
    static int[] p4 = { 7, 24, 25 };
    static int[] p5 = { 8, 15, 17 };
    static int[] p6 = { 9, 12, 15 };
    static int[] p7 = { 9, 40, 41 };
    static int[] p8 = { 10, 24, 26 };
    static int[] p9 = { 12, 16, 20 };
    static int[] p10 = { 12, 16, 20 };
    static int[] p11 = { 14,48,50 };
    static int[] p12 = { 15,20,25 };
    static int[] p13 = { 15,36,39 };
    static int[] p14 = { 16, 30, 34 };
    static int[] p15 = { 18, 24, 30 };
    static int[] p16 = { 20, 21, 29 };
    static int[] p17 = { 21, 28, 35 };
    static int[] p18 = { 24, 32, 40 };
    static int[] p19 = { 27, 36, 45 };
    static int[] p20 = { 30, 40, 50 };

    // invalid cases

    static int[] p21 = {70,18,8};
    static int[] p22 = {50,19,19};
    static int[] p23 = {44,17,15};
    static int[] p24 = {4,54,5};
    static int[] p25 = {33,11,24};
    static int[] p26 = {69,11,15};
    static int[] p27 = {77,12,27};
    static int[] p28 = {35,39,13};
    static int[] p29 = {90,44,18};
    static int[] p30 = {31,8,22};
    static int[] p31 = {22,30,7};
    static int[] p32 = {94,16,25};
    static int[] p33 = {84,37,18};
    static int[] p34 = {84,19,23};
    static int[] p35 = {9,45,21};
    static int[] p36 = {61,18,9};
    static int[] p37 = {93,50,25};
    static int[] p38 = {10,21,17};
    static int[] p39 = {65,26,3};
    static int[] p40 = {39,31,6};


    @Test
    public void validTriple() {
        assertEquals(1, pT.pythagoreanTriple(p1));
        assertEquals(1, pT.pythagoreanTriple(p2));
        assertEquals(1, pT.pythagoreanTriple(p3));
        assertEquals(1, pT.pythagoreanTriple(p4));
        assertEquals(1, pT.pythagoreanTriple(p5));
        assertEquals(1, pT.pythagoreanTriple(p6));
        assertEquals(1, pT.pythagoreanTriple(p7));
        assertEquals(1, pT.pythagoreanTriple(p8));
        assertEquals(1, pT.pythagoreanTriple(p9));
        assertEquals(1, pT.pythagoreanTriple(p10));
        assertEquals(1, pT.pythagoreanTriple(p11));
        assertEquals(1, pT.pythagoreanTriple(p12));
        assertEquals(1, pT.pythagoreanTriple(p13));
        assertEquals(1, pT.pythagoreanTriple(p14));
        assertEquals(1, pT.pythagoreanTriple(p15));
        assertEquals(1, pT.pythagoreanTriple(p16));
        assertEquals(1, pT.pythagoreanTriple(p17));
        assertEquals(1, pT.pythagoreanTriple(p18));
        assertEquals(1, pT.pythagoreanTriple(p19));
        assertEquals(1, pT.pythagoreanTriple(p20));

    }

    public void invalidTriple(){
        assertEquals(0, pT.pythagoreanTriple(p21));
        assertEquals(0, pT.pythagoreanTriple(p22));
        assertEquals(0, pT.pythagoreanTriple(p23));
        assertEquals(0, pT.pythagoreanTriple(p24));
        assertEquals(0, pT.pythagoreanTriple(p25));
        assertEquals(0, pT.pythagoreanTriple(p26));
        assertEquals(0, pT.pythagoreanTriple(p27));
        assertEquals(0, pT.pythagoreanTriple(p28));
        assertEquals(0, pT.pythagoreanTriple(p29));
        assertEquals(0, pT.pythagoreanTriple(p30));
        assertEquals(0, pT.pythagoreanTriple(p31));
        assertEquals(0, pT.pythagoreanTriple(p32));
        assertEquals(0, pT.pythagoreanTriple(p33));
        assertEquals(0, pT.pythagoreanTriple(p34));
        assertEquals(0, pT.pythagoreanTriple(p35));
        assertEquals(0, pT.pythagoreanTriple(p36));
        assertEquals(0, pT.pythagoreanTriple(p37));
        assertEquals(0, pT.pythagoreanTriple(p38));
        assertEquals(0, pT.pythagoreanTriple(p39));
        assertEquals(0, pT.pythagoreanTriple(p40));

    }
}