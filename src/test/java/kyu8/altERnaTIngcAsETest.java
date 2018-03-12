package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class altERnaTIngcAsETest {
    private static final String CHARS = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789 .,;:!?/";

    @Test
    public void fixedTests() {
        assertEquals("HELLO WORLD", altERnaTIngcAsE.toAlternativeString("hello world"));
        assertEquals("hello world", altERnaTIngcAsE.toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", altERnaTIngcAsE.toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", altERnaTIngcAsE.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", altERnaTIngcAsE.toAlternativeString(altERnaTIngcAsE.toAlternativeString("Hello World")));
        assertEquals("12345", altERnaTIngcAsE.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", altERnaTIngcAsE.toAlternativeString("1a2b3c4d5e"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", altERnaTIngcAsE.toAlternativeString("StringUtils.toAlternatingCase"));
    }

    @Test
    public void kataTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", altERnaTIngcAsE.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", altERnaTIngcAsE.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", altERnaTIngcAsE.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", altERnaTIngcAsE.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }

    @Test
    public void randomTests() {
        Random random = new Random();
        for (int i = 1; i <= 50; i++) {
            int length = random.nextInt(30) + 1;
            StringBuilder stringBuilder = new StringBuilder(length);
            for (int k = 1; k <= length; k++) stringBuilder.append(CHARS.charAt(random.nextInt(CHARS.length())));
            String testString = stringBuilder.toString();
            assertEquals(solution(testString), altERnaTIngcAsE.toAlternativeString(testString));
        }
    }

    private String solution(String string) {
        return string.chars().map(c -> Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c)).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}