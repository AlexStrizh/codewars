/*
Write function avg which calculates average of numbers in given list.
 */
package kyu8;

import java.util.Arrays;

public class CalculateAverage {
    public static double find_average(int[] array){
        return Arrays.stream(array).average().getAsDouble();
    }
}

