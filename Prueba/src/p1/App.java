package p1;

import java.util.ArrayList;

public class App {

	static  public boolean rapper;
	static public boolean rapper2;
	
	
	public static void main(String[] args) {
		 Vitrina vitrina= new Vitrina("A4",45);// se crea un acuario y se añaden a el 2 animales marinos
		Pez tiburon=new Pez("Tiburon", "1", 5, "tiburonis denisio", "el tiburon es un pez");
		Molusco choro=new Molusco("Choro", "2", 5, "Choritus maximus", "el que anda con cuchillo en la pobla");
		vitrina.AgregarAnimal(tiburon);
		vitrina.AgregarAnimal(choro);
		NFC celular1= new NFC(true,"NFC");
		Sin celular2=new Sin(true,"Sin");//se inician los 2 celulares como si estuvieran cerca
	
		if(celular1.getCerca()) {//se verifican la posicion de los celulares ( uno con y el otro sin NFC)
			rapper=true; //
		}
		
		
	
		while(rapper) {//Simula si se acerca el totem con NFC y si luego se aleja (
			for(int i=0;i<vitrina.getVitrina().size();i++) {
				System.out.println(vitrina.getVitrina().get(i).toString());
			}
			celular1.setPosicion(false);
			if(!celular1.getCerca()) {
				rapper2=false;
			}
				
			
		}
		
		if(celular2.getCerca()) {
			rapper2=true;
			celular2.leerInfo();//Muestra imagen QR
		}
		
		while(rapper2) {//Simula si se acerca el totem con NFC 
			for(int i=0;i<vitrina.getVitrina().size();i++) {
				System.out.println(vitrina.getVitrina().get(i).toString());
			}
			celular2.setPosicion(false);
			if(!celular2.getCerca()) {
				rapper2=false;
			}
		}
	}
}
