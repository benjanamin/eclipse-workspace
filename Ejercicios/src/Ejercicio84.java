
public class Ejercicio84 {
	public static void main(String[] args) {
		int[] d= {1,2,3,87,5};
		System.out.println(max(d));
	}
	public static int max(int[] a) {
		int max=0;
		for(int value:a) {
			if(value>max) {
				max=value;
			}
		}
		return max;
	}
}
