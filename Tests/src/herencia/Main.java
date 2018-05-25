	package herencia;

import java.util.ArrayList;

public class Main {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		Futbolista hola=new Futbolista(1,"HOLA","hola",10,60,"25");


		integrantes.add(hola);


		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
			integrante.Concentrarse();
		}

		// VIAJE
		System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
			integrante.Viajar();
		}
	}
}