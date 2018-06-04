package p3;

public class Juego {
	private int Puntaje;
	
	public Juego() {
		this.Puntaje=0;
	}
	public  int getPuntaje() {
		return this.Puntaje;
	}
	
	public void setPuntaje(int i) {
		this.Puntaje=i;
	}
	
	public String verPremio() {
		//Segun una escala te dara el premio que llevas hasta ahora
		return "7 lucas del confort";
	}
}
