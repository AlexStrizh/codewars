package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class RepeatItTest {
    private static final String NOT_A_STRING = "Not a string";
    private static final int NUM_RANDOM_TESTS = 40;

    @Test
    public void testStar() {
        repeatTest("*", 3, "***");
    }

    @Test
    public void testHello() {
        repeatTest("Hello", 11, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello");
    }

    @Test
    public void test243624() {
        repeatTest("243624", 22, "243624243624243624243624243624243624243624243624243624243624243624243624243624243624243624243624243624243624243624243624243624243624");
    }

    @Test
    public void testArray() {
        repeatTest(new String[0], 3, NOT_A_STRING);
    }

    @Test
    public void testInt() {
        repeatTest(24, 3, NOT_A_STRING);
    }

    @Test
    public void testBoolean() {
        repeatTest(true, 3, NOT_A_STRING);
    }

    @Test
    public void testNIsZero() {
        repeatTest("Hello", 0, "");
    }

    @Test
    public void testRandoms() {
        String[] possibleToRepeat = {"Arryn","Baratheon","Bolton","Greyjoy","Lannister","Martell","Targaryen","Stark"};
        Random random = new Random();
        for(int i = 0; i < NUM_RANDOM_TESTS; i++) {
            String toRepeat = possibleToRepeat[random.nextInt(possibleToRepeat.length)];
            int n = random.nextInt(10);
            repeatTest(toRepeat, n, solution(toRepeat, n));
        }
    }

    private void repeatTest(final Object toRepeat, final int n, final String expected) {
        final String testMessage = String.format("Testing with toRepeat = %s and n = %d", toRepeat, n);
        assertEquals(testMessage,  expected, RepeatIt.repeatString(toRepeat, n));
    }

    private String solution(final Object toRepeat, final int n) {
        if(toRepeat instanceof String) {
            StringBuilder stringBuilder = new StringBuilder(n);
            for(int i = 0; i < n; i ++) {
                stringBuilder.append(toRepeat);
            }
            return stringBuilder.toString();
        } else {
            return "Not a string";
        }
    }
}