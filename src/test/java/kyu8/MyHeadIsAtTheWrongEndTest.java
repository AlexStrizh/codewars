package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class MyHeadIsAtTheWrongEndTest {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new String[]{ "tail", "body", "head" },
                MyHeadIsAtTheWrongEnd.fixTheMeerkat(new String[]{ "head", "body", "tail" }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new String[]{ "tails", "body", "heads" },
                MyHeadIsAtTheWrongEnd.fixTheMeerkat(new String[]{ "heads", "body", "tails" }));
    }


    @Test
    public void exampleTest3() {
        assertArrayEquals(new String[]{ "bottom", "middle", "top" },
                MyHeadIsAtTheWrongEnd.fixTheMeerkat(new String[]{ "top", "middle", "bottom" }));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new String[]{ "lower legs", "torso", "upper legs" },
                MyHeadIsAtTheWrongEnd.fixTheMeerkat(new String[]{ "upper legs", "torso", "lower legs" }));
    }

    @Test
    public void exampleTest5() {
        assertArrayEquals(new String[]{ "ground", "rainbow", "sky" },
                MyHeadIsAtTheWrongEnd.fixTheMeerkat(new String[]{ "sky", "rainbow", "ground" }));
    }

    @Test
    public void randomTests() {
        String[] words = { "Kenshiro","Raoh","Kaiou","Toki","Hyo","Jagi","Han","Souther","Falco","Rei","Shoki","Juda","Taiga","Shin","Boltz","Shin","Soria" };
        Random random = new Random();

        for (int i = 0; i < 64; ++i) {
            String word1 = words[random.nextInt(words.length)];
            String word2 = words[random.nextInt(words.length)];
            String word3 = words[random.nextInt(words.length)];

            assertArrayEquals(new String[]{ word1, word2, word3 },
                    MyHeadIsAtTheWrongEnd.fixTheMeerkat(new String[]{ word3, word2, word1 }));
        }
    }
}