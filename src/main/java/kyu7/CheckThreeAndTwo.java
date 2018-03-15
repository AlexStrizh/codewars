/*
Given an array with 5 string values 'a', 'b' or 'c'. Check if the array contains three and two of the same values.

For example:

['a', 'a', 'a', 'b', 'b'] => true  // 3 x 'a' and 2 x 'b'
['a', 'b', 'c', 'b', 'c'] => false // 1 x 'a', 2 x 'b' and 2 x 'c'
['a', 'a', 'a', 'a', 'a'] => false // 5 x 'a'
 */
package kyu7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckThreeAndTwo {
    public boolean checkThreeAndTwo(char[] chars) {

        List<Character> collect = IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i])
                .distinct()
                .collect(Collectors.toList());

        int r = (int) IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i]).filter(w -> w.equals(collect.get(0))).count();

        return (collect.size() == 2) && (r == 2 || r == 3);
    }
}
