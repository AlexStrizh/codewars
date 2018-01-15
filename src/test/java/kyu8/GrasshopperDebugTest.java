package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class GrasshopperDebugTest {
    private String solution(int temperture) {
        double c = (temperture - 32) * 5/9.0;
        return c + (c > 0 ? " is above freezing temperature" : " is freezing temperature");
    }

    @Test
    public void test1() {
        assertEquals(solution(56), GrasshopperDebug.weatherInfo(56));
    }
    @Test
    public void test2() {
        assertEquals(solution(23), GrasshopperDebug.weatherInfo(23));
    }
    @Test
    public void test3() {
        assertEquals(solution(33), GrasshopperDebug.weatherInfo(33));
    }
    @Test
    public void test4() {
        assertEquals(solution(5), GrasshopperDebug.weatherInfo(5));
    }
    @Test
    public void test5() {
        Random rand = new Random();
        for (int i = 0; i < 50; ++i) {
            int num = rand.nextInt(100)+1;
            assertEquals(solution(num), GrasshopperDebug.weatherInfo(num));
        }
    }
}