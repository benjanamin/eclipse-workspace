import java.util.Scanner;
public class Ejercicio57 {
	public static void preguntar() {
		int Max=0;
		int Min=0;
		Scanner numero=new Scanner(System.in);
		System.out.println("Ingresa entre que valores quieres que adivine");
		System.out.println("Ingresa el menor");
		Min=numero.nextInt();
		System.out.println("Ingresa el mayor");
		Max=numero.nextInt();
		if(Max<Min) {
			System.out.println("Alguien tiene que aprender lo que significa mayor y menor");
		}
		else {
		adivinar(Max,Min);
		}
	}
	public static void adivinar(int x, int y) {
				Scanner numero=new Scanner(System.in);
				int opcion=0;
				int numeroAdivinado=((x+y)/2);
				System.out.println("Tu numero es:"+ numeroAdivinado);
				System.out.println("[1] El numero es mayor");
				System.out.println("[2] El numero es menor");
				System.out.println("[3] Acertaste");
				opcion=numero.nextInt();
				switch(opcion) {
				case 1: adivinar(x,numeroAdivinado);
						break;
				case 2: adivinar(numeroAdivinado,y);
						break;
				case 3: System.out.println("gane");
						break;
				default:  System.out.println("opcion no valida, intentalo de nuevo");
							adivinar(x,y);
				}
				
	}
	
	public static void main(String[] args) {
		preguntar();
	}
}
