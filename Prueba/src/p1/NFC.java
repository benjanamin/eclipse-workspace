package p1;

public class NFC extends Celular {
	String Tipo;
	public NFC(boolean cerca,String tipo) {
		super(cerca);
		this.Tipo=tipo;
	}
	
	public void leerInfo(Animal animal) {
		animal.toString();
	}
}
