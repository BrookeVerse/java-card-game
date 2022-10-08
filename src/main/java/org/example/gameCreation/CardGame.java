package org.example.gameCreation;
import org.example.cards.Card;
import org.example.cards.Ranks;
import org.example.cards.Suits;
import java.util.*;
public class CardGame {
    private ArrayList<Card> deck;
    private String title;
    public CardGame(String title) {
        deckOfCards();
        this.title = title;
    }
    @Override
    public String toString() {
        return title;
    }

    public void deckOfCards() {
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
            System.out.println("Cannot find cards!");
        }
    }
    public void getDeck() {
        deck.forEach(card -> System.out.print(card.toString()+ " "));
        System.out.println();
    }

    public Card dealCard() {
        if (deck.size()>0) {
            return deck.remove(0);
        } else {
            throw new NullPointerException("The Deck is empty!");
        }
    }
    public void shuffleDeck(){
        try {
            Collections.shuffle(deck);
        } catch (NullPointerException e){
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
