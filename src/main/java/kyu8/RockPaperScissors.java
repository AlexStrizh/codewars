/*
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples:

rps('scissors','paper') // Player 1 won!
rps('scissors','rock') // Player 2 won!
rps('paper','paper') // Draw!
 */
package kyu8;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";

        if (p1.equals("rock"))
            if (p2.equals("scissors")) return "Player 1 won!";
            else return "Player 2 won!";
        if (p1.equals("scissors"))
            if (p2.equals("paper")) return "Player 1 won!";
            else return "Player 2 won!";
        if (p1.equals("paper"))
            if (p2.equals("rock")) return "Player 1 won!";
            else return "Player 2 won!";
        return null;
    }
}
