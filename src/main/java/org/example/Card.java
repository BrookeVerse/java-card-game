package org.example;
import java.util.*;

public class Card {
   private Suits suit;
   private Ranks rank;

    public Card(Ranks rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getSuit() {
        return suit.getSuit();
    }

    public int getRank() {
        return rank.getRank();
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
       String str = "";
       str += rank.getStringRank() + " of " + suit.getSuit();
       return str;
    }
}
