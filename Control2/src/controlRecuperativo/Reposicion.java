package controlRecuperativo;

public class Reposicion extends Empleados {
	String Cargo;
	String Unidad;
	
	public Reposicion() {
		super();
	}
	
	public Reposicion(String nombre,String apellido,String cargo,String unidad) {
		super(nombre,apellido);
		this.Cargo=cargo;
		this.Unidad=unidad;
	}
	public void setCargo(String s) {
		this.Cargo=s;
	}
	public String toString() {
		String s=this.Nombre+" "+this.Apellido+"\n Cargo: "+ this.Cargo+"\n Unidad: "+this.Unidad;
		return s;
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
