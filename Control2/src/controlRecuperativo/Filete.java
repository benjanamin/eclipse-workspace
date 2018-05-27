package controlRecuperativo;

public class Filete extends Carnes {
	String Estado;
	String FechaVencimiento;
	String FechaFabricacion;
	String Marca;
	String SKU;
	public Filete() {
		super();
	}
	public Filete(String nombre,int cantidad,String precio,String marca,String estado,String fechaF,String fechaV, String sku) {
		super(nombre,cantidad,precio);
		this.Estado=estado;
		this.FechaFabricacion=fechaF;
		this.FechaVencimiento=fechaV;
		this.Marca=marca;
	}
	
	public void setMarca(String string) {
		this.Marca=string;
	}
	
	public void setEstado(String string) {
		this.Estado=string;
	}
	
	public void setFechaFabricacion(String string) {
		this.FechaFabricacion=string;
	}
	
	public void setFechaVencimiento(String string) {
		this.FechaVencimiento=string;
	}
	public void setSKU(String string) {
		this.SKU=string;
	}
	
	public String getMarca() {
		return this.Marca;
	}
	
	public String getEstado() {
		return this.Estado;
	}
	
	public String getFechaFabricacion() {
		return this.FechaFabricacion;
	}
	
	public String getFechaVencimiento() {
		return this.FechaVencimiento;
	}
	
	public String getSKU() {
		return this.SKU;
	}

}
