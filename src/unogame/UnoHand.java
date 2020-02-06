/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

/**
 *
 * @author WILL PC
 */
public class UnoHand {
     private int handSize = 52;
	public Unogame[] cards = new Unogame[handSize];

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                int countCards = 0;
             
		for(Unogame.Suit s: Unogame.Suit.values())
                {
                    for(Unogame.Value v: Unogame.Value.values())
                    {
                        cards[countCards] = (new Unogame(s,v));
                        countCards++;
                    }
                
                }//end outter for
        }//end method

}
