package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindThePositionTest {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", FindThePosition.position('a'));
        assertEquals("Position of alphabet: 26", FindThePosition.position('z'));
        assertEquals("Position of alphabet: 5", FindThePosition.position('e'));
    }

    @Test
    public void randomTests() {
        for(int i=0;i<97;i++)
        {
            String a = "abcdefghijklmnopqrstuvwxyz";
            char b = a.charAt((int)(Math.random()*26));
            System.out.println(b);
            assertEquals("Position of alphabet: " + (b-96), FindThePosition.position(b));
        }
    }
}