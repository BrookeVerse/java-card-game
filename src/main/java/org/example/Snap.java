package org.example;

import org.example.cards.Card;
import org.example.cards.Ranks;

import java.util.Objects;
import java.util.Scanner;

public class Snap extends CardGame{
    Scanner scanner = new Scanner(System.in);
    private String title;

    private Card firstCard;
    private String playerOneName;
    private Card secondCard = null;
    private String playerTwoName;
    private String gameOver = "";

    private Player activePlayer;
    Player playerOne = new Player();
    Player playerTwo = new Player();

    CardGame cardGame = new CardGame();


    public Snap() {
        this.title = "Snap";
        welcomeMessage();
        snapGame();
    }

    public void welcomeMessage(){
        System.out.println("Welcome to " + title + "\nThe Rules: Each player will be given a card, if the card matches the other players call snap.");
        System.out.println("Ready to begin?");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("yes")) {
            deckOfCards();
            shuffleDeck();
             secondCard = firstCard;
             firstCard = cardGame.dealCard();
            activePlayer = playerTwo;
            System.out.println("Player Ones' name?");
            playerOneName = scanner.next();
            System.out.println("Player Twos' name?");
            playerTwoName = scanner.next();
        } else {
            System.out.println("Thank you for playing!");
        }
    }

    public void entTurn() {
        System.out.println("Press enter, when you are ready to take your turn");
        scanner.nextLine();
    }
    public void snapGame() {
        do {
            entTurn();
            if (activePlayer == playerOne){
                activePlayer = playerTwo;
            } else if (activePlayer == playerTwo){
                activePlayer = playerOne;
            }


            if (activePlayer == playerOne) {
                System.out.println(playerOneName + " your Card is...");
                System.out.println(firstCard);
            } else if (activePlayer == playerTwo) {
                System.out.println(playerTwoName + " your Card is...");
                System.out.println(firstCard);
            }
            if (firstCard.getRank() == secondCard.getRank()){
                System.out.println(gameOver = " Wins!");
            }
        } while (Objects.equals(gameOver, "") || Objects.equals(gameOver, " Wins!"));



    }
}
