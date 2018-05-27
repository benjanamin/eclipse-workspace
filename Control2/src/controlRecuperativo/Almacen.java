package controlRecuperativo;

import java.util.ArrayList;

public class Almacen {

	private  ArrayList<Object> AlmacenX=new ArrayList<Object>();
	private String Nombre;
	public Almacen() {
		
	}
	public Almacen(String Almacen) {
		this.Nombre=Almacen;
	}

	
	public void setNombre(String s) {
		this.Nombre=s;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public ArrayList<Object> getAlmacen(){
		return AlmacenX;
	}
	
	public void setAlmacen(ArrayList<Object> obj) {
		this.AlmacenX=obj;
	}
	
	public void add(Object obj) {
		AlmacenX.add(obj);
	}
	
}
