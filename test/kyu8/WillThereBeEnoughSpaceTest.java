package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class WillThereBeEnoughSpaceTest {

    @Test
    public void testWillThereBeEnoughSpace() {
        assertEquals("Should return 0.", 0, WillThereBeEnoughSpace.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, WillThereBeEnoughSpace.enough(100, 60, 50));
    }

    @Test
    public void randomTest() {

        long startTime = System.nanoTime();
        {
            Random r = new Random();
            int c = r.nextInt(60) + 40;
            int o = r.nextInt(80) + 1;
            int w = r.nextInt(80) + 1;
            for (int i = 1; i <= 100; i++) {
                assertEquals(WillThereBeEnoughSpace(c, o, w), WillThereBeEnoughSpace.enough(c, o, w));
            }
            System.out.println("100 random tests.");
        }
        //время затраченное на выполнение кода
        long time = System.nanoTime() - startTime;
        System.out.println(time);
    }

    private static int WillThereBeEnoughSpace(int co, int ono, int waito){
        return (ono+waito)<=co ? 0 : (co-(ono+waito))*-1;
    }}