package kyu7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

public class DetermineIfPokerHandIsFlushTest {
    @Test
    public void BasicTests() {
        assertEquals(true,DetermineIfPokerHandIsFlush.CheckIfFlush(new String[]{"AS", "3S", "9S", "KS", "4S"}));
        assertEquals(false,DetermineIfPokerHandIsFlush.CheckIfFlush(new String[]{"AD", "4S", "7H", "KC", "5S"}));
        assertEquals(false,DetermineIfPokerHandIsFlush.CheckIfFlush(new String[]{"AD", "4S", "10H", "KC", "5S"}));
        assertEquals(true,DetermineIfPokerHandIsFlush.CheckIfFlush(new String[]{"QD", "4D", "10D", "KD", "5D"}));
    }
    @Test
    public void RandomTests() {

        String[] AllCards= { "AC","AD","AH","AS","2C","2D","2H","2S","3C","3D","3H","3S","4C","4D","4H","4S","5C","5D","5H","5S","6C","6D","6H","6S","7C","7D","7H","7S"
                ,"8C","8D","8H","8S","9C","9D","9H","9S","10C","10D","10H","10S","JC","JD","JH","JS","QC","QD","QH","QS","KC","KD","KH","KS" };



        Random rand=new Random();
        for(int i=0;i<100;i++){

            ArrayList<String> cards= new ArrayList<String>();

            cards.add(AllCards[rand.nextInt(52)]);
            cards.add(AllCards[rand.nextInt(52)]);
            cards.add(AllCards[rand.nextInt(52)]);
            cards.add(AllCards[rand.nextInt(52)]);
            cards.add(AllCards[rand.nextInt(52)]);

            String [] cardsArr = cards.toArray(new String[cards.size()]);

            assertEquals(CheckIfFlush(cardsArr),DetermineIfPokerHandIsFlush.CheckIfFlush(cardsArr));

            cardsArr=null;
            cards.clear();
        }
    }

    @Test
    public void testRandomTrue() {
        Random r = new Random();
        String[] prefix_cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int k = 0; k < 100; k++)
        {
            int r2=r.nextInt(4);
            String suffix = r2 != 0 ? r2 != 1 ? r2 != 2 ? "S" : "H" : "D" : "C";
            ArrayList<String> allcards = new ArrayList<String>();
            for(int i=0; i<prefix_cards.length; i++) { allcards.add(prefix_cards[i]+suffix);}
            String[] cards = {allcards.get(r.nextInt(13)), allcards.get(r.nextInt(13)), allcards.get(r.nextInt(13)), allcards.get(r.nextInt(13)), allcards.get(r.nextInt(13))};
            assertEquals(CheckIfFlush(cards), DetermineIfPokerHandIsFlush.CheckIfFlush(cards));
        }
    }


    private static boolean CheckIfFlush(String[] cards){
        char FirstSuit=cards[0].charAt(cards[0].length()-1);

        for(int i=0; i<cards.length; i++)
        {
            if(cards[i].charAt(cards[i].length()-1)!=FirstSuit)
                return   false;
        }

        return true;
    }
}