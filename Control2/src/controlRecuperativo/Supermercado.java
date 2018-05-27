package controlRecuperativo;

import java.util.ArrayList;
import java.util.Scanner;



public class Supermercado {
	static int opcion=0;
	static Scanner Lector=new Scanner(System.in);
	private static ArrayList<Pasillo> pasillos=new ArrayList<Pasillo>();
	private static ArrayList<Object> empleados=new ArrayList<Object>();
	private static ArrayList<Object> caja=new ArrayList<Object>();
	public static void main(String[] args) {
		
		Bodega pablo =new Bodega("Pablo", "p", "pepe", "117");
		Reposicion juan =new Reposicion("Juan", "j", "Reposicion", "Ghost Division");
		Cajero pedro =new Cajero("Pedro", "p", "jai", "Overwatch");
		Pasillo pasillo = new Pasillo("101");
		Almacen almacen =new Almacen("01");
		//caja
		Filete filete= new Filete("Filete", 32, "1", "chancho", "Pasillo", "Nunca", "Nunca", "1");
		LecheEntera leche= new LecheEntera("lechita", 32, "1", "chancho", "Pasillo", "Nunca", "Nunca", "1");
		Lechuga Lechuga= new Lechuga("Lechuga", 32, "1", "chancho", "Almacen", "Nunca", "Nunca", "1");
		Lomo Lomo= new Lomo("Lomo", 32, "1", "chancho", "Almacen", "Nunca", "Nunca", "1");
		Manzana manzana= new Manzana("Manzana", 32, "1", "chancho", "Vendido", "Nunca", "Nunca", "1");
		
		pasillos.add(pasillo);
		empleados.add(pedro);
		empleados.add(juan);
		empleados.add(pablo);
		do  {
			menu();
			
		}while(opcion!=5);
		
	}
	

	public static void menu() {
		System.out.println("Hola, ingrese opcion:");
		System.out.println("[1] VerEmpleados");
		System.out.println("[2] Ver pasillos");
		System.out.println("[3] Ver Caja");
		System.out.println("[4] Ver almacen");
		System.out.println("[5] Salir");
		opcion=Lector.nextInt();
		
		switch(opcion) {
		case 1:
			for(int i=0;i<empleados.size();i++) {
				System.out.println(empleados.get(i).toString());
			}
			break;
		case 2:
			
			Lector.nextLine();
			break;
		case 3:
			
			Lector.nextLine();
			break;
		case 4:
			
			break;
		case 5:
			Lector.close();
			
			break;
		}
		
	}
}
