package nombre;

import java.util.Scanner;

public class Menu {
	private static int opcion;
	private static int opcion2=1;
	public static void menu() {
		System.out.println("Hola, ingrese opcion:");
		System.out.println("[1] Ingresar horario");
		System.out.println("[2] Modo ocupado");
		System.out.println("[3] Salir");
		Scanner entero=new Scanner(System.in);
		opcion=entero.nextInt();
		
		switch(opcion) {
		case 1:
			ingresarHorario();
			
			break;
		case 2:
			do { 
				System.out.println("Modo ocupado");
				System.out.println("Salir modo espera?");
				System.out.println("[1] Si");
				System.out.println("[2] No");
				opcion2=entero.nextInt();
				if(opcion2==1) {
					noticias();
					menu();
					break;
				}
			}while(opcion2==2);
		case 3:
			entero.close();
			
			break;
		}
	}
	public static void ingresarHorario() {
		Horarios horario= new Horarios();
		horario.ingresarHorario();
		horario.getHorarios();
		menu();
		
	}

	public static void noticias() {
		
		Noticias noticia =new Noticias();
		noticia.News();
	}
	public static void ModoEspera() {
		modoEspera espera= new modoEspera();
		espera.IngresarModoEspera();
		
	}
	
}

