package p3;

import java.util.ArrayList;

//import asistente.Horario;

public class Animal {
	//static ArrayList<Horario> Actividades=new ArrayList<Horario>();
	private String Nombre;
	private String ID;
	private int Cantidad;
	
	public Animal() {
		
	}
	public Animal(String nombre, String id,int cantidad) {
		this.Nombre=nombre;
		this.ID=id;
		this.Cantidad=cantidad;
	}
	
	public void setNombre(String nombre) {
		this.Nombre=nombre;
	}
	
	public void setID(String id) {
		this.ID=id;
	}
	
	public void setCantidad(int cantidad) {
		this.Cantidad=cantidad;
	}
	
	public int getCantidad() {
		return this.Cantidad;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public String getID() {
		return this.ID;
	}
}
