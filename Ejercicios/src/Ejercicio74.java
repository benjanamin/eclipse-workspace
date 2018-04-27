
public class Ejercicio74 {
	public static void main(String[] args) {
		System.out.println(fac(5));
	}
	public static int fac(int n) {
		if(n>0) {
			return n*fac(n-1);
		}
		else {
			return 1;
		}
		
	}
}
