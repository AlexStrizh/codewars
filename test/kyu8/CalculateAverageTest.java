package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateAverageTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, CalculateAverage.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, CalculateAverage.find_average(new int[]{1, 2, 3}), DELTA);
        assertEquals(2.5, CalculateAverage.find_average(new int[]{1, 2, 3, 4}), DELTA);

        System.out.println("Running 20 random tests...");

        for(int i=0; i<20; i++){
            int[] arr = randArray();
            assertEquals(solution(arr), CalculateAverage.find_average(arr), DELTA);
        }
    }

    private static int[] randArray(){
        int size = (int)Math.floor(Math.random()*5 + 2);
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = (int)Math.floor(Math.random()*20 + 1);
        }
        return arr;
    }

    private static double solution(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return (sum + 0.0) / arr.length;
    }
}