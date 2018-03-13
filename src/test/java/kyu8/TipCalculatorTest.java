package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class TipCalculatorTest {
    private static final String[] RATINGS = {"terrible", "poor", "good", "great", "excellent"};
    private static final String[] NOISE = {"?", "!", ".", ",", "$", "&", "%"};

    @Test
    public void basicTests() {
        assertEquals(new Integer(2), TipCalculator.calculateTip(30d, "poor"));
        assertEquals(new Integer(4), TipCalculator.calculateTip(20d, "Excellent"));
        assertEquals(new Integer(17), TipCalculator.calculateTip(107.65, "GReat"));
        assertNull(TipCalculator.calculateTip(20d, "hi"));
        assertNull(TipCalculator.calculateTip(10d, "great!"));
    }

    @Test
    public void randomTests() {
        Random random = new Random();
        for (int n = 1; n <= 50; n++) {
            double amount = random.nextInt(10000) / 100d;
            StringBuilder builder = RATINGS[random.nextInt(5)].codePoints()
                    .map(c -> random.nextBoolean() ? Character.toUpperCase(c) : c)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint,StringBuilder::append);
            if (random.nextBoolean()) {
                int index = random.nextInt(builder.length());
                builder.replace(index, index + 1, NOISE[random.nextInt(NOISE.length)]);
            }
            String rating = builder.toString();
            assertEquals(calculateTipSolution(amount, rating), TipCalculator.calculateTip(amount, rating));
        }
    }

    private Integer calculateTipSolution(double amount, String rating) {
        for (int i = 0; i <= 4; i++) {
            if (RATINGS[i].equalsIgnoreCase(rating))
                return new Integer((int) Math.ceil(amount * 0.05 * i));
        }
        return null;
    }
}