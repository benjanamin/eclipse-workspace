
/*
false
1
2
3
7
7
  
 */

import java.util.Scanner;
public class Pila {
	//new int[5];
	static int[] pila= {1,2,3,4,5};
	Scanner escaner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(Empty(pila));
		Pop(pila);
		Pop(pila);
		Push(pila,7);
		Push(pila,7);

		for(int i=0;i<5;i++) {
			System.out.println(pila[i]);
		}
	}
	public static void Push(int[] lista,int b) {
		for(int i=0;i<5;i++) {
			if(lista[i]==0) {
				lista[i]=b;
				i=6;
			}
		}
	}
	
	public static void Pop(int[] lista) {
		if(Empty(lista)) {
			System.out.println("Esta vacia");
		}
		else {
			for(int i=4;i>=0;i--) {
				if(lista[i]!=0) {
					lista[i]=0;
					break;
				}
			}
		}
	}
	
	public static boolean Empty(int[] lista) {
		boolean empty=false;
			if(lista[1]!=0){
				empty=false;
			}
			else {
				empty=true;
			}
		
		return empty;
	}
	

}
