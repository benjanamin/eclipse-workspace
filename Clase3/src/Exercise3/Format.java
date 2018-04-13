package Exercise3;
import java.util.Scanner;

public class Format {
	public static void americano(String n,int d,String m, int y) {
		System.out.println("Tipo americano\n"+n+", "+m+" "+d+", "+y);//aqui use las variables con estos nombres solo porque es un trabajo corto
		d=d+1;
		if(d!=30) {
			while(d<31) {
				System.out.println(d);
				d=d+1;
			}
		}
	}
	public static void europeo(String n,int d,String m, int y) {
		System.out.println("Tipo Europeo\n"+n+", "+d+" "+m+", "+y);
		d=d+1;
		if(d!=30) {
			while(d<31) {
				System.out.println(d);
				d=d+1;
			}
		}
	}
	public static void main(String[] args) {
		String nombre;
		String mes;
		int dia;
		int año;
		int opcion;
		Scanner entero=new Scanner(System.in);
		Scanner string=new Scanner(System.in);
		System.out.println("ingrese nombre dia");
		nombre=entero.nextLine();
		
		System.out.println("ingrese mes");
		mes=entero.nextLine();
	
		System.out.println("ingrese numero dia");
		dia=entero.nextInt();
		
		System.out.println("ingrese año");
		año=entero.nextInt();
		System.out.println("ingrese formato");
		System.out.println("[1]Americano");
		System.out.println("[2]Europeo");
		opcion=entero.nextInt();
		if(opcion==1) {
		americano(nombre,dia,mes,año);
		}
		else if(opcion==2) {
		europeo(nombre,dia,mes,año);
		}
		else {
			System.out.println("operacion no valida");
		}
	}
}
