package controlRecuperativo;

public class Cajero extends Empleados {
	String Cargo;
	String Unidad;
	
	public Cajero() {
		super();
	}
	
	public Cajero(String nombre,String apellido,String cargo,String unidad) {
		super(nombre,apellido);
		this.Cargo=cargo;
		this.Unidad=unidad;
	}
	public String toString() {
		String s=this.Nombre+" "+this.Apellido+"\n Cargo: "+ this.Cargo+"\n Unidad: "+this.Unidad;
		return s;
	}
	public void setCargo(String s) {
		this.Cargo=s;
	}
	
	public void setUnidad(String s) {
		this.Unidad=s;
	}
	
	public String getCargo() {
		return this.Cargo;
	}
	
	public String getUnidad() {
		return this.Unidad;
	}
	
}