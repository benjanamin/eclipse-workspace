package herencia;

public class SeleccionFutbol{

	protected int id;
	protected String Nombre;
	protected String Apellidos;
	protected int Edad;
	
	public SeleccionFutbol() {
	
	}

	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Edad = edad;
	}
	
	public String getNombre() {
		return this.Nombre;
	}

	public String getApellidos() {
		return this.Nombre;
	}
	
	// constructor, getter y setter

	public void Concentrarse() {
	
	}

	public void Viajar() {
		
	}
}
