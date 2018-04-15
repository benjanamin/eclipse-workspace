package nombre;

import java.util.Scanner;

public class Menu {
	private static int opcion;
	private static int opcion2=1;
	modoEspera espera= new modoEspera();
	Noticias noticia =new Noticias();
	Horarios horario= new Horarios();
	Scanner entero=new Scanner(System.in);
	public void menu() {
		System.out.println("Hola, ingrese opcion:");
		System.out.println("[1] Ingresar horario");
		System.out.println("[2] Modo ocupado");
		System.out.println("[3] Salir");
		
		opcion=entero.nextInt();
		
		switch(opcion) {
		case 1:
			ingresarHorario();
			
			break;
		case 2:
			do { 
				espera.IngresarModoEspera();
				noticias();
				menu();
				break;
			}while(opcion2==2);
		case 3:
			entero.close();
			horario.LectorStr.close();
			horario.LectorInt.close();;
			espera.Lector.close();
			break;
		}
	}
	public void ingresarHorario() {
		
		horario.ingresarHorario();
		horario.getHorarios();
		menu();
		
	}

	public void noticias() {

		noticia.News();
	}

	
}

