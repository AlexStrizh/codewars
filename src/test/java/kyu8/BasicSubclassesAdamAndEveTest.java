package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicSubclassesAdamAndEveTest {
    @Test
    public void makingAdam(){
        Human[] paradise = BasicSubclassesAdamAndEve.create();
        assertEquals("Adam are a man", true ,paradise[0] instanceof Man);
    }

}