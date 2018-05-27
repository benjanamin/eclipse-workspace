package controlRecuperativo;

public class Bodega extends Empleados {
	String Cargo;
	String Unidad;
	
	public Bodega() {
		super();
	}
	
	public Bodega(String nombre,String apellido,String cargo,String unidad) {
		super(nombre,apellido);
		this.Cargo=cargo;
		this.Unidad=unidad;
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
	public String toString() {
		String s=this.Nombre+" "+this.Apellido+"\n Cargo: "+ this.Cargo+"\n Unidad: "+this.Unidad;
		return s;
	}
	
}
