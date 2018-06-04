package p1;

public class Molusco extends Animal {
	private String Especie;
	private String Info;
	
	public Molusco() {
		super();
	}
	
	public Molusco(String nombre, String id,int cantidad,String especie, String info) {
		super(nombre, id,cantidad);
		this.Especie=especie;
		this.Info=info;
	}

	
	public void setEspecie(String nombre) {
		this.Especie=nombre;
	}
	
	public void setInfo(String id) {
		this.Info=id;
	}
	
	public String getEspecie() {
		return this.Especie;
	}
	
	public String getInfo() {
		return this.Info;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return (super.getNombre()+" " +super.getCantidad()+" de la especie:" +this.getEspecie()+" "+this.getInfo());
	}
	
	
}