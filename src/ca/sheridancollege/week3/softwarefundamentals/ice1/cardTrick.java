/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 *
 * @author ARK PATEL
 */
public class cardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.randomValue());
            c.setSuit(c.SUITS[c.randomSuits()]);
            magicHand[i]=c;
            System.out.println(magicHand[i].getValue()+magicHand[i].getSuit());
            
        }
      
    }
}
