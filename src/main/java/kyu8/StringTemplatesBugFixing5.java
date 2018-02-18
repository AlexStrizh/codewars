/*
String Templates - Bug Fixing #5
Oh no! Timmy hasn't followed instructions very carefully and forgot how to use the new String
Template feature, Help Timmy with his string template so it works as he expects!
 */
package kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringTemplatesBugFixing5 {
    public static String buildString(String... args)
    {
        String result = Arrays.stream(args).collect(Collectors.joining(", "));
        return "I like " + result + "!";
    }
}
