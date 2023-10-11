package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {
    private Game g;

    @BeforeEach
    void setUp() {
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
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
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    @Test
    public void allOnes() {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

    @Test
    public void oneSpare() {
        rollMany(2, 5);
        g.roll(7);
        rollMany(17, 0); // por que 0 pins? será pq foram feitos 3 rolls? 2 em rollMany(2, 5) + 1 em g.roll(7)?
        assertEquals(24, g.score());
    }
}
