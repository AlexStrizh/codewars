package kyu8.fundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

public class SentenceSmashTest {
    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SentenceSmash.smash(new String[] { "Bilal", "Djaghout" }));
        assertEquals("hello world", SentenceSmash.smash(new String[] {"hello", "world"}));
        assertEquals("hello amazing world", SentenceSmash.smash(new String[] {"hello", "amazing", "world"}));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SentenceSmash.smash(new String[] {}));
    }


    @Test
    public void validateOneWord() {
        assertEquals("Bilal", SentenceSmash.smash(new String[] {"Bilal"}));
        assertEquals("Test", SentenceSmash.smash(new String[] {"Test"}));
    }
}