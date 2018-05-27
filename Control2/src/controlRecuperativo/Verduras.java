package controlRecuperativo;

public class Verduras {
	private String Nombre;
	private int Cantidad;
	private String Precio;
	public Verduras(){
		
	}
	public Verduras(String nombre,int cantidad,String precio) {
		this.Nombre=nombre;
		this.Cantidad=cantidad;
		this.Precio=precio;
	}
	public void setNombre(String nombre) {
		this.Nombre=nombre;
	}
	
	public void setCantidad(int string) {
		this.Cantidad=string;
	}
	
	public void setPrecio(String string) {
		this.Precio=string;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public String getPrecio() {
		return this.Precio;
	}
	
	public int getCantidad() {
		return this.Cantidad;
	}
}
