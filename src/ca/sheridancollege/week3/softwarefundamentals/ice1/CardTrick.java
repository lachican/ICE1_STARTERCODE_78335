/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author macdojer
 */

    import java.util.Scanner;
    public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            c.setValue(c.randomVal());
            c.setSuit(c.SUITS[c.randomSuit()]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getSuit()+magicHand[i].getValue());
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card u = new Card();
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Please enter your card value: ");
                
        u.setValue(inputObj.nextInt());
        System.out.println("Please enter your suit \"Hearts\", \"Diamonds\", \"Spades\", \"Clubs\": ");
        
        u.setSuit(inputObj.next());
        
        // and ssarch magicHand here
        boolean found = false;
        for (int i=0; i<magicHand.length; i++) {
            if (magicHand[i].getSuit().equals(u.getSuit()) && magicHand[i].getValue()== u.getValue()) {
                found = true;
            }
        }
        
         //Then report the result here
        if (found) {
            System.out.println("We found your card!");
        }
                
       
    }
    
}
