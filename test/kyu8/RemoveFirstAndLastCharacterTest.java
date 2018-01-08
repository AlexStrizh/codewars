package kyu8;

import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

import static org.junit.Assert.*;

public class RemoveFirstAndLastCharacterTest {
    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveFirstAndLastCharacter.remove("eloquent"));
        assertEquals("ountr", RemoveFirstAndLastCharacter.remove("country"));
        assertEquals("erso", RemoveFirstAndLastCharacter.remove("person"));
        assertEquals("lac", RemoveFirstAndLastCharacter.remove("place"));
    }


    @Test
    public void testRemovalWithRandomString() {
        for (int i = 0; i < 6; i++) {
            String randStr = randomString(random.nextInt(21) + 10);
            assertEquals(removeChars(randStr), RemoveFirstAndLastCharacter.remove(randStr));
        }
    }

    private static final Random random = new SecureRandom();

    private static String removeChars(String str) {
        return str.substring(1, str.length() - 1);
    }

    private static String randomString(int len) {
        StringBuilder sb = new StringBuilder();

        while (len > 0) {
            // char from '!' to '~'
            sb.append((char) (random.nextInt(94) + 33));
            len--;
        }

        return sb.toString();
    }
}