import java.util.Scanner;
import java.util.Random;
public class Pila2 {
	//double pepe= (Math.random()*100-80);
	//new int[5];
		//Random randomo= new Random();
		static int n=20;
		static int largo1=5;
		static int largo2=Math.abs(n-largo1);
		static int[] pilasuprema=new int[n];
		static int[] pila= new int[largo1];
		static int[] pila2= new int[largo2];
		
		Scanner escaner=new Scanner(System.in);
		public static void main(String[] args) {
			Random randomo= new Random();
			int aleatorio;

			for(int i=0;i<largo1;i++) {
				do {
				aleatorio= (int)(Math.random()*10)+32;
				}while(aleatorio==0);
				Push(pila,aleatorio,largo1);
			}
			for(int j=0;j<largo2;j++) {
				do {
					aleatorio= (int)(Math.random()*10)+31;
				}while(aleatorio==0);
				Push(pila2,aleatorio,largo2);
			}
			for(int i=0;i<largo1;i++) {
				
				Push(pilasuprema,pila[i],largo1);
			}
			for(int i=largo1+1;i<largo2;i++) {
				
				Push(pilasuprema,pila2[i],largo2);
			}
			
			for(int k=0;k<largo2;k++) {

				System.out.println(pila2[k]);
					
			}

		}
		public static void Push(int[] lista,int b,int largo) {
			for(int i=0;i<largo;i++) {
				if(lista[i]==0) {
					lista[i]=b;
					break;
				}
			}
		}
		
		public static void Pop(int[] lista,int largo) {
			if(Empty(lista)) {
				System.out.println("Esta vacia");
			}
			else {
				for(int i=largo-1;i>=0;i--) {
					if(lista[i]!=0) {
						lista[i]=0;
						i=largo;
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
