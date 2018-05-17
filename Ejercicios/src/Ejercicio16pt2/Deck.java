package Ejercicio16pt2;

import java.util.Arrays;
import java.util.Random;

/**
 * A deck of playing cards (of fixed size).
 */
public class Deck {

    private Card[] cards;

    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    /**
     * Constructs a deck of n cards (null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Displays each of the cards in the deck.
     */
    public void print() {
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
        }
    }

    /**
     * Returns a string representation of the deck.
     */
    public String toString() {
        return Arrays.toString(this.cards);
    }

    /**
     * Chooses a random number between low and high, including both.
     */
    public int randomInt(int low, int high) {
      int numero=(int)(Math.random()*high-low);
    	return numero;
    }

    /**
     * Swaps the cards at indexes i and j.
     */
    public void swapCards(int i, int j) {
    	Card aux=new Card(1,1);
    	aux=this.cards[i];
    	this.cards[i]=this.cards[j];
    	this.cards[j]=aux;
    
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() {
    	Card aux=new Card(1,1);
    	for(int i=0;i<52;i++) { 
    		int numero=(int)(Math.random()*51);
    		aux=this.cards[i];
    		this.cards[i]=this.cards[numero];
    		this.cards[numero]=aux;
    		
    		// choose a random number between i and length - 1 
    		// swap the ith card and the randomly-chosen card }
    	}
    }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    public int indexLowest(int low, int high) {
    	  int min=0;
      	for(int i=low;i<=high-1;i++) {
          	if(this.cards[i].compareTo(this.cards[i+1])==-1) {
          		min=i;
          	}
          	else if(this.cards[i].compareTo(this.cards[i+1])==1){
          		min=i+1;
          	}
          }
      	return min;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() {
    	Card aux;
    	
    	for(int i=0;i<52;i++) {
    		int index=i;
    		for(int j=0;j<52;j++) {
    			if(this.cards[i].compareTo(this.cards[j])==1) {
    				aux=this.cards[i];
    				this.cards[i]=this.cards[j];
    				this.cards[j]=aux;
    			}
    		
    		}
    		// find the lowest card at or to the right of i 
    		// swap the ith card and the lowest card found }
    		
    	}
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Combines two previously sorted subdecks.
     */
    public static Deck merge(Deck d1, Deck d2) {
        return null;
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
        return this;
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
    }
    
}