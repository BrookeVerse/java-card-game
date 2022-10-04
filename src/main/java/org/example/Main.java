package org.example;



public class Main {
    public static void main(String[] args) {
        Card card = new Card(Ranks.QUEEN, Suits.CLUBS);
        System.out.println(card);
        CardGame snap = new CardGame();
        System.out.println(snap.toString());
        System.out.println(snap.sortByNumber());
    }
}