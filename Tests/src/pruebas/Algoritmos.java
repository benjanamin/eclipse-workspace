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
		Horario h5=new Horario("23:12","23:14","segundo");
		Actividades.add(h1);
		Actividades.add(h2);
		Actividades.add(h3);
		Actividades.add(h4);
		System.out.println(h1.Comparar(h1, h4));
		quicksortHorarios(Actividades, 0, Actividades.size()-1);
		Actividades=quickSort(Actividades);
		for(int i=0;i<Actividades.size();i++) {
			System.out.println(Actividades.get(i).getHorarioInicio());
		}
	}
/*	public static void quicksort(int A[], int izq, int der) {
		
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
		}*/
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
				System.out.println("cambiados");
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
	public static ArrayList<Horario> quickSort(ArrayList<Horario> list)
	{
	    if (list.isEmpty()) 
	        return list; // start with recursion base case
	    ArrayList<Horario> sorted;  // this shall be the sorted list to return, no needd to initialise
	    ArrayList<Horario> smaller = new ArrayList<Horario>(); // Horarios smaller than pivot
	    ArrayList<Horario> greater = new ArrayList<Horario>(); // Horarios greater than pivot
	    Horario pivot = list.get(0);  // first Horario in list, used as pivot
	    int i;
	    Horario j;     // Variable used for Horarios in the loop
	    for (i=1;i<list.size();i++)
	    {
	        j=list.get(i);
	        if (j.Comparar(j, pivot)<=0)   // make sure Horario has proper compareTo method 
	            smaller.add(j);
	        else
	            greater.add(j);
	    }
	    smaller=quickSort(smaller);  // capitalise 's'
	    greater=quickSort(greater);  // sort both halfs recursively
	    smaller.add(pivot);          // add initial pivot to the end of the (now sorted) smaller Horarios
	    smaller.addAll(greater);     // add the (now sorted) greater Horarios to the smaller ones (now smaller is essentially your sorted list)
	    sorted = smaller;            // assign it to sorted; one could just as well do: return smaller

	    return sorted;

}
	
}