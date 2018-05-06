package asistente;

import java.util.ArrayList;

public class Llamada {
	static ArrayList<Llamada> Llamadas=new ArrayList<Llamada>();
	private String numero;
	private String nombre;
	public Llamada() {
		
	}
	
	public Llamada(String numero,String nombre) {
		this.numero=numero;
		this.nombre=nombre;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	 public void simulacion() {
		 Llamadas.add(new Llamada("pepe","57"));
		 
	 }
	
}
