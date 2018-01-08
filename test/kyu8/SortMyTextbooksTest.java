package kyu8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class SortMyTextbooksTest {

    @Test
    public void basicTest() {
        ArrayList<String> strs = new ArrayList<>();
        ArrayList<String> sorted = new ArrayList<>();


        for(String s : new String[] {"Algebra", "History", "Geometry", "English"})
            strs.add(s);
        sorted = strs;
        Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER);
        assertEquals(sorted, SortMyTextbooks.sort(strs));
    }

    @Test
    public void capitalizationTest() {
        ArrayList<String> strs = new ArrayList<>();
        ArrayList<String> sorted = new ArrayList<>();


        for(String s : new String[] {"Algebra", "history", "Geometry", "english"})
            strs.add(s);
        sorted = strs;
        Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER);
        assertEquals(sorted, SortMyTextbooks.sort(strs));
    }

    @Test
    public void symbolsTest() {
        ArrayList<String> strs = new ArrayList<>();
        ArrayList<String> sorted = new ArrayList<>();


        for(String s : new String[] {"Alg#bra", "$istory", "Geom^try", "**English"})
            strs.add(s);
        sorted = strs;
        Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER);
        assertEquals(sorted, SortMyTextbooks.sort(strs));
    }

    @Test
    public void randomTest1() {
        for(int i = 0; i < 25; i++) {
            ArrayList<String> strs = new ArrayList<>();
            ArrayList<String> sorted = new ArrayList<>();
            String str = "";
            for(int j = 0; j < (int)(Math.random()*15)+5; j++) {
                for(int k = 0; k < (int)(Math.random()*15)+5; k++) {
                    str += (char)((int)(Math.random()*80)+40);
                }
                strs.add(str);
                str = "";
            }
            sorted = strs;
            Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER);
            assertEquals(sorted, SortMyTextbooks.sort(strs));
        }
    }

    @Test
    public void randomTest2() {
        for(int i = 0; i < 25; i++) {
            ArrayList<String> strs = new ArrayList<>();
            ArrayList<String> sorted = new ArrayList<>();
            String str = "";
            for(int j = 0; j < (int)(Math.random()*15)+5; j++) {
                for(int k = 0; k < (int)(Math.random()*15)+5; k++) {
                    str += (char)((int)(Math.random()*80)+40);
                }
                strs.add(str);
                str = "";
            }
            sorted = strs;
            Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER);
            assertEquals(sorted, SortMyTextbooks.sort(strs));
        }
    }

    @Test
    public void randomTest3() {
        for(int i = 0; i < 25; i++) {
            ArrayList<String> strs = new ArrayList<>();
            ArrayList<String> sorted = new ArrayList<>();
            String str = "";
            for(int j = 0; j < (int)(Math.random()*15)+5; j++) {
                for(int k = 0; k < (int)(Math.random()*15)+5; k++) {
                    str += (char)((int)(Math.random()*80)+40);
                }
                strs.add(str);
                str = "";
            }
            sorted = strs;
            Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER);
            assertEquals(sorted, SortMyTextbooks.sort(strs));
        }
    }

    @Test
    public void randomTest4() {
        for(int i = 0; i < 25; i++) {
            ArrayList<String> strs = new ArrayList<>();
            ArrayList<String> sorted = new ArrayList<>();
            String str = "";
            for(int j = 0; j < (int)(Math.random()*15)+5; j++) {
                for(int k = 0; k < (int)(Math.random()*15)+5; k++) {
                    str += (char)((int)(Math.random()*80)+40);
                }
                strs.add(str);
                str = "";
            }
            sorted = strs;
            Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER);
            assertEquals(sorted, SortMyTextbooks.sort(strs));
        }
    }

    @Test
    public void randomTest5() {
        for(int i = 0; i < 25; i++) {
            ArrayList<String> strs = new ArrayList<>();
            ArrayList<String> sorted = new ArrayList<>();
            String str = "";
            for(int j = 0; j < (int)(Math.random()*15)+5; j++) {
                for(int k = 0; k < (int)(Math.random()*15)+5; k++) {
                    str += (char)((int)(Math.random()*80)+40);
                }
                strs.add(str);
                str = "";
            }
            sorted = strs;
            Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER);
            assertEquals(sorted, SortMyTextbooks.sort(strs));
        }
    }

}