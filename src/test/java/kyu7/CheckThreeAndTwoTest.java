package kyu7;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.junit.Assert.*;

public class CheckThreeAndTwoTest {
    @Test
    public void fixedTests() {
        assertEquals(true, new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
        assertEquals(false, new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' }));
        assertEquals(false, new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' }));
    }

    @Test
    public void randomTests() {
        Random random = new Random();
        char[] availableChars = new char[] {'a', 'b', 'c'};

        for (int i = 0; i < 50; i++) {
            char[] randomChars = new char[5];
            for (int j = 0; j < 5; j++) {
                randomChars[j] = availableChars[random.nextInt(3)];
            }

            assertEquals(
                    new TestSolution().checkThreeAndTwo(randomChars),
                    new CheckThreeAndTwo().checkThreeAndTwo(randomChars)
            );
        }
    }

    private final class TestSolution {
        public boolean checkThreeAndTwo(char[] chars) {
            Map<Character, Integer> occurences = new HashMap<>();

            for (char character : chars) {
                if (occurences.containsKey(character)) {
                    occurences.put(character, occurences.get(character) + 1);
                } else {
                    occurences.put(character, 1);
                }
            }

            boolean hasTwo = false;
            boolean hasThree = false;

            for (char character : occurences.keySet()) {
                if (occurences.get(character) == 2) hasTwo = true;
                if (occurences.get(character) == 3) hasThree = true;
            }

            return hasTwo && hasThree;
        }
    }
}