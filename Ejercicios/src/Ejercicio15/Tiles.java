package Ejercicio15;

public class Tiles {
	private char letter;
	private int value;
	
	public Tiles(char letter,int value) {
		this.letter=letter;
		this.value=value;
	}
	
	public void printTile(Tiles tile) {
		System.out.println("La letra: "+tile.letter);
		System.out.println("Tiene un valor de: "+ tile.value);
	}
	
	public void testFile() {
		Tiles tile=new Tiles('z',10);
		tile.printTile(tile);
	}
	
	public char getterLetter() {
		return this.letter;
	}
	
	public int getterValue() {
		return this.value;
	}
	
	public void setterLetter(char letter) {
		this.letter=letter;
	}
	
	public void setterValue(int value) {
		this.value=value;
		
	}
	public void toString(Tiles tiles) {
		System.out.println("letter: "+tiles.getterLetter()+" value: "+tiles.getterValue());
	}
	
	public boolean equals(Tiles tiles1, Tiles tiles2) {
		if(tiles1.getterLetter()==tiles2.getterLetter()&&tiles1.getterValue()==tiles2.getterValue()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
	}
}
