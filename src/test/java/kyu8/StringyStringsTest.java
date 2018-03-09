package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class StringyStringsTest {
    private Random randGen = new Random();

    @Test
    public void startTest() {
        assertEquals("Your string should start with a 1", '1', StringyStrings.stringy(3).charAt(0));
    }

    @Test
    public void lengthTests() {
        System.out.println("Should return the correct length\n10 random tests...");
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            assertEquals("Wrong length using size " + size, size, StringyStrings.stringy(size).length());
        }
    }

    @Test
    public void stringTests() {
        System.out.println("Should return the correct string\n20 random tests...");
        for (int i = 0; i < 20; i++) {
            int size = randGen.nextInt(50);
            assertEquals("Whoops, wrong string with size " + size, stringyAns(size), StringyStrings.stringy(size));
        }
    }

    private String stringyAns(int size) {
        String retStr = "";
        for (int i = 0; i < size; i++) {
            retStr += (i+1) % 2;
        }
        return retStr;
    }
}