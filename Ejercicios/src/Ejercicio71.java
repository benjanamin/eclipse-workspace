
public class Ejercicio71 {
	public static void main(String[] args) { 
		loop(10); 
		}
	public static void loop(int n) { 
		int i = n;
		while (i > 1) {
			System.out.println("n: "+n +" i: "+ i); 
			if (i % 2 == 0) { 
				i = i / 2;
				} 
			else { 
				i = i + 1;
				} 
			} 
		}
}

/* 2-10,5,6,3,4,2
 * 3- si, ya que siempre ira disminuyendo porque si el numero es par lo divide y si no lo transforma en par para disminuirlo
 		
 
 */
 