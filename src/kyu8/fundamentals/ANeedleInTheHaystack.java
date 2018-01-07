package kyu8.fundamentals;

import java.util.Arrays;

public class ANeedleInTheHaystack {
    private final static String target = "needle";
    private final static String message = "found the needle at position ";

    public static String findNeedle(Object[] haystack) {
        return String.format(message + "%d", Arrays.asList(haystack).indexOf(target));
    }
}