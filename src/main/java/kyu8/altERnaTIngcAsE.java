/*
altERnaTIng cAsE <=> ALTerNAtiNG CaSe
Define to_alternating_case(char*) such that each lowercase letter becomes uppercase and each uppercase letter
becomes lowercase. For example:

char source[] = "hello world";
char *upperCase = to_alternating_case(source);
(void)puts(upperCase); // outputs: HELLO WORLD

char source[] = "HELLO WORLD";
char *upperCase = to_alternating_case(source);
(void)puts(upperCase); // outputs: hello world

char source[] = "HeLLo WoRLD";
char *upperCase = to_alternating_case(source);
(void)puts(upperCase); // outputs: hEllO wOrld
 */
package kyu8;

public class altERnaTIngcAsE {
    public static String toAlternativeString(String string) {
         return string.chars()
             .map(i -> Character.isLowerCase(i) ? Character.toUpperCase(i) : Character.toLowerCase(i))
             .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
             .toString();
    }
}
