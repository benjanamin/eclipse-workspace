package asistente;

import java.util.ArrayList;

public class Llamada {
	
	private String numero;
	private String nombre;
	private String hora;
	private boolean recibida=false;
	public Llamada() {
		
	}
	
	public Llamada(String nombre,String numero) {
		this.numero=numero;
		this.nombre=nombre;
		
	}
	public void setRecibida(boolean b) {
		this.recibida=b;
	}
	
	public boolean getRecibida() {
		return this.recibida;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getHora() {
		return this.hora;
	}
	public void setHora(String s) {
		this.hora=s;
	}
	public String toString() {
		String s;
		s="Llamada de: "+ this.nombre +"/"+ this.numero+" recibida a las "+this.hora;
		return s;
	}
	 public void simulacion() {
		 new Llamada("pepe","+56978146448");
		 
	 }
	 public int HoratoInt() {
		 int pepe;
		 pepe= Integer.parseInt(this.hora.substring(0,2)+this.hora.substring(3, 5));
		 return pepe;
	 }
	public void Recibida() {
		this.recibida=true;
	}
	
}
