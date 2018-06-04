package p1;

public class Celular {
	boolean Cerca;
	public Celular() {
		
	}
	public Celular(boolean cerca) {
		this.Cerca=Cerca;
	}
	
	public void setPosicion(boolean x){
		this.Cerca=x;
	}
	
	public boolean getCerca() {
		return this.Cerca;
	}
	
}
