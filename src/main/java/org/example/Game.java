package org.example;

public class Game {
    private int score;
    private int[] rolls = new int[21]; // 21 = 20 rolls + 1 extra when spare or strike done
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int i = 0;
        for (int frame = 0; frame < 10; frame++) {
            score += rolls[i] + rolls[i + 1];
            i += 2;
        }

        return score;
    }
}
