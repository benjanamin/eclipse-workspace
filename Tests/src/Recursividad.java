
public class Recursividad {
	
	public static int numero(int numero) {
		if(numero<0) {
			
			return 1;
		}
		else {
			System.out.println(numero);
			return numero-numero(numero-1);
			
		}
	}
	public static void main(String[] args) {
		System.out.println(numero(5));
	}
}
