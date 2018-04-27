import java.util.Scanner;
public class Ejercicio72 {

	public static void main(String[] args) {
		double x;
		int a;
		Scanner escaner=new Scanner(System.in);
		System.out.println("Ingrese numero a calcular Raiz");
		a=escaner.nextInt();
		x=a/2;
	
		squareRoot(x,a);
		
	}
	public static void squareRoot(double n,int a) {
		double square;

		double resta;
		square=(n+a/n)/2;
		resta=Math.abs(square-n);
		if(resta>0.0001) {
			squareRoot(square,a);
		}
		else {
			System.out.println(square);
		}
	}
}
