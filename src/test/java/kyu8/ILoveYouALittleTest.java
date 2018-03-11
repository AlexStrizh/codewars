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
}