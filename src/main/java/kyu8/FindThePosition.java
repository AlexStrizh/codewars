/*
When provided with a letter, return its position in the alphabet.

Input :: "a"

Ouput :: "Position of alphabet: 1"

This kata is meant for beginners. Rank and upvote to bring it out of beta
 */
package kyu8;

public class FindThePosition {
    public static String position(char alphabet)
    {
        return "Position of alphabet: " + (alphabet - 96);
    }
}
