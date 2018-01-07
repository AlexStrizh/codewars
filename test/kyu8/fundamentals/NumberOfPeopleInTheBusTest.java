package kyu8.fundamentals;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NumberOfPeopleInTheBusTest {

    NumberOfPeopleInTheBus metro = new NumberOfPeopleInTheBus();

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        assertEquals(5, metro.countPassengers(list));
    }

}