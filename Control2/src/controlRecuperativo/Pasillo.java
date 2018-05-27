package controlRecuperativo;

import java.util.ArrayList;

public class Pasillo {
	private  ArrayList<Object> PasilloX=new ArrayList<Object>();
	private String Nombre;
	public Pasillo() {
		
	}
	public Pasillo(String pasillo) {
		this.Nombre=pasillo;
	}

	
	public void setNombre(String s) {
		this.Nombre=s;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public ArrayList<Object> getPasillo(){
		return PasilloX;
	}
	
	public void setPasillo(ArrayList<Object> obj) {
		this.PasilloX=obj;
	}
	
	public void add(Object obj) {
		PasilloX.add(obj);
	}
	
	public String toString() {
		String s="En el pasillo " +Nombre+ " hay:";
		for(int i=0;i<PasilloX.size();i++) {
			s=s+"\n";
		}
		return s;
	}
	
}
