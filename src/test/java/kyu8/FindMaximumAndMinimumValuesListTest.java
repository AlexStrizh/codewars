package kyu8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class FindMaximumAndMinimumValuesListTest {

    private FindMaximumAndMinimumValuesList kata = new FindMaximumAndMinimumValuesList();
    private Random rand = new Random();

    @Test
    public void fixedMin()
    {
        assertEquals(-110, kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, kata.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(1, kata.min(new int[]{1, 2, 3, 4, 5, 10}));
        assertEquals(-10, kata.min(new int[]{-1, -2, -3, -4, -5, -10}));
    }

    @Test
    public void fixedMax()
    {
        assertEquals(56, kata.max(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(566, kata.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, kata.max(new int[]{5}));
        assertEquals(555, kata.max(new int[]{534,43,2,1,3,4,5,5,443,443,555,555}));
    }

    @Test
    public void randomTests()
    {
        for(int i = 0; i < 10; i++)
        {
            int randLng = 2 + (rand.nextInt(14) % 15);
            List<Integer> randList = new ArrayList<>();

            for(int l = 0;  l < randLng; l++)
            {
                randList.add(rand.nextInt());
            }

            assertEquals(Long.valueOf(Collections.min(randList)),
                    Long.valueOf(kata.min(randList.stream().mapToInt(e -> e).toArray())));
            assertEquals(Long.valueOf(Collections.max(randList)),
                    Long.valueOf(kata.max(randList.stream().mapToInt(e -> e).toArray())));
        }
    }
}