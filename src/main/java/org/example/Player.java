package org.example;

import org.example.cards.Card;

public class Player {
    private Card playerOne;
    private String playerOneName;
    private Card playerTwo;
    private String playerTwoName;



    public void setPlayerOne(Card playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(Card playerTwo) {
        this.playerTwo = playerTwo;
    }

    public void setPlayerOneName(String playerOneName) {
        this.playerOneName = playerOneName;
    }

    public void setPlayerTwoName(String playerTwoName) {
        this.playerTwoName = playerTwoName;
    }

    public Card getPlayerOne() {
        return playerOne;
    }

    public Card getPlayerTwo() {
        return playerTwo;
    }

}
