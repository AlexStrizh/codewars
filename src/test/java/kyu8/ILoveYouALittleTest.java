package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class ILoveYouALittleTest {
    @Test
    public void test1() {
        assertEquals(ILoveYouALittle.howMuchILoveYou(1), "I love you");
        assertEquals(ILoveYouALittle.howMuchILoveYou(2), "a little");
        assertEquals(ILoveYouALittle.howMuchILoveYou(6), "not at all");
    }

    @Test
    public void testRandomValues() {
        Random rand = new Random();
        for (int k=0;k<50;k++)
        {
            int n = rand.nextInt(100) + 0;

            String solution = ILoveYouALittleTest.howMuchILoveYou(n);
            System.out.println("Testing number = " + n + ", " + solution);
            assertEquals(ILoveYouALittle.howMuchILoveYou(n), solution);
        }
    }

    public static String howMuchILoveYou(int nb_petals) {
        nb_petals = nb_petals % 6;
        if (nb_petals == 1)
            return "I love you";
        if (nb_petals == 2)
            return "a little";
        if (nb_petals == 3)
            return "a lot";
        if (nb_petals == 4)
            return "passionately";
        if (nb_petals == 5)
            return "madly";
        if (nb_petals == 0)
            return "not at all";
        return "";
    }
}