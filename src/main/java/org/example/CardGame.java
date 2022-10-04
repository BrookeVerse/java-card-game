package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CardGame {
    private ArrayList<Card> deck;

    public CardGame() {
        deckOfCards();
    }

    @Override
    public String toString() {
        return "CardGame{" +
                "deck=" + deck +
                '}';
    }

    public void deckOfCards() {
        List<Suits> suits = List.of(Suits.values());
        List<Ranks> ranks = List.of(Ranks.values());
        deck = new ArrayList<>();
        for (Suits suit: suits){
            for (Ranks rank: ranks){
                deck.add(new Card(rank, suit));
            }
        }
    }

    public Card dealCard() {
        if (deck.size()>0) {
            return deck.remove(0);
        } else {
            return null;
        }
    }

    public ArrayList<Card> sortByNumber() {
        deck.sort(Comparator.comparingInt(Card::getRank));
        return deck;
    }
}
