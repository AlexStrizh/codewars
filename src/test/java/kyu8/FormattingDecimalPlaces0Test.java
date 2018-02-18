package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class FormattingDecimalPlaces0Test {
    @Test
    public void Test_01()
    {
        assertEquals(4.66, FormattingDecimalPlaces0.TwoDecimalPlaces(4.659725356), 0.00);
    }

    @Test
    public void Test_02()
    {
        assertEquals(173735326.38, FormattingDecimalPlaces0.TwoDecimalPlaces(173735326.3783732637948948), 0.00);
    }

    @Test
    public void Test_Random_03()
    {
        double number = 0;
        for(int i = 0; i < 100; i++)
        {
            number = Math.random();
            assertEquals(Math.round(number * 100.00) / 100.00, FormattingDecimalPlaces0.TwoDecimalPlaces(number), 0.00);
        }
    }
}