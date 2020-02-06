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
public class Unogame {
       
        public enum Suit {RED,YELLOW,GREEN,BLUE};
        public enum Value{ZERO,ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,WILD,DRAW,REVERSE};
         private final Suit suit;
        private final Value value;
        
        public Unogame(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
	
}
