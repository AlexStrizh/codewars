/*
Write a function that takes a string which has integers inside it separated by spaces, and your task is to convert
each integer in the string into an integer and return their sum.

Example
summy("1 2 3")  ==> 6

Good luck!
 */
package kyu7;

import java.util.Arrays;

public class Summy {
    static long summy(String stringOfInts) {
        return Arrays.stream(stringOfInts.split(" "))
                .mapToLong(i -> Long.parseLong(i))
                .reduce(0, Long::sum);
    }
}
