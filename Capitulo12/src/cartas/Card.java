package cartas;

public class Card {
	private int rank; //numero
	private int suit; //tipo 0 trebol , 1 diamante , 2 corazon , 3 pica
	
	public Card(int rank,int suit) {
		this.rank=rank;
		this.suit=suit;
		
	}
	
	public String toString() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String s= ranks[this.rank]+"of"+suits[this.suit];
		return s;
	}
	
	public static void main(String[] args) {
		Card card= new Card(1,3);
		System.out.println(card);
	}
	
}
