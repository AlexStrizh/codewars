/*
Write a function called repeatStr which repeats the given string string exactly n times.

repeatStr(6, "I") // "IIIIII"
repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */
package kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return IntStream.range(0, repeat).mapToObj(i -> string)
                .collect(Collectors.joining());
    }
}
