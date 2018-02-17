/*
Input: Array of elements

["h","o","l","a"]

Output: String with comma delimited elements of the array in th same order.

"h,o,l,a"
 */
package kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintingArrayElementsWithCommaDelimiters {
    public static String printArray(Object array[]) {
        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}
