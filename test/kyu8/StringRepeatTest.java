package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class StringRepeatTest {
    @Test public void test4a() {
        assertEquals("aaaa", StringRepeat.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", StringRepeat.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", StringRepeat.repeatStr(5, ""));
    }
    @Test public void test0a() {
        assertEquals("", StringRepeat.repeatStr(0, "kata"));
    }
    @Test public void testNegativeRepeat() {
        assertEquals("", StringRepeat.repeatStr(-10, "kata"));
    }

    private final char[] characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQERSTUVWXYZ0123456789!@#$%^&*()-=_+[]{}|;:,.<>/?`~".toCharArray();

    @Test public void testRandom() {
        final Random rand = new Random();
        for (int testIteration = 0; testIteration < 10; ++testIteration) {
            final StringBuilder text = new StringBuilder(rand.nextInt(32));
            for (int i = 0; i < text.capacity(); ++i) {
                final int chi = rand.nextInt(characters.length);
                text.append(characters[chi]);
            }
            final String string = text.toString();

            final int timesToRepeat = rand.nextInt(32);
            final StringBuilder sb = new StringBuilder(timesToRepeat * string.length());
            for (int i = 0; i < timesToRepeat; ++i) {
                sb.append(text);
            }
            final String expected = sb.toString();

            assertEquals(expected, StringRepeat.repeatStr(timesToRepeat, string));
        }
    }
}