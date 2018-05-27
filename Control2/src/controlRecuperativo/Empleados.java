package controlRecuperativo;

public class Empleados {
	String Nombre;
	String Apellido;
	
	public Empleados() {
		
	}
	
	public Empleados(String nombre,String apellido) {
		this.Nombre=nombre;
		this.Apellido=apellido;
	}
	
	public void setNombre(String s) {
		this.Nombre=s;
	}
	
	public void setApellido(String s) {
		this.Apellido=s;
	}

	public String getNombre() {
		return this.Nombre;
	}
	public String Apellido() {
		return this.Apellido;
	}
	
}
