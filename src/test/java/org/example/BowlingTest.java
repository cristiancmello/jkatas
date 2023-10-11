package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {
    private Game g;

    @BeforeEach
    void setUp() {
        g = new Game();
    }

    @Test
    public void canRoll() {
        g.roll(0);
    }

    /**
     * Gutter Game: gutter is a trench located on either side of the lane.
     */
    @Test
    public void gutterGame() {
        for (int i = 0; i < 20; i++)
            g.roll(0);
        assertEquals(0, g.score());
    }
}
