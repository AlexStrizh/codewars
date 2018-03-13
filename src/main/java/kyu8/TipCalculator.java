/*
Write a function, calculateTip(amount, rating) which calculates how much you need to tip based on the total
amount of the bill and the service.

You need to consider the following ratings:

Terrible: tip 0%
Poor: tip 5%
Good: tip 10%
Great: tip 15%
Excellent: tip 20%
The rating is case insensitive. If an unrecognised rating is input, then you need to return:

"Rating not recognised" in Javascript, Python and Ruby...
...or null in Java
...or -1 in C#
Because you're a nice person, you always round up the tip, regardless of the service.
 */
package kyu8;

public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        switch (rating.toLowerCase()) {
            case  "terrible":
                return 0;
            case  "poor":
                return (int) Math.ceil(amount * 0.05);
            case  "good":
                return (int) Math.ceil(amount * 0.10);
            case  "great":
                return (int) Math.ceil(amount * 0.15);
            case  "excellent":
                return (int) Math.ceil(amount * 0.20);
        }
        return null;
    }
}
