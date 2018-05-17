package Ejercicio16;

public class Hand {
	
	public int[] suitHist(Card[] cards) {

		int[] Histogram= new int[4];
		int clubs=0;
		int diamonds=0;
		int hearts=0;
		int spades=0;
		
		for(int i=0;i<cards.length;i++) {
			cards[i].getSuit();
			switch(cards[i].getSuit()) {
			
			case 0:
				clubs=clubs+1;
				break;
			case 1:
				diamonds=diamonds+1;
				break;
			case 2:
				hearts=hearts+1;
				break;
			case 3:
				spades=spades+1;
			}
		}
		Histogram[0]=clubs;
		Histogram[1]=diamonds;
		Histogram[2]=hearts;
		Histogram[3]=spades;
		return Histogram;
	}
	
	public boolean hasFlush(Card[] cards) {
		int[] Histogram= new int[4];
		int clubs=0;
		int diamonds=0;
		int hearts=0;
		int spades=0;
		
		for(int i=0;i<cards.length;i++) {
			cards[i].getSuit();
			switch(cards[i].getSuit()) {
			
			case 0:
				clubs=clubs+1;
				break;
			case 1:
				diamonds=diamonds+1;
				break;
			case 2:
				hearts=hearts+1;
				break;
			case 3:
				spades=spades+1;
			}
		}
		if(clubs>=5||diamonds>=5||hearts>=5||spades>=5) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
