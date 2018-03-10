/*
Given an array of integers.

Return an array, where the first element is the count of positives numbers
and the second element is sum of negative numbers.

If the input array is empty or null, return an empty array:

C#/Java: new int[] {} / new int[0];
C++: std::vector<int>();
JavaScript/CoffeeScript/PHP/Haskell: [];
Rust: Vec::<i32>::new();

ATTENTION!
The passed array should NOT be changed. Read more here.
 */
package kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountOfPositivesSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if ((input == null) || (input.length == 0)) {
            return new int[0];
        }
        return new int[] {(int) Arrays.stream(input).filter(value -> value > 0).count(), Arrays.stream(input).filter(value -> value < 0).sum()};
    }
}
