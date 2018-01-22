package kyu8;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LocalizeTheBarycenterOfATriangleTest {
    private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    private static double round4Sol(double d) {
        return Math.floor(d * 10000 +.5) / 10000;
    }
    public static String barTriangSol(double[] x, double[] y, double[] z)
    {
        double[] res = new double[]{round4Sol((x[0]+y[0]+z[0])/3.0), round4Sol((x[1]+y[1]+z[1])/3.0)};
        return Arrays.toString(res);
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[8.6667, 6.6667]", Arrays.toString(LocalizeTheBarycenterOfATriangle.barTriang(
                new double[]{4,6}, new double[]{12,4}, new double[]{10,10})));
        assertEquals("[7.3333, 4.6667]", Arrays.toString(LocalizeTheBarycenterOfATriangle.barTriang(
                new double[]{4,2}, new double[]{12,2}, new double[]{6,10})));
        assertEquals("[9.3333, 5.3333]", Arrays.toString(LocalizeTheBarycenterOfATriangle.barTriang(
                new double[]{4,8}, new double[]{8,2}, new double[]{16,6})));
        assertEquals("[0.0, 3.0]", Arrays.toString(LocalizeTheBarycenterOfATriangle.barTriang(
                new double[]{0,0}, new double[]{1,3}, new double[]{-1,6})));
        assertEquals("[3.0, 0.0]", Arrays.toString(LocalizeTheBarycenterOfATriangle.barTriang(
                new double[]{0,0}, new double[]{1,6}, new double[]{8,-6})));

    }
    @Test
    public void test1() {
        System.out.println("100 Random Tests");
        for (int i = 0; i < 100; i++) {
            double a = randInt(1, 8);
            double b = randInt(11, 15);
            double c = randInt(12, 20);
            assertEquals(LocalizeTheBarycenterOfATriangleTest.barTriangSol(
                    new double[]{a,0}, new double[]{c+0.25,0.5}, new double[]{20,b+0.5}),
                    Arrays.toString(LocalizeTheBarycenterOfATriangle.barTriang(
                            new double[]{a,0}, new double[]{c+0.25,0.5}, new double[]{20,b+0.5})));
        }
    }
}