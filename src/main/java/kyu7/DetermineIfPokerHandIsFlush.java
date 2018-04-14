/*
Determine if the poker hand is flush

Your function will be passed a string array with 5 strings each representing a poker card in the format "5H"
(5 of hearts) meaning the value of the card followed by the initial of its suit (Hearts, Spades, Diamonds or Clubs).
No jokers included

Your function should return true if the hand is flush meaning if the five cards are of the same suit

The possible card values are 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack or Knave (J), Queen (Q), King (K), Ace (A)

Eg.

AS, 3S, 9S, KS, 4S  should return true

AD, 4S, 7H, KS, 10S  should return False.
 */
package kyu7;

import java.util.Arrays;

public class DetermineIfPokerHandIsFlush {
    public static boolean CheckIfFlush(String[] cards) {
        String suit = cards[0].substring(cards[0].length() - 1, cards[0].length());
        return Arrays.stream(cards).allMatch(s -> s.endsWith(suit));
    }
}
