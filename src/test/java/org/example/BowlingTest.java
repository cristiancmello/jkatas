package org.example;

import org.junit.jupiter.api.Test;

public class BowlingTest {
    @Test
    public void canCreateGame() {
        var g = new Game();
    }

    @Test
    public void canRoll() {
        var g = new Game();
        g.roll(0);
    }
}
