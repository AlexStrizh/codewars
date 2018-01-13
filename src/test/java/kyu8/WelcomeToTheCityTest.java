package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class WelcomeToTheCityTest {
    @Test
    public void test1() throws Exception {
        WelcomeToTheCity h = new WelcomeToTheCity();
        String[] name = {"John", "Smith"};
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                h.sayHello(name, "Phoenix", "Arizona"));
    }
}