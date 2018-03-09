package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreYouPlayingBanjoTest {
    @Test
    public void PeopleThatDontPlayBanjo() {
        assertEquals( "Nope!" , AreYouPlayingBanjo.areYouPlayingBanjo("Adam"), "Adam does not play banjo");
        assertEquals( "Nope!" , AreYouPlayingBanjo.areYouPlayingBanjo("Paul"), "Paul does not play banjo");
        assertEquals( "Nope!" , AreYouPlayingBanjo.areYouPlayingBanjo("bravo"), "bravo does not play banjo");
    }
    @Test
    public void PeopleThatDoPlayBanjo() {
        assertEquals( "Nope!" , AreYouPlayingBanjo.areYouPlayingBanjo("Ringo"), "Ringo plays banjo");
        assertEquals( "Nope! Remember lower case counts, too!" , AreYouPlayingBanjo.areYouPlayingBanjo("rolf"), "rolf plays banjo");
    }
}