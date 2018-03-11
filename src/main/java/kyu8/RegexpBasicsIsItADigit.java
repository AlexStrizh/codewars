/*
Implement String#digit? (in Java StringUtils.isDigit(String)), which should return true if given object
is a digit (0-9), false otherwise.
 */
package kyu8;

public class RegexpBasicsIsItADigit {
    public static boolean isDigit(String s) {
       return s.matches("\\d");
    }
}
