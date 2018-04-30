package asistenteV2;

public class Llamada {
	private String numero;
	private String hora;
	public Llamada() {
		
	}
	
	public Llamada(String numero,String hora) {
		this.numero=numero;
		this.hora=hora;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public String getHora() {
		return this.hora;
	}
	
}
