public class Ejercicio69 {
	public static double power(double x, int n) {
		if(n==0) {
			return 1;
		}
		else {
			return x*power(x,n-1);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(power(5,3));
	}
}
