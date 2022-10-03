package org.example;
import java.util.*;

public class Card {
    //Each card has a VALUE, an associated SYMBOL, and the deck has a string SUIT.
    private int[] VALUE = {2,3,4,5,6,7,8,9,10,11,12,13,14};
    private String SYMBOL;
    private String SUIT;

    @Override
    public String toString() {
        return String.format("%s of %s", SYMBOL, SUIT);
    }

    public Card(String SYMBOL, String SUIT) {
        setSYMBOL(SYMBOL);
        setSUIT(SUIT);
        String card = SYMBOL + " of " + SUIT;
    }

    String unicodeChar;
    
    Random RANDOM = new Random();

    public int[] getVALUE() {
        return VALUE;
    }

    public static List<String> getSymbol() {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","J","Q","K","A");
    }

    public void setSYMBOL(String SYMBOL) {
        List<String> validSymbols = getSymbol();
         if (validSymbols.contains(SYMBOL)){
             this.SYMBOL = SYMBOL;
         }
    }

    public static List<String> getSuits() {
        return Arrays.asList(" ♤ ", " ♦ ", " ♣ ", " ♥ ");
    }
    public void setSUIT(String SUIT) {
        List<String> validSuit = getSuits();
        if (validSuit.contains(SUIT)) {
            this.SUIT = SUIT;
        }
    }



//    public String unicodeString() {
//        int random = (RANDOM.nextInt(SUIT.length));
//        return unicodeChar = (SUIT[random]);
//    }
}
