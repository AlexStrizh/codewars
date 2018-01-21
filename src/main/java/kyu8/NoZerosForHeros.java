/*
Numbers ending with zeros are boring.

They might be fun in your world, but not here.

Get rid of them. Only the ending ones.

1450 -> 145
960000 -> 96
1050 -> 105
-1050 -> -105

Zero alone is fine, don't worry about it. Poor guy anyway
 */
package kyu8;

public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        while (n !=0 && n % 10 == 0) n = n / 10;
        return n;
    }

}
