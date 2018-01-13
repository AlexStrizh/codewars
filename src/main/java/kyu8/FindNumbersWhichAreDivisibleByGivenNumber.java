/*
Write a function which takes two arguments and returns all numbers which are divisible by given divisor.
First argument is array of numbers and the second is divisor.

Example

divisibleBy([1,2,3,4,5,6], 2) == [2,4,6]
divisibleBy([1,2,3,4,5,6], 2) == [2,4,6]
 */
package kyu8;

import java.util.Arrays;

public class FindNumbersWhichAreDivisibleByGivenNumber {
    public static int[] divisibleBy(int[] numbers, int divider) {
       return Arrays.stream(numbers).filter(n -> n % divider == 0).toArray();
    }
}
