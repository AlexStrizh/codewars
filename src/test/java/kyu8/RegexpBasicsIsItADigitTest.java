package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class RegexpBasicsIsItADigitTest {
    private static final String SYMBOLS = "|!\"£$%&/()=?^\\'[]{}#@+-*/<>,.;:_ 0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ\n\t~`";

    @Test
    public void exampleTests() {
        assertFalse(RegexpBasicsIsItADigit.isDigit(""));
        assertTrue(RegexpBasicsIsItADigit.isDigit("7"));
        assertFalse(RegexpBasicsIsItADigit.isDigit(" "));
        assertFalse(RegexpBasicsIsItADigit.isDigit("a"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("a5"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("14"));
    }

    @Test
    public void fixedTests() {
        assertFalse(RegexpBasicsIsItADigit.isDigit(""));
        assertFalse(RegexpBasicsIsItADigit.isDigit("!"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("\\"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("#"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("$"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("%"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("&"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("'"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("("));
        assertFalse(RegexpBasicsIsItADigit.isDigit(")"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("*"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("+"));
        assertFalse(RegexpBasicsIsItADigit.isDigit(","));
        assertFalse(RegexpBasicsIsItADigit.isDigit("-"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("."));
        assertFalse(RegexpBasicsIsItADigit.isDigit("/"));
        assertFalse(RegexpBasicsIsItADigit.isDigit(":"));
        assertFalse(RegexpBasicsIsItADigit.isDigit(";"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("<"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("="));
        assertFalse(RegexpBasicsIsItADigit.isDigit(">"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("?"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("@"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("["));
        assertFalse(RegexpBasicsIsItADigit.isDigit("]"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("^"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("_"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("`"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("{"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("|"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("}"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("~"));

        assertTrue(RegexpBasicsIsItADigit.isDigit("0"));
        assertTrue(RegexpBasicsIsItADigit.isDigit("1"));
        assertTrue(RegexpBasicsIsItADigit.isDigit("2"));
        assertTrue(RegexpBasicsIsItADigit.isDigit("3"));
        assertTrue(RegexpBasicsIsItADigit.isDigit("4"));
        assertTrue(RegexpBasicsIsItADigit.isDigit("5"));
        assertTrue(RegexpBasicsIsItADigit.isDigit("6"));
        assertTrue(RegexpBasicsIsItADigit.isDigit("7"));
        assertTrue(RegexpBasicsIsItADigit.isDigit("8"));
        assertTrue(RegexpBasicsIsItADigit.isDigit("9"));

        assertFalse(RegexpBasicsIsItADigit.isDigit("A"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("B"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("C"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("D"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("E"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("F"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("G"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("H"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("I"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("J"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("K"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("L"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("M"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("N"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("O"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("P"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("Q"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("R"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("S"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("T"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("U"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("V"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("W"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("X"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("Y"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("Z"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("a"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("b"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("c"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("d"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("e"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("f"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("g"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("h"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("i"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("j"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("k"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("l"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("m"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("n"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("o"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("p"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("q"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("r"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("s"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("t"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("u"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("v"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("w"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("x"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("y"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("z"));

        assertFalse(RegexpBasicsIsItADigit.isDigit("1\n0"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("1\n"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("1 "));
        assertFalse(RegexpBasicsIsItADigit.isDigit(" 1"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("123"));
    }

    @Test
    public void randomTests() {
        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            final int length = random.nextInt(10) < 9 ? 1 : (random.nextBoolean() ? 2 : 3);
            StringBuilder builder = new StringBuilder(length);
            for (int j = 1; j <= length; j++) builder.append(SYMBOLS.charAt(random.nextInt(SYMBOLS.length())));
            final String testString = builder.toString();
            assertEquals(solution(testString), RegexpBasicsIsItADigit.isDigit(testString));
        }
    }

    private boolean solution(String s) {
        return s.matches("\\A\\d\\z");
    }
}