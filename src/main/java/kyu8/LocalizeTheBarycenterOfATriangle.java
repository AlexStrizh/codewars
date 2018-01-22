/*
This is how our asked function should work: the result of the coordinates should be expressed up to four decimals,
(rounded result).

You know that the coordinates of the barycenter are given by the following formulas.

source: imgur.com

For additional information about this important point of a triangle see at: (https://en.wikipedia.org/wiki/Centroid)

Let's see some cases:

barTriang([4, 6], [12, 4], [10, 10]) ------> {8.6667, 6.6667}
barTriang([4, 2], [12, 2], [6, 10] ------> {7.3333, 4.6667}

The given points form a real or a degenerate triangle but in each case the above formulas can be used.

Enjoy it and happy coding!!
 */
package kyu8;

import java.math.BigDecimal;

public class LocalizeTheBarycenterOfATriangle {
    public static double[] barTriang(double[] x, double[] y, double[] z)
    {
        return new double[] {
                new BigDecimal((x[0] + y[0] + z[0]) / 3)
                        .setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue(),
                new BigDecimal((x[1] + y[1] + z[1]) / 3)
                        .setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue()};
    }
}
