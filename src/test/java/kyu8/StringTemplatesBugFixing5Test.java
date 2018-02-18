package kyu8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class StringTemplatesBugFixing5Test {
    @Test
    public void fixedTests() {
        assertEquals(StringTemplatesBugFixing5.buildString("Cheese","Milk","Chocolate"),"I like Cheese, Milk, Chocolate!");
        assertEquals(StringTemplatesBugFixing5.buildString("Cheese","Milk"),"I like Cheese, Milk!");
        assertEquals(StringTemplatesBugFixing5.buildString("Chocolate"),"I like Chocolate!");
    }

    @Test
    public void randomTests() {
        String[] abase= new String[]{"Cheese","Milk","Chocolate","Anne", "Money","Micky","Rollercoasters","Beach","Water","WaterMelons","Coding","CodeWars","You"};
        Random myrand= new Random();
        for(int i=0;i<40;i++){
            List<String> lbase = Arrays.asList(abase);
            Collections.shuffle(lbase);
            String[] base= new String[]{};
            base=lbase.toArray(base);
            base=Arrays.copyOfRange(base, 0, Math.abs(myrand.nextInt(base.length)));
            System.out.println(Arrays.toString(base));
            String returnedString="I like "+ Arrays.toString(base).replaceAll("[\\[\\]]","") +"!";
            assertEquals(StringTemplatesBugFixing5.buildString(base),returnedString);
        }

    }
}