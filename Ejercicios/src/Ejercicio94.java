
public class Ejercicio94 {
	public static char first(String s) { 
		return s.charAt(0);
		}
	
	public static String rest(String s) { 
		return s.substring(1);
		}
	
	public static String middle(String s) { 
		return s.substring(1, s.length() - 1); 
		}
	
	public static int length(String s) {
		return s.length();
		}
	
	public static void printString(String s) {
		if(length(s)==1) {
			System.out.println(s);
		}
		else {
			System.out.println(first(s));
			printString(rest(s));
		}
	
		
	}
	public static void printBackwards(String s) {
		String aux;
		for (int i=length(s);i>0;i--) {
			
		}
	}
	public static String reverseString(String s) {
		String aux="";
		for(int i=length(s)-1;i>=0;i--) {
			if(aux.isEmpty()) {
				aux=String.valueOf(s.charAt(i)) ;
			}
			else {
				aux=aux+String.valueOf(s.charAt(i));
			}
			
		}
		return aux;
	}
	public static boolean isPalindrome(String s) {
		boolean aux=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(s.length()-i-1)) {
				aux=true;
			}
			else {
				aux=false;
			}
			
		}
		return aux;
		
	}
	
	public static void main(String[] args) {
		String s= "tt";
		System.out.println(first(s));
		System.out.println(rest(s));
		System.out.println(middle(s));
		System.out.println(length(s));
		printBackwards(s);
		System.out.println(reverseString(s));
		System.out.println(isPalindrome(s));
	}


}
