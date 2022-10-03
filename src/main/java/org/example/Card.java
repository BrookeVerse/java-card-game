package org.example;
import java.util.Random;

public class Card {
    //Each card has a VALUE, an associated SYMBOL, and the deck has a string SUIT.
    int[] VALUE = {2,3,4,5,6,7,8,9,10,11,12,13,14};
    String[] SYMBOL = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    String[] SUIT = {" ♤ ", " ♦ ", " ♣ ", " ♥ "};


    String unicodeChar;
    
    Random RANDOM = new Random();

    public int[] getVALUE() {
        return VALUE;
    }

    public String[] getSYMBOL() {
        return SYMBOL;
    }

    public String[] getSUIT() {
        return SUIT;
    }

    @Override
    public String toString() {
        return "Card: " +
                "VALUE=" + (RANDOM.nextInt(VALUE.length)) +
                ", SYMBOL=" + (RANDOM.nextInt(SYMBOL.length)) +
                ", SUIT=" + unicodeString();
    }

    public String unicodeString() {
        int random = (RANDOM.nextInt(SUIT.length));
        return unicodeChar = (SUIT[random]);
    }
}
