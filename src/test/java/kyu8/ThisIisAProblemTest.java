package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThisIisAProblemTest {
    @Test
    public void testNameMeOne() throws Exception {
        ThisIisAProblem nameMe = new ThisIisAProblem("John", "Doe");

        assertEquals("Verifying First name. Object returned should contain the firstname: John",
                "John",
                nameMe.firstName);

        assertEquals("Verifying Last name. Object returned should contain the lastname: Doe",
                "Doe",
                nameMe.lastName);

        assertNotEquals("Verifying full name. Object returned should not contain full name: JohnDoe",
                "JohnDoe",
                nameMe.fullName);

        assertEquals("Verifying full name. Object returned should contain full name: John Doe",
                "John Doe",
                nameMe.fullName);
    }
    @Test
    public void testNameMeTwo() throws Exception {
        ThisIisAProblem nameMe = new ThisIisAProblem("Johnny", "Bravo");

        assertEquals("Verifying First name. Object returned should contain the firstname: Johnny",
                "Johnny",
                nameMe.firstName);

        assertEquals("Verifying Last name. Object returned should contain the lastname: Bravo",
                "Bravo",
                nameMe.lastName);

        assertNotEquals("Verifying full name. Object returned should not contain full name: JohnnyBravo",
                "JohnnyBravo",
                nameMe.fullName);

        assertEquals("Verifying full name. Object returned should contain full name: Johnny Bravo",
                "Johnny Bravo",
                nameMe.fullName);
    }
    @Test
    public void testNameMeThree() throws Exception {
        ThisIisAProblem nameMe = new ThisIisAProblem("Jack", "Sparrow");

        assertEquals("Verifying First name. Object returned should contain the firstname: Jack",
                "Jack",
                nameMe.firstName);

        assertEquals("Verifying Last name. Object returned should contain the lastname: Sparrow",
                "Sparrow",
                nameMe.lastName);

        assertNotEquals("Verifying full name. Object returned should not contain full name: JackSparrow",
                "JackSparrow",
                nameMe.fullName);

        assertEquals("Verifying full name. Object returned should contain full name: Jack Sparrow",
                "Jack Sparrow",
                nameMe.fullName);

        nameMe = new ThisIisAProblem("Linda", "Hamilton");

        assertEquals("Verifying First name. Object returned should contain the firstname: Linda",
                "Linda",
                nameMe.firstName);

        assertEquals("Verifying Last name. Object returned should contain the lastname: Hamilton",
                "Hamilton",
                nameMe.lastName);

        assertNotEquals("Verifying full name. Object returned should not contain full name: LindaHamilton",
                "LindaHamilton",
                nameMe.fullName);

        assertEquals("Verifying full name. Object returned should contain full name: Linda Hamilton",
                "Linda Hamilton",
                nameMe.fullName);
    }
}