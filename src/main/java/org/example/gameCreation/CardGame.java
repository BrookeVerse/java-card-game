package org.example.gameCreation;

import org.example.Main;
import org.example.cardGames.Snap;
import org.example.cards.Card;
import org.example.cards.Ranks;
import org.example.cards.Suits;

import java.util.*;

public class CardGame {
    private ArrayList<Card> deck;
    private String title;


    public CardGame(String title) {
        getDeck();
        this.title = title;
    }

    public void getDeck() {
        try {
            List<Suits> suits = List.of(Suits.values());
            List<Ranks> ranks = List.of(Ranks.values());
            deck = new ArrayList<>();
            for (Suits suit: suits){
                for (Ranks rank: ranks){
                    deck.add(new Card(rank, suit));
                }
            }
        } catch (NullPointerException e) {
            System.exit(0);
            System.out.println("Cannot find cards!");
        }

    }

    public Card dealCard() {
        if (deck.size()>0) {
            return deck.remove(0);
        } else {
            System.exit(0);
            throw new NullPointerException("The Deck is empty!");
        }
    }
    public void shuffleDeck(){
        try {
            Collections.shuffle(deck);
        } catch (NullPointerException e){
            System.exit(0);
            System.out.println("The deck is empty!");
        }

    }


    public ArrayList<Card> sortByNumber() {
        if (deck.size() > 0) {
            deck.sort(Comparator.comparingInt(Card::getRank));
            return deck;
        } else {
            throw new NullPointerException("The deck is empty!");
        }

    }

    public ArrayList<Card> sortBySuit() {
        if(deck.size() > 0) {
            deck.sort(Comparator.comparing(Card::getSuit));
            return deck;
        }
        throw new NullPointerException("The deck is empty!");
    }


}
