/*
Create a class Ghost

Ghost objects are instantiated without any arguments.

Ghost objects are given a random color attribute of white" or "yellow" or "purple" or "red" when instantiated

Ghost ghost = new Ghost();
ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
 */
package kyu8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ColorGhost {
    private static Map<Integer, String> map = new HashMap();
    private String color;

    static {
        map.put(0, "white");
        map.put(1, "yellow");
        map.put(2, "purple");
        map.put(3, "red");
    }

    public ColorGhost() {
        Random random = new Random();
        this.color = map.get(random.nextInt(4));
    }

    public String getColor() {
        return color;
    }
}
