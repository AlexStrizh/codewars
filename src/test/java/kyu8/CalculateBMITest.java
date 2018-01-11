package kyu8;

import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;

import static org.junit.Assert.*;

public class CalculateBMITest {
    @Test
    public void testBMI() {
        assertEquals("Underweight", CalculateBMI.bmi(50, 1.80));
        assertEquals("Normal", CalculateBMI.bmi(80, 1.80));
        assertEquals("Overweight", CalculateBMI.bmi(90, 1.80));
        assertEquals("Obese", CalculateBMI.bmi(100, 1.80));
    }
    @Test
    public void testRandom() {
        System.out.println("100 Random tests");
        java.util.Random r = new java.util.Random();
        for(int i = 0; i < 99; i++) {
            double randomW = 40+r.nextDouble()*80;
            double randomH = r.nextDouble()+0.50*2.23;
            assertEquals(this.b(randomW, randomH), CalculateBMI.bmi(randomW, randomH));
        }
    }

    private static String b(double w, double h) {
        double bmi = w/(h*h);
        return bmi>30.0 ? "Obese" : bmi<=30.0 && bmi>25.0 ? "Overweight" : bmi<=18.5 ? "Underweight" : "Normal";
    }
}