package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class MilesPerGallonToKilometersPerLiterTest {
    @Test
    public void test1() {
        assertEquals(3.54f, MilesPerGallonToKilometersPerLiter.mpgToKPM(10), 0.001f);
    }

    @Test
    public void test2() {
        assertEquals(7.08f, MilesPerGallonToKilometersPerLiter.mpgToKPM(20), 0.001f);
    }

    @Test
    public void test3() {
        assertEquals(10.62f, MilesPerGallonToKilometersPerLiter.mpgToKPM(30), 0.001f);
    }
}