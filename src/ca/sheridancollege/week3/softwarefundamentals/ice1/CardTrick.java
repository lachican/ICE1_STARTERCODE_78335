/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Sivagami
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         c.setValue(c.rndValue());
         c.setSuit(Card.SUITS[c.rndSuit()]);
         magicHand[i] = c;
         System.out.println(magicHand[i].getSuit() + magicHand[i].getValue());

         //c.setValue(insert call to random number generator here)
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
      }
      Scanner s = new Scanner(System.in);
      int uservalue = s.nextInt();
      String userSuit = s.nextLine();

      //insert code to ask the user for Card value and suit, create their card
      // and search magicHand here
      //Then report the result here
   }

}
