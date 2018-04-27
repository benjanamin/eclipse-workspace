package objetos;
/*
 false
1
2
3
78
88
 */
//en los for se vera un 6 o un 5 y es porque ese es el largo, si se asigna una variable tipo lardo tambien se puede hacer
public class Main {
	static int[] lista= {1,2,3,4,5};
	static Pila pila=new Pila();
	public static void main(String[] args) {
		System.out.println(pila.Empty(lista));
		pila.Pop(lista,5);
		pila.Pop(lista,5);
		pila.Push(lista, 78,5);
		pila.Push(lista, 88,5);
		for(int i=0;i<5;i++) {
			System.out.println(lista[i]);
		}
		
	}
		
		
	
}
