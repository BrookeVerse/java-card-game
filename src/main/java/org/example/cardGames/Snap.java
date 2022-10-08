package org.example.cardGames;

import org.example.cards.Card;
import org.example.gameCreation.CardGame;
import org.example.gameCreation.Player;

import java.sql.Time;
import java.util.*;

public class Snap extends CardGame {
    private Card firstCard;
    private Card secondCard = null;
    private String playerOneName;
    private String playerTwoName;
    private Player activePlayer;
    private String gameOver = "";
    Scanner scanner = new Scanner(System.in);
    Timer timer = new Timer();
    Player playerOne = new Player(playerOneName);
    Player playerTwo = new Player(playerTwoName);
    public Snap() {
        super("snap");
        welcomeMessage();
        firstCard = dealCard();
        snapGame();
    }
    public void welcomeMessage(){
        System.out.println("Welcome to snap!\nThe Rules: Each player will be given a card, if the card matches the other players call snap within two seconds.\nReady to begin?");
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
            System.exit(0);
        }
    }
    public void entTurn() {
        System.out.println("Press enter, when you are ready to take your turn");
        scanner.nextLine();
    }
    public void endGame() {
            if (activePlayer == playerOne) {
                System.out.println(playerOneName + gameOver);
                System.exit(0);
            } else {
                System.out.println(playerTwoName + gameOver);
                System.exit(0);
            }
    }
    public void timerEnd() {
        if (activePlayer == playerOne){
            System.out.println(playerOneName + " you lose!");
        } else {
            System.out.println(playerTwoName + " you lose!");
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
            if (firstCard.getRank() == secondCard.getRank()){
                gameOver = " Wins!";
                break;
            }
        } while (Objects.equals(gameOver, "") || Objects.equals(gameOver, " Wins!"));
        TimerTask snap = new TimerTask() {
            @Override
            public void run() {
                timerEnd();
            }
        };
        timer.schedule(snap, 2*1000);
        if(scanner.nextLine().equalsIgnoreCase("snap")){
            endGame();
        }
    }
}
