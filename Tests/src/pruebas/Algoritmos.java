package pruebas;
import java.util.ArrayList;



public class Algoritmos {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> pepe=new ArrayList<Integer>();
		pepe.add(1);
		pepe.add(23);
		pepe.add(14);
		pepe.add(2);
		pepe.add(0);
		quickSortArray(pepe, 0, pepe.size()-1);
		for (int i=0;i<pepe.size();i++){
			System.out.println(pepe.get(i));
		}
	}
	
	public static void Insercion (ArrayList<Horario> vector) {
	      for (int i=1; i < vector.size(); i++) {
	        Horario aux = vector.get(i);
	         int j;
	         for (j=i-1; j >=0 && vector.get(j).IniciotoInt() > aux.IniciotoInt(); j--){
	              vector.set(j+1, vector.get(j));
	          }
	         vector.set(j+1, aux);
	      }
	   }
    public static void quickSort(int[] vector, int izquierda, int derecha) {
        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }
    
    
    public static void quickSortArray(ArrayList<Integer> lista, int izquierda, int derecha) {
        int pivote =lista.get(izquierda);
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (lista.get(i) <= pivote && i < j) {
                i++;
            }
            while (lista.get(j) > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio =lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, auxIntercambio);
               
            }
        }
        lista.set(izquierda, lista.get(j));
        lista.set(j, pivote);
        
        if (izquierda < j - 1) {
            quickSortArray(lista, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSortArray(lista, j + 1, derecha);
        }
    }
}