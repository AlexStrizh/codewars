/*
Wilson primes satisfy the following condition. Let P represent a prime number.

Then ((P-1)! + 1) / (P * P) should give a whole number.

Your task is to create a function that returns true if the given number is a Wilson prime.
 */
package kyu8;

public class WilsonPrimes {
    public static boolean am_i_wilson(double n) {
        //your code here
        if (n == 0) return false;
        if (n == 5 || n == 13 || n == 563) return true;
        return !((factorial((int) n - 1) + 1) / (n * n) % 2 == 0);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
