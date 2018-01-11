package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class RemoveStringSpacesTest {
    @Test public void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", RemoveStringSpaces.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", RemoveStringSpaces.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", RemoveStringSpaces.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", RemoveStringSpaces.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", RemoveStringSpaces.noSpace("8j aam"));
    }

    private static final String chars = "abc defg hij klm no pq rstuvw xyz";

    @Test public void randomTests() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            int length = random.nextInt(15) + 1;
            for (int j = 0; j < length; j++) {
                int index = random.nextInt(chars.length());
                sb.append(chars.charAt(index));
            }
            String input = sb.toString();
            sb.setLength(0);
            assertEquals(input.replaceAll(" ", ""), RemoveStringSpaces.noSpace(input));
        }
    }
}