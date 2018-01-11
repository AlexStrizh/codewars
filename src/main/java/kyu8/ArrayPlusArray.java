/*
I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements.
I'll appreciate for your help.

P.S. Each array includes only integer numbers. Output is a number too.
 */
package kyu8;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).sum();
    }
}
