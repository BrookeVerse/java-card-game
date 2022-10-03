package org.example;

import java.util.ArrayList;
import java.util.List;

public class CardGame {
    Card card;
    String cardGame = "Welcome to Snap!";

    public CardGame(String cardGame) {
        this.cardGame = cardGame;
    }
    ArrayList<Card> deck = new ArrayList<>(52);

    public CardGame(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

//    public getDeck() {
//
//    }
}
