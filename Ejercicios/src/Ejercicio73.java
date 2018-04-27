
public class Ejercicio73 {
	public static void main(String[] args) {
		System.out.println(cuadrado(5,5));
	}
	public static int cuadrado(int x,int n) {
		if(n>0) {
			return x*cuadrado(x,n-1);
			
		}
		else {
			return 1;
		}
	}
}
