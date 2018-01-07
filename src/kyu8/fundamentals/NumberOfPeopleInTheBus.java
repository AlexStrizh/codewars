package kyu8.fundamentals;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static int countPassengers(ArrayList<int[]> stops) {
        int inBus = 0;

        for (int[] element : stops) {
            inBus = inBus + element[0] - element[1];
        }

        return inBus;
    }
}
