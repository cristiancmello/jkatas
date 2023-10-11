package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingTest {
    private Game g;

    @BeforeEach
    void setUp() {
        g = new Game();
    }

    @Test
    public void canRoll() {
        var g = new Game();
        g.roll(0);
    }
}
