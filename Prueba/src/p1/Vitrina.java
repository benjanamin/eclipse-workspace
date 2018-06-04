package p1;

import java.util.ArrayList;

public class Vitrina {
	private ArrayList<Animal> Vitrina=new ArrayList<Animal>();
	String Nombre;
	int Posicion;
	public Vitrina() {
		
	}
	

	public Vitrina(String nombre,int posicion) {
		this.Nombre=nombre;
		this.Posicion=posicion;
		
	}
	public Vitrina(ArrayList<Animal> lista,String nombre,int posicion) {
		this.Vitrina=lista;
		this.Nombre=nombre;
		this.Posicion=posicion;
		
	}
	
	public ArrayList<Animal> getVitrina(){
		return Vitrina;
	}
	
	public void setNombre(String nombre) {
		this.Nombre=nombre;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public void setPosicion(int nombre) {
		this.Posicion=nombre;
	}
	
	public int getPosicion() {
		return this.Posicion;
	}
	public void setVitrina(ArrayList<Animal> animal) {
		Vitrina=animal;
	}
	
	public void AgregarAnimal(Animal animal) {
		Vitrina.add(animal);
	}
	
	public void Quitar(Animal animal) {
		this.Vitrina.remove(animal);
		
	}
	
	public void editarCantidad(Animal animal,int cantidad) {
		int index;
		if(this.Vitrina.contains(animal)) {
			 index=this.Vitrina.indexOf(animal);
			 this.Vitrina.get(index).setCantidad(cantidad);
		}
		else {
			System.out.println("No se ha encontrado especie en esta vitrina");
		}
		
		
		
	}
	
	
}
