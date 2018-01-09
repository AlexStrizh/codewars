package kyu8;

import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class ArrayPlusArrayTest {
    @Test
    public void basicTests() {
        assertEquals(21, ArrayPlusArray.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, ArrayPlusArray.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, ArrayPlusArray.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, ArrayPlusArray.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }


    private int check(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }

    private int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    @Test
    public void randomTests() {
        for(int i = 0; i< 20; i++) {
            int[] arr1 = new int[5];
            int[] arr2 = new int[5];
            for(int j = 0; j < 5; j++) {
                arr1[j] = this.randomInt(-10000, 10000);
                arr2[j] = this.randomInt(-10000, 10000);
            }

            assertEquals(this.check(arr1, arr2), ArrayPlusArray.arrayPlusArray(arr1, arr2));
        }
    }
}