package org.example;

import org.example.cards.Card;
import org.example.cards.Ranks;
import org.example.cards.Suits;

import java.util.*;

public class CardGame {
    private ArrayList<Card> deck;
    private String title;

    public CardGame() {
        deckOfCards();
        this.title = title;
    }

    Random RANDOM = new Random();
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
    public void shuffleDeck(){
        Collections.shuffle(deck);
    }


    public ArrayList<Card> sortByNumber() {
        deck.sort(Comparator.comparingInt(Card::getRank));
        return deck;
    }

    public ArrayList<Card> sortBySuit() {
        deck.sort(Comparator.comparing(Card::getSuit));
        return deck;
    }


}
