package nombre;

import java.util.Scanner;

public class modoEspera {
	private int opcion=2;
	Scanner Lector=new Scanner(System.in);
	public void IngresarModoEspera() {
		do {
			System.out.println("Modo ocupado");
			System.out.println("Salir modo espera?");
			System.out.println("[1] Si");
			System.out.println("[2] No");
			opcion=Lector.nextInt();
		}while(opcion==2);
		
	}
	public  int getter() {
		
		return opcion;
	}
	public  void setter(int option) {
		this.opcion=option;
	}
}
