
public class RecorrerString {
	static String hola="24:21";
	public static void main(String[] args) {
		int x=Integer.parseInt(hola.substring(0,2));
		int y=Integer.parseInt(hola.substring(3,5));
		System.out.println(hola.substring(0,2));//devuelve desde la pos 0 del string hasta la pos 2
		System.out.println(x);
		System.out.println(y);
	}
	
}	/*		for(int i=0;i<4;i++) {
			System.out.println(hola.charAt(i));
			
		}*/
