/*
Complete the method which accepts an array of integers, and returns one of the following:

"yes, ascending" - if the numbers in the array are sorted in an ascending order
"yes, descending" - if the numbers in the array are sorted in a descending order
"no" - otherwise
You can assume the array will always be valid, and there will always be one correct answer.
 */
package kyu7;

import java.util.Arrays;
import java.util.Collections;

public class SortedYesNoHow {
    public static String isSortedAndHow(int[] array) {
        int[] asc = Arrays.stream(array).boxed()
                .sorted()
                .mapToInt(Integer::intValue).toArray();
        int[] desc = Arrays.stream(array).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        if (Arrays.equals(array, asc))
            return "yes, ascending";
        else if (Arrays.equals(array, desc))
            return "yes, descending";
        else return "no";
    }
}
