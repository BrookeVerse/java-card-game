package org.example;

public enum Suits {
    HEARTS("♥"), SPADES("♤"), DIAMONDS("♤"), CLUBS("♣");

    private final String suitUnicode;

    private Suits(String suitUnicode){
        this.suitUnicode = suitUnicode;
    }

    public String getSuit() {
        return suitUnicode;
    }
}
