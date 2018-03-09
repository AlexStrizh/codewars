package kyu8;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class CirclesInPolygonsTest {

    @Test
    public void testExamples(){
        //Square with sides of 5 units
        CirclesInPolygons poly=new CirclesInPolygons(4, 5);
        assertEquals("5.000", String.format(Locale.US, "%.3f", poly.circleDiameter()));

        //Octogon with sides of 9 units
        poly=new CirclesInPolygons(8, 9);
        assertEquals("21.728", String.format(Locale.US,"%.3f", poly.circleDiameter()));

        //Triangle with sides of 4 units
        poly=new CirclesInPolygons(3, 4);
        assertEquals("2.309", String.format(Locale.US,"%.3f", poly.circleDiameter()));
    }

    @Test
    public void testRandom(){
        CirclesInPolygons poly;
        RealCirclesInPolygons real;
        for (int i = 0; i < 30; i++) {
            int sides=(int) (Math.random()*12+3);
            int sideLength=(int) (Math.random()*300+1);
            poly=new CirclesInPolygons(sides, sideLength);
            real=new RealCirclesInPolygons(sides, sideLength);
            assertEquals("Case sides: "+sides+", length: "+sideLength+" didn't work.",
                    String.format("%.3f", real.circleDiameter()),
                    String.format("%.3f", poly.circleDiameter()));
        }
    }

    private class RealCirclesInPolygons {
        int sides;
        int sideLength;

        public RealCirclesInPolygons(int sides, int sideLength) {
            this.sides = sides;
            this.sideLength = sideLength;
        }

        public double circleDiameter(){
            return sideLength*Math.sqrt((1+Math.cos(2*Math.PI/sides))/(1-Math.cos(2*Math.PI/sides)));
        }
    }
}