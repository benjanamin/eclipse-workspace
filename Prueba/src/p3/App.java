package p3;
//El override lo hago con los substrings pero de todos modos lo hare con otro metodo en caso de que sea necesario el metodo es setear el id de los moluscos y peces
import java.util.ArrayList;
import java.util.Scanner;

public class App {


	
	
	public static void main(String[] args) {
		boolean dentro=true;
		boolean rapper;
		Establecimiento fondo=new Establecimiento();//se crea el establecimiento  luego se le añaden las vitrinas para que funcione
		Juego juego = new Juego();
		 Scanner Lector=new Scanner(System.in);
		 
		 Vitrina vitrina= new Vitrina("A4",45);// se crea un acuario y se añaden a el 2 animales marinos
		 //En este caso se deberian crear mas vitrinas y añadirlas al establecimiento, se genera un wrapper hasta que se salga del establecimiento
		Pez tiburon=new Pez("Tiburon", "1", 5, "tiburonis denisio", "el tiburon es un pez");
		Molusco choro=new Molusco("Choro", "2", 5, "Choritus maximus", "el que anda con cuchillo en la pobla");
		vitrina.AgregarAnimal(tiburon);
		vitrina.AgregarAnimal(choro);
		NFC celular1= new NFC(45);
		Sin celular2=new Sin(45);//se inician los 2 celulares como si estuvieran cerca
		while(dentro) {
			//se haria un for para comprobar si esta cerca de las posiciones ( en este caso se ve si estuviera cerca con una sola)
			if(celular1.getPosicion()==vitrina.getPosicion()) {// en vez de poner vitrina se haria con el array que se crea en establecimiento 
				rapper=true;
				
			}
			else {
				rapper=false;
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
					juego.setPuntaje(juego.getPuntaje()+1);//se le añade puntaje y marca la posicion como visitada
					break;
				
				case 2:
					opcion=0;
					break;
					
				}
				rapper=false;//simula el alejamiento, arriba esta la razon por la que no puse el celular2.setPosicion(valor x);
				Lector.nextLine();			
				
					
				
			}
			
		}
		//Una vez que se sale del area de los animales se muestra el premio ganado
		System.out.println(juego.getPuntaje());
		System.out.println(juego.verPremio());

		
		

	}
}
