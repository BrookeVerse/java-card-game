package org.example.cards;

public enum Suits {
    HEARTS("\u2665"), SPADES("\u2660"), DIAMONDS("\u2666"), CLUBS("\u2663");

    private final String suitUnicode;

    private Suits(String suitUnicode){
        this.suitUnicode = suitUnicode;
    }

    public String getSuit() {
        return suitUnicode;
    }
}
