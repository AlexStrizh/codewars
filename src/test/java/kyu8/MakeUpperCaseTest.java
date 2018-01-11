package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakeUpperCaseTest {

    MakeUpperCase u = new MakeUpperCase();

    @Test
    public void testSomething() {
        assertEquals("HELLO",u.MakeUpperCase("hello"));
        assertEquals("HELLO WORLD",u.MakeUpperCase("hello world"));
        assertEquals("HELLO WORLD !",u.MakeUpperCase("hello world !"));
        assertEquals("HELLO WORLD !",u.MakeUpperCase("heLlO wORLd !"));
        assertEquals("1,2,3 HELLO WORLD!",u.MakeUpperCase("1,2,3 hello world!"));
    }

}