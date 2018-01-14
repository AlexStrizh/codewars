package kyu8;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ColorGhostTest {
    private ArrayList ghostColors = new ArrayList();

    public ColorGhostTest() {
        for (int i = 1; i <= 100; i++) {
            ghostColors.add(new ColorGhost().getColor());
        }
    }

    private Boolean ghostColor(ArrayList ghostColors, String color) {
        Boolean answer = false;

        for (int i = 0; i < ghostColors.size(); i++) {
            if (ghostColors.get(i) == color) {
                answer = true;
                break;
            }
        }

        return answer;
    };

    @Test
    public void should_sometimes_make_white_ghosts() throws Exception {
        assertEquals("No white ghost found.", true, ghostColor(ghostColors, "white"));
    }

    @Test
    public void should_sometimes_make_yellow_ghosts() throws Exception {
        assertEquals("No yellow ghost found.", true, ghostColor(ghostColors, "yellow"));
    }

    @Test
    public void should_sometimes_make_purple_ghosts() throws Exception {
        assertEquals("No purple ghost found.", true, ghostColor(ghostColors, "purple"));
    }

    @Test
    public void should_sometimes_make_red_ghosts() throws Exception {
        assertEquals("No red ghost found.", true, ghostColor(ghostColors, "red"));
    }
}