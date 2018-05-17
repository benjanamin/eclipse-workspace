package Ejercicio16;

public class Deck {
	public Card[] makeDeck() {

    	Card[] cards = new Card[52];
    	int index = 0;
    	if (cards[0] == null) { 
    		System.out.println("No card yet!");
    		}
    	
    	for (int suit = 0; suit <= 3; suit++) { 
    		for (int rank = 1; rank <= 13; rank++) {
    			cards[index] = new Card(rank, suit);
    			index++; 
    			} 
    		}
    	return cards;
    }
	
	 public static void printDeck(Card[] cards) {
	    	for (int i = 0; i < cards.length; i++) { 
	    			cards[i].toString();
	    		} 
	    	}
	
}
