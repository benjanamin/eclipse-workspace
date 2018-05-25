package pruebas;
import java.util.ArrayList;



public class Algoritmos {
	
	
	public static void main(String[] args) {
		int a[]= {1,3,7,0,5};
		ArrayList<Horario> Actividades=new ArrayList<Horario>();
		Horario h1=new Horario("11:11","13:12","tercero");
		Horario h2=new Horario("21:12","24:12","cuarto");
		Horario h3=new Horario("00:11","13:12","primero");
		Horario h4=new Horario("05:12","12:12","segundo");
		Actividades.add(h1);
		Actividades.add(h2);
		Actividades.add(h3);
		Actividades.add(h4);
		System.out.println(h1.Comparar(h1, h4));
		quicksortHorarios(Actividades, 0, Actividades.size()-1);
		quicksort(a, 0, 4);
		for(int i=0;i<Actividades.size();i++) {
			System.out.println(Actividades.get(i).getActividad());
		}
	}
	public static void quicksort(int A[], int izq, int der) {
		
		  int pivote=A[izq]; // tomamos primer elemento como pivote
		  int i=izq; // i realiza la búsqueda de izquierda a derecha
		  int j=der; // j realiza la búsqueda de derecha a izquierda
		  int aux;
		 
		  while(i<j){            // mientras no se crucen las búsquedas
		     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
		     while(A[j]>pivote) j--;         // busca elemento menor que pivote
		     if (i<j) {                      // si no se han cruzado                      
		         aux= A[i];                  // los intercambia
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
		   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
		   if(izq<j-1)
		      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
		   if(j+1 <der)
		      quicksort(A,j+1,der); // ordenamos subarray derecho
		}
	public static void quicksortHorarios(ArrayList<Horario> lista,int izq,int der) {
		
		Horario pivote=lista.get(0);
		int i=izq;
		int j=der;
		Horario aux;
		while(i<j) {
			while(lista.get(i).Comparar(lista.get(i), pivote)<=0 && i<j) i++;
			while(lista.get(i).Comparar(lista.get(i), pivote)>0 && i<j) j--;
			if(i<j) {
				aux=lista.get(i);
				lista.set(i, lista.get(j));
				lista.set(j, aux);
			}
		}
		lista.set(izq, lista.get(j));
		lista.set(j, pivote);
		if(izq<j-1) {
			quicksortHorarios(lista,izq,j-1);
		}
		if(j+1<der) {
			quicksortHorarios(lista,j+1,der);
		}
	}
}
