package nombre;

public class modoEspera {
	private int opcion=2;
	public void IngresarModoEspera() {
		do {
			System.out.println("Modo ocupado");
			System.out.println("Salir modo espera?");
			System.out.println("[1] Si");
			System.out.println("[2] No");
		}while(opcion==2);
		
	}
	public  int getter() {
		
		return opcion;
	}
	public  void setter(int option) {
		this.opcion=option;
	}
}
