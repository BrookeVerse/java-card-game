package org.example;

import java.util.ArrayList;
import java.util.List;

public class CardGame {
    private ArrayList<Card> deck;
    private String cardGame = "Snap!";

    public CardGame(String cardGame) {
        this.cardGame = cardGame;
        deckOfCards();
    }

    public CardGame(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public void deckOfCards() {
        List<String> suits = Card.getSuits();
        List<String> symbols = Card.getSymbol();
        deck = new ArrayList<>();
        for (String suit: suits) {
            for (String symbol : symbols) {
                deck.add(new Card(symbol,suit));
            }
        }
    }
}
