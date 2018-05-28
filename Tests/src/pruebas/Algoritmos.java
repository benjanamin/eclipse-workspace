package pruebas;
import java.util.ArrayList;



public class Algoritmos {
	
	
	public static void main(String[] args) {
		int a[]= {1,3,7,0,5};
		ArrayList<Horario> Actividades=new ArrayList<Horario>();
		Horario h1=new Horario("11:11","13:12","tercero");
		Horario h2=new Horario("21:12","24:12","cuarto");
		Horario h6=new Horario("23:34","23:14","sexto");
		Horario h3=new Horario("00:11","13:12","primero");
		Horario h4=new Horario("05:12","12:12","segundo");
		Horario h5=new Horario("23:12","23:14","quinto");
		
		Actividades.add(h1);
		Actividades.add(h2);
		Actividades.add(h3);
		Actividades.add(h4);
		Actividades.add(h5);
		Actividades.add(h6);
		Insercion(Actividades);
	//quicksortHorarios(Actividades, 0, Actividades.size()-1);
		for(int i=0;i<Actividades.size();i++) {
			System.out.println(Actividades.get(i).getActividad());
		}
	}
	
	/*public static void Insercion (int[] vector) {
      for (int i=1; i < vector.length; i++) {
         int aux = vector[i];
         int j;
         for (j=i-1; j > =0 && vector[j] > aux; j--){
              vector[j+1] = vector[j];
          }
         vector[j+1] = aux;
      }
   }*/
	
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

	
}