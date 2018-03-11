package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegexpBasicsIsItADigitTest {
    @Test
    public void fixedTests() {
        assertFalse(RegexpBasicsIsItADigit.isDigit(""));
        assertTrue(RegexpBasicsIsItADigit.isDigit("7"));
        assertFalse(RegexpBasicsIsItADigit.isDigit(" "));
        assertFalse(RegexpBasicsIsItADigit.isDigit("a"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("a5"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("14"));
    }
}