package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class DoIGetABonusTest {
    @Test
    public void basicTests() {
        assertEquals("\u00A3100000",DoIGetABonus.bonusTime(10000, true));
        assertEquals("\u00A3250000",DoIGetABonus.bonusTime(25000, true));
        assertEquals("\u00A310000",DoIGetABonus.bonusTime(10000, false));
        assertEquals("\u00A360000",DoIGetABonus.bonusTime(60000, false));
        assertEquals("\u00A320",DoIGetABonus.bonusTime(2, true));
        assertEquals("\u00A378",DoIGetABonus.bonusTime(78, false));
        assertEquals("\u00A3678900",DoIGetABonus.bonusTime(67890, true));
    }

    @Test
    public void randomTests() {
        unicodeTest();
        Random r = new Random();
        for (int i=0;i<40;i++){
            int salary=1+r.nextInt(100);
            boolean bonus = r.nextInt(1)==0;
            String sol=String.format("\u00A3%d",salary * (bonus ? 10 : 1));
            assertEquals(sol+" != "+DoIGetABonus.bonusTime(salary, bonus),sol,DoIGetABonus.bonusTime(salary, bonus));
        }
    }

    public void unicodeTest(){
        System.out.println("\u00A3 == £:"+"\u00A3".equals("£"));
        System.out.println("if previous result was false or had ? symbol then you need to escape unocode due to misconfiguration of the server");
        System.out.println("Comparing against unicode escaped");
    }
}