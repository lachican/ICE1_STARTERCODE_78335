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
 * @author Arpitkumar Soni(991550760)
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      Scanner s = new Scanner(System.in);
      System.out.println("add card suit");
      String userSuit = s.nextLine();
      System.out.println("Add your card number ");
      int uservalue = s.nextInt();

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         c.setValue(c.rndValue());
         c.setSuit(Card.SUITS[c.rndSuit()]);
         magicHand[i] = c;
         System.out.println(magicHand[i].getSuit() + magicHand[i].getValue());

         //c.setValue(insert call to random number generator here)
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
      }


      for (int i = 0; i < magicHand.length; i++) {
         int num = magicHand[i].getValue();
         String su = magicHand[i].getSuit();
         if (userSuit == su && uservalue == num) {
            System.out.println("Your card matched!!!");
            break;
         }
         else {
            if (i == magicHand.length - 1) {
               System.out.println("No cards matched");
            }
         }

      }
      //insert code to ask the user for Card value and suit, create their card
      // and search magicHand here
      //Then report the result here
   }

}
