package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class AStrangeTripToTheMarketTest {
    @Test
    public void testBasicTrue() {
        String n = "Your girlscout cookies are ready to ship. Your total comes to tree fiddy";
        System.out.println(n);
        assertTrue(AStrangeTripToTheMarket.isLockNessMonster(n));
    }
    @Test
    public void testBasic2True() {
        String n = "Howdy Pardner. Name's Pete Lexington. I reckon you're the kinda stiff who carries about tree fiddy?";
        System.out.println(n);
        assertTrue(AStrangeTripToTheMarket.isLockNessMonster(n));
    }
    @Test
    public void testDifficultTrue() {
        String n = "I'm from Scottland. I moved here to be with my family sir. Please, $3.50 would go a long way to help me find them";
        System.out.println(n);
        assertTrue(AStrangeTripToTheMarket.isLockNessMonster(n));
    }
    @Test
    public void testBasicFalse() {
        String n = "Yo, I heard you were on the lookout for AStrangeTripToTheMarket. Let me know if you need assistance.";
        System.out.println(n);
        assertFalse(AStrangeTripToTheMarket.isLockNessMonster(n));
    }
    @Test
    public void testHarderFalse() {
        String n = "I will absolutely, positively, never give that darn Lock Ness Monster any of my three dollars and fifty cents";
        System.out.println(n);
        assertFalse(AStrangeTripToTheMarket.isLockNessMonster(n));
    }
    @Test
    public void testHardestFalse() {
        String n = "Did I ever tell you about my run with that paleolithic beast? He tried all sorts of ways to get at my three dolla and fitty cent? I told him 'this is MY 4 dolla!'. He just wouldn't listen. ";
        System.out.println(n);
        assertFalse(AStrangeTripToTheMarket.isLockNessMonster(n));
    }
}