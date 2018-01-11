/*
In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

Example:

ReturnNegative.makeNegative(1); // return -1
ReturnNegative.makeNegative(-5); // return -5
ReturnNegative.makeNegative(0); // return 0

Notes:

The number can be negative already, in which case no change is required.
Zero (0) can't be negative, see examples above.
*/

package kyu8;

public class ReturnNegative {
    public static int makeNegative(final int x) {
        return -Math.abs(x);
    }
}
