package kyu8.fundamentals;

public class SentenceSmash {
    public static String smash(String... words) {
        return String.join(" ", words).trim();
    }
}
