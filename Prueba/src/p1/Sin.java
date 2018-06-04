package p1;

public class Sin extends Celular {
	String Tipo;
	public Sin(boolean cerca,String tipo) {
		super(cerca);
		this.Tipo=tipo;
	}
	
	public void leerInfo() {
		System.out.println("Imagen QR muy bonita");
	}
	public void leerQR(Animal animal) {
		animal.toString();
	}
}