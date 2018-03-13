package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class LarioAndMuigiPipeProblemTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, LarioAndMuigiPipeProblem.pipeFix(new int[] {1,2,3,5,6,8,9}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, LarioAndMuigiPipeProblem.pipeFix(new int[] {1,2,3,12}));
        assertArrayEquals(new int[] {6,7,8,9}, LarioAndMuigiPipeProblem.pipeFix(new int[] {6,9}));
        assertArrayEquals(new int[] {-1,0,1,2,3,4}, LarioAndMuigiPipeProblem.pipeFix(new int[] {-1,4}));
        assertArrayEquals(new int[] {1,2,3}, LarioAndMuigiPipeProblem.pipeFix(new int[] {1,2,3}));
    }
}