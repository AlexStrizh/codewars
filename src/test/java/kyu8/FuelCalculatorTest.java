package kyu8;

import org.junit.Test;

import java.util.Locale;
import java.util.Random;

import static org.junit.Assert.*;

public class FuelCalculatorTest {
    @Test
    public void exampleTests(){
        assertEquals(5.65d, FuelCalculator.fuelPrice(5, 1.23d), 0.001d);
        assertEquals(18.40d, FuelCalculator.fuelPrice(8, 2.5d), 0.001d);
        assertEquals(27.50d, FuelCalculator.fuelPrice(5, 5.6d),  0.001d);
    }
    @Test
    public void randomTests() {
        Random rnd = new Random();
        for (int i = 0; i < 97; i++) {
            int litres = rnd.nextInt((200 - 1) + 1) + 1;
            double pricePerLiter = Double.parseDouble(String.format(Locale.US, "%.2f", 0.5 + (35.9 - 0.5) * rnd.nextDouble()));
            System.out.println(String.format(Locale.US, "Litres: %d, Price: %.2f", litres, pricePerLiter));
            assertEquals(solution(litres, pricePerLiter), FuelCalculator.fuelPrice(litres, pricePerLiter),  0.001d);
        }
    }

    private double solution(int litres, double pricePerLiter) {
        return Double.parseDouble(String.format(Locale.US, "%.2f", litres * (pricePerLiter - (litres > 10 ? 0.25 : 0.05 * Math.floor(litres/ 2)))));
    }
}