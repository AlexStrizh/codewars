package kyu8.fundamentals.aneedleinthehaystack;

public class ANeedleInTheHaystack {

    private final static String target = "needle";
    private final static String message = "found the needle at position ";

    public static String findNeedle(Object[] haystack) {

        int i;
        for (i = 0; i < haystack.length; i++) {
            if (haystack[i] == null) continue;
            if (haystack[i].equals(target)) break;
        }

        return message + i;
    }
}