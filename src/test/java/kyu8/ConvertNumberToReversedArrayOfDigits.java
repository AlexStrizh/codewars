/*
Convert number to reversed array of digits
Given a random number:

C#: long;
C++: unsigned long;
You have to return the digits of this number within an array in reverse order.

Example:
348597 => [7,9,5,8,4,3]
 */
package kyu8;

import java.util.Arrays;

public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        /* My first version.
        String[] reverse  = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        return Arrays.stream(reverse).mapToInt(Integer::valueOf).toArray();
        */

        // Best practice.
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
