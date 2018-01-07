package kyu8;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }
}
