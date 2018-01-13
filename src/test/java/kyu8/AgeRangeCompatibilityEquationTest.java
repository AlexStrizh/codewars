package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class AgeRangeCompatibilityEquationTest {
    @Test
    public void exampleTests(){
        assertEquals("15-20", AgeRangeCompatibilityEquation.datingRange(17));
        assertEquals("27-66", AgeRangeCompatibilityEquation.datingRange(40));
        assertEquals("14-16", AgeRangeCompatibilityEquation.datingRange(15));
        assertEquals("24-56", AgeRangeCompatibilityEquation.datingRange(35));
        assertEquals("9-11", AgeRangeCompatibilityEquation.datingRange(10));
    }

    @Test
    public void basicTests(){
        assertEquals("33-92", AgeRangeCompatibilityEquation.datingRange(53));
        assertEquals("16-24", AgeRangeCompatibilityEquation.datingRange(19));
        assertEquals("10-13", AgeRangeCompatibilityEquation.datingRange(12));
        assertEquals("6-7", AgeRangeCompatibilityEquation.datingRange(7));
        assertEquals("23-52", AgeRangeCompatibilityEquation.datingRange(33));
    }

    @Test
    public void randomTests() {
        Random rnd = new Random();
        for (int i = 0; i < 50; i++) {
            int n = rnd.nextInt((100 - 1) + 1) + 1;
            String solution = solution(n);
            assertEquals(String.format("Random inputs: Testing for %1$d = %2$s", n, solution), solution, AgeRangeCompatibilityEquation.datingRange(n));
        }
    }

    private String solution(int age){
        double min, max;
        if (age <= 14){
            min = age * 0.9;
            max = age * 1.1;
        }
        else{
            min = (age/2) + 7;
            max = 2 * (age - 7);
        }
        return String.format("%1$d-%2$s", (int)min, (int)max);
    }
}