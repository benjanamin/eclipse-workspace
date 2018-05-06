package asistenteV2;

import java.util.ArrayList;
import java.util.Scanner;

public class Asistente {
	
	static ArrayList<Horario> Actividades=new ArrayList<Horario>();
	static int opcion=0;
	static boolean statusEspera=false;
	static Scanner Lector=new Scanner(System.in);
	static Scanner LectorStr=new Scanner (System.in);
	
	public static void main(String[] args) {
		do {
			menu();
		}while(opcion!=5);
		
	}
	
	public static void menu() {
		System.out.println("Hola, ingrese opcion:");
		System.out.println("[1] Ingresar horario");
		System.out.println("[2] Modo ocupado");
		System.out.println("[3] Mostrar Horarios");
		System.out.println("[4] Modificar Horarios");
		System.out.println("[5] Salir");
		opcion=Lector.nextInt();
		
		switch(opcion) {
		case 1:
			agregarHorario();
			break;
		case 2:
			modoEspera();
			Lector.nextLine();
			break;
		case 3:
			mostrarHorarios();
			Lector.nextLine();
			break;
		case 4:
			modificarHorarios();
			break;
		case 5:
			Lector.close();
			LectorStr.close();
			break;
		}
		
	}
	
	public static void modoEspera() {
		do {
			System.out.println("Modo ocupado");
			System.out.println("Salir modo espera?");
			System.out.println("[1] Si");
			System.out.println("[2] No");
			opcion=Lector.nextInt();
			if(opcion==1) {
				statusEspera=false;
			}
			else {
				statusEspera=true;
			}
		}while(statusEspera);
		
	}
	
	public static void agregarHorario() {

		String Inicio;
		String Fin;
		String Actividad;
		Horario aux;
		boolean flag1=false;
		boolean flag2=false;
		System.out.println("Al ingresar los horarios hacerlo en el formato HH:MM ej: 01:01");
		System.out.println("Ingrese Actividad: ");
		Actividad=LectorStr.nextLine();
		do {
			System.out.println("Ingrese horario de inicio");
			Inicio=LectorStr.next();
			if(Inicio.length()!=5||Inicio.charAt(1)==':'||Integer.parseInt(Inicio.substring(0, 2))>24||Integer.parseInt(Inicio.substring(3, 5))>60) {
				System.out.println("Horario ingresado mal");
				
			}
			else  if(Inicio.charAt(2)==':'&&Inicio.length()==5){
				flag1=true;
			}
			LectorStr.nextLine();
		}while(!flag1);
		do {
			System.out.println("Ingrese horario de finalizacion");
			Fin=LectorStr.next();
			if(Fin.length()!=5||Fin.charAt(1)==':'||Integer.parseInt(Fin.substring(0, 2))>24||Integer.parseInt(Fin.substring(3, 5))>60||Integer.parseInt(Inicio.substring(0, 2))>Integer.parseInt(Fin.substring(0, 2))) {
				
				System.out.println("Horario ingresado mal");
				
			}
			else  if(Fin.charAt(2)==':'&&Fin.length()==5){
				flag2=true;
			}
		}while(!flag2);
		LectorStr.nextLine();
		aux=new Horario(Inicio,Fin,Actividad);
		Actividades.add(aux);
		

	}

	public static void mostrarHorarios() {
		if(Actividades.isEmpty()) {
			System.out.println("No ha ingresado ninguna actividad");
		}
		else {
			for(int i=0;i<Actividades.size();i++) {
				System.out.print("["+(i+1)+"] ");
				System.out.println("Tienes: "+Actividades.get(i).getActividad());
				System.out.println("Desde: "+Actividades.get(i).getHorarioInicio());
				System.out.println("Hasta: "+Actividades.get(i).getHorarioFin());
			}
		}
		
	}
	
	public static void modificarHorarios() {
		int aux;
		int aux2;
		mostrarHorarios();
		System.out.println("Ingrese Numero de Horario a modificar o eliminar");
		aux=Lector.nextInt();
		System.out.println("¿Desea modificar o eliminar la actividad?");
		System.out.println("[1]Modificar");
		System.out.println("[2]Eliminar");
		System.out.println("[3]Volver");
		aux2=Lector.nextInt();
		switch(aux2) {
		case 1:

			String Inicio;
			String Fin;
			String Actividad;
			boolean flag1=false;
			boolean flag2=false;
			System.out.println("Al ingresar los horarios hacerlo en el formato HH:MM ej: 01:01");
			System.out.println("Ingrese Actividad: ");
			Actividad=LectorStr.nextLine();
			do {
				System.out.println("Ingrese horario de inicio");
				Inicio=LectorStr.next();
				if(Inicio.length()!=5||Inicio.charAt(1)==':'||Integer.parseInt(Inicio.substring(0, 2))>24||Integer.parseInt(Inicio.substring(3, 5))>60) {
					System.out.println("Horario ingresado mal");
				}
				else  if(Inicio.charAt(2)==':'&&Inicio.length()==5){
					flag1=true;
				}
				LectorStr.nextLine();
			}while(!flag1);
			do {
				System.out.println("Ingrese horario de finalizacion");
				Fin=LectorStr.next();
				if(Fin.length()!=5||Fin.charAt(1)==':'||Integer.parseInt(Fin.substring(0, 2))>24||Integer.parseInt(Fin.substring(3, 5))>60||Integer.parseInt(Inicio.substring(0, 2))>Integer.parseInt(Fin.substring(0, 2))) {
					
					System.out.println("Horario ingresado mal");
					
				}
				else  if(Fin.charAt(2)==':'&&Fin.length()==5){
					flag2=true;
				}
			}while(!flag2);
			Actividades.get(aux-1).setHorarioInicio(Inicio);
			Actividades.get(aux-1).setHorarioInicio(Fin);
			Actividades.get(aux-1).setActividad(Actividad);
			LectorStr.nextLine();
			break;
		case 2:
			eliminarHorario(aux-1);
			break;
		}
	
	}
	
	public static void eliminarHorario(int numero) {
		Actividades.remove(numero);
		mostrarHorarios();
		System.out.println("Actividad Eliminada");
	}
	
	
}
