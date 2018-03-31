package kyu7;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.*;

public class SortedYesNoHowTest {
    @Test
    public void test1() {
        int[] array = new int[] {1, 2};
        assertEquals("yes, ascending", SortedYesNoHow.isSortedAndHow(array));
    }

    @Test
    public void test2() {
        int[] array = new int[] {15, 7, 3, -8};
        assertEquals("yes, descending", SortedYesNoHow.isSortedAndHow(array));
    }

    @Test
    public void test3() {
        int[] array = new int[] {4, 2, 30};
        assertEquals("no", SortedYesNoHow.isSortedAndHow(array));
    }

    @Test
    public void testRandom1() {
        int[] array = randomArray(7);
        String actual = SortedYesNoHow.isSortedAndHow(Arrays.copyOf(array, array.length));
        String expected = isSortedAndHowSol(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testRandom2() {
        int[] array = randomArray(57);
        String actual = SortedYesNoHow.isSortedAndHow(Arrays.copyOf(array, array.length));
        String expected = isSortedAndHowSol(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testRandom3() {
        int[] array = randomArray(184);
        String actual = SortedYesNoHow.isSortedAndHow(Arrays.copyOf(array, array.length));
        String expected = isSortedAndHowSol(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testRandom4() {
        int[] array = randomArray(7392);
        String actual = SortedYesNoHow.isSortedAndHow(Arrays.copyOf(array, array.length));
        String expected = isSortedAndHowSol(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testRandom5() {
        int[] array = randomArray(12345);
        String actual = SortedYesNoHow.isSortedAndHow(Arrays.copyOf(array, array.length));
        String expected = isSortedAndHowSol(array);
        assertEquals(expected, actual);
    }

    private static int[] randomArray(int size) {
        Integer[] array = new java.util.Random().ints(-10000, 20001).boxed().limit(size).toArray(s -> new Integer[s]);
        int x = randomInt(0, 5);
        if (x == 1 || x == 2) Arrays.sort(array, (a, b) -> a - b);
        else if (x == 3 || x == 4) Arrays.sort(array, (a, b) -> b - a);
        return Arrays.stream(array).mapToInt(i -> i).toArray();
    }

    private static int randomInt(int min, int max) {
        return (int) Math.floor(min + Math.random() * max);
    }

    private static String isSortedAndHowSol(int[] array) {
        int[] asc = Arrays.stream(array).boxed().sorted().mapToInt(i -> i).toArray();
        int[] desc = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
        return Arrays.equals(array, asc) ? "yes, ascending" : (Arrays.equals(array, desc) ? "yes, descending" : "no");
    }
}