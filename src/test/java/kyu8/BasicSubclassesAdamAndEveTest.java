package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicSubclassesAdamAndEveTest {
    @Test
    public void makingAdam(){
        Human[] paradise = BasicSubclassesAdamAndEve.create();
        assertEquals("Adam are a man", true ,paradise[0] instanceof Man);
    }
    @Test
    public void makingEva(){
        Human[] paradise = BasicSubclassesAdamAndEve.create();
        assertEquals("Eva are a woman", true, paradise[1] instanceof Woman);
    }
    @Test
    public void adamAreHuman(){
        Human[] paradise = BasicSubclassesAdamAndEve.create();
        assertEquals("Adam are human race", true, paradise[0] instanceof Human);
    }
    @Test
    public void evaAreHuman(){
        Human[] paradise = BasicSubclassesAdamAndEve.create();
        assertEquals("Eva are human race", true, paradise[1] instanceof Human);
    }
    @Test
    public void listHaveRightLenght(){
        Human[] paradise = BasicSubclassesAdamAndEve.create();
        assertEquals("It`s only two two persons on earth", 2, paradise.length);
    }
}