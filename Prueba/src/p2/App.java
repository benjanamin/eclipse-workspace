package p2;
//El override lo hago con los totrings pero de todos modos lo hare con otro metodo en caso de que sea necesario el metodo es setear el id de los moluscos y peces
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	static  public boolean rapper;
	static public boolean rapper2;
	
	
	public static void main(String[] args) {
		 Scanner Lector=new Scanner(System.in);
		 Vitrina vitrina= new Vitrina("A4",45);// se crea un acuario y se añaden a el 2 animales marinos
		Pez tiburon=new Pez("Tiburon", "1", 5, "tiburonis denisio", "el tiburon es un pez");
		Molusco choro=new Molusco("Choro", "2", 5, "Choritus maximus", "el que anda con cuchillo en la pobla");
		vitrina.AgregarAnimal(tiburon);
		vitrina.AgregarAnimal(choro);
		NFC celular1= new NFC(45);
		Sin celular2=new Sin(45);//se inician los 2 celulares como si estuvieran cerca
		
		System.out.println("Nos dimos cuenta que la id del tiburon esta pesimamente mala , actualmente su id es: "+ tiburon.getID()+
				"Ahora sera: 24");
		tiburon.setID("24");
		System.out.println(tiburon.getID());
		if(celular1.getPosicion()==vitrina.getPosicion()) {//se verifican la posicion de los celulares ( uno con y el otro sin NFC)
			rapper=true; //
		}
		while(!rapper&!rapper2) {//se verifica que esten cerca
			if(celular1.getPosicion()==vitrina.getPosicion()) {
				rapper=true;
			}
			if(celular2.getPosicion()==vitrina.getPosicion()) {
				rapper2=true;
			}
		}
		
	
		while(rapper) {//Simula si se acerca el totem con NFC y si luego se aleja (no puedo ponerle que aumente la distancia porque con un while aumenta demasiado)
			int opcion=0;
			System.out.println("Desea Mostrar la informacion?");
			System.out.println("[1]Si");
			System.out.println("[2]No");
			opcion=Lector.nextInt();
			switch(opcion) {
			case 1:
				for(int i=0;i<vitrina.getVitrina().size();i++) {
					System.out.println(vitrina.getVitrina().get(i).toString());
				}
				break;
			
			case 2:
				opcion=0;
				break;
				
			}
			rapper=false;//simula el alejamiento, arriba esta la razon por la que no puse el celular2.setPosicion(valor x);
			Lector.nextLine();			
			
				
			
		}
		
		if(celular2.getPosicion()==vitrina.getPosicion()) {
			rapper2=true;
			celular2.leerInfo();//Muestra imagen QR
		}
		

		while(rapper2) {//Simula si se acerca el totem con NFC y si luego se aleja (no puedo ponerle que aumente la distancia porque con un while aumenta demasiado)
			int opcion=0;
			System.out.println("Desea Mostrar la informacion?");
			System.out.println("[1]Si");
			System.out.println("[2]No");
			opcion=Lector.nextInt();
			switch(opcion) {
			case 1:
				for(int i=0;i<vitrina.getVitrina().size();i++) {
					System.out.println(vitrina.getVitrina().get(i).toString());
				}
				break;
			
			case 2:
				opcion=0;
				break;
				
			}
			rapper2=false;//simula el alejamiento, arriba esta la razon por la que no puse el celular2.setPosicion(valor x);
			Lector.nextLine();			
			
				
			
		}
	}
}
