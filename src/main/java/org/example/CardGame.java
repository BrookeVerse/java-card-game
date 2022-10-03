package org.example;

import java.util.ArrayList;

public class CardGame {
    Card card;
    String cardGame = "Welcome to Snap!";

    public CardGame(String cardGame) {
        this.cardGame = cardGame;
    }
    ArrayList<Card> deck = new ArrayList<>(52);
    Card cards = new Card();
//    public String getCard() {
//       Card card = new Card();
//       return card.toString();
//    }

}
