
public class Ejercicio68 {
	public static int Mikasa_Ackermann(int m, int n) {
		if(m==0) {
			return n+1;
		}
		if(m>0&&n==0) {
			return Mikasa_Ackermann(m-1,1);
		}
		if(m>0&&n>0) {
			return Mikasa_Ackermann(m-1,Mikasa_Ackermann(m,n-1));
		}
		
		return 1;
	}
	public static void main(String[] args) {
		System.out.println(Mikasa_Ackermann(3,3));
	}
}

