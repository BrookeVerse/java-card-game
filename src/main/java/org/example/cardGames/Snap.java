package org.example.cardGames;

import org.example.cards.Card;
import org.example.gameCreation.CardGame;
import org.example.gameCreation.Player;

import java.sql.Time;
import java.util.*;

public class Snap extends CardGame {
    private String title;
    private Card firstCard;
    private Card secondCard = null;
    private String playerOneName;
    private String playerTwoName;
    private Player activePlayer;
    private String gameOver = "";
    private String snap;

    Scanner scanner = new Scanner(System.in);
    Timer timer = new Timer("Timer");
    Player playerOne = new Player(playerOneName);
    Player playerTwo = new Player(playerTwoName);
    public Snap() {
        super("Snap");
        this.title = "Snap";
        welcomeMessage();
        firstCard = dealCard();
        snapGame();
    }

    public void welcomeMessage(){
        System.out.println("Welcome to " + title + "\nThe Rules: Each player will be given a card, if the card matches the other players call snap within two seconds.\nReady to begin?");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("yes")) {
            shuffleDeck();
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
    public void endGame() {
        if (snap.equalsIgnoreCase("snap")) {
            if (activePlayer == playerOne) {
                System.out.println(playerOneName + gameOver);
                System.exit(0);
            } else {
                System.out.println(playerTwoName + gameOver);
                System.exit(0);
            }
        }
    }
    public void snapGame() {
        do {
            secondCard = firstCard;
            entTurn();
            firstCard = dealCard();
            if (activePlayer == playerOne){
                activePlayer = playerTwo;
            } else if (activePlayer == playerTwo){
                activePlayer = playerOne;
            }

            if (activePlayer == playerOne) {
                System.out.println(playerOneName + " your Card is...");
                System.out.println(firstCard);

            } else {
                System.out.println(playerTwoName + " your Card is...");
                System.out.println(firstCard);
            }
            snap = scanner.nextLine();
            if (firstCard.getRank() == secondCard.getRank()){
                gameOver = " Wins!";
                break;
            }
        } while (Objects.equals(gameOver, "") || Objects.equals(gameOver, " Wins!"));
        timer.schedule( new TimerTask() {
            @Override
            public void run() {
                if (snap.equalsIgnoreCase("snap")) {
                    endGame();
                } else {
                    timerEnd();
                }
                System.exit(0);
            }
        }, 2*1000, 1);








    }
    public void timerEnd() {
        if (activePlayer == playerOne){
            System.out.println(playerOneName + " you lose!");
        } else {
            System.out.println(playerTwoName + " you lose!");
        }
    }
}
