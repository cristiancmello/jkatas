package org.example;

public class Game {

    private int score;

    public void roll(int pins) {
        if (pins + lastPins) {
            // Sei la o que vai acontecer aqui... mas há indícios de falha de design...
        }
        score += pins;
    }

    public int score() {
        return score;
    }
}
