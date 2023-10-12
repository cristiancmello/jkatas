package org.example;

public class Game {
    private int score;
    private int[] rolls = new int[21]; // 21 = 20 rolls + 1 extra when spare or strike done
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] + rolls[i + 1] == 10 && i % 2 == 0) {
                // horroroso, nao temos ideia...
                // i % 2 == 0? pior ainda...
            }
            score += rolls[i];
        }

        return score;
    }
}
