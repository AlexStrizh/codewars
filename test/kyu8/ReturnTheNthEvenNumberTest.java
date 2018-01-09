
package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class ReturnTheNthEvenNumberTest {
    @Test
    public void test1() {
        assertEquals(0, ReturnTheNthEvenNumber.nthEven(1));
        assertEquals(2, ReturnTheNthEvenNumber.nthEven(2));
        assertEquals(4, ReturnTheNthEvenNumber.nthEven(3));
        assertEquals(198, ReturnTheNthEvenNumber.nthEven(100));
        assertEquals(2597466, ReturnTheNthEvenNumber.nthEven(1298734));
    }

    @Test
    public void random() {
        Random r = new Random();
        for(int i = 1; i <= 200; i++){
            int random = 0+r.nextInt(9000000);
            assertEquals(this.a(random), ReturnTheNthEvenNumber.nthEven(random));
        }
    }

    // my solution
    private static int a (int n) { return n*2-2; }
}