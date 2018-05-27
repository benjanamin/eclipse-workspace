package controlRecuperativo;

public class Carnes {
	private String Nombre;
	private int Cantidad;
	private String Precio;
	public Carnes(){
		
	}
	public Carnes(String nombre,int cantidad,String precio) {
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
	
	public String getNombre(String string) {
		return this.Nombre;
	}
	
	public String getPrecio(String string) {
		return this.Precio;
	}
	
	public int getCantidad(int string) {
		return this.Cantidad;
	}
}
