package nombre;

import java.util.ArrayList;
import java.util.Scanner;

public class Horarios  {
	private ArrayList<String> Actividades=new ArrayList<String>();
	private ArrayList<Integer> horariosInicio=new ArrayList<Integer>();
	private ArrayList<Integer> horariosFin=new ArrayList<Integer>();
	Scanner LectorStr=new Scanner(System.in);
	Scanner LectorInt=new Scanner(System.in);
	public void ingresarHorario() {
		
		System.out.println("Ingrese Actividad");
		Actividades.add(LectorStr.nextLine());
		System.out.println("Ingrese horario de inicio");
		horariosInicio.add(LectorInt.nextInt());
		System.out.println("Ingrese horario de finalizacion");
		horariosFin.add(LectorInt.nextInt());
		
		System.out.println("Horario ingresado");


	}
	
	public  void getHorarios() {//
		if(horariosInicio.isEmpty()||horariosFin.isEmpty()) {
			System.out.println("No ha ingresado ninguna actividad");
		}
		else {
			for(int i=0;i<horariosInicio.size();i++) {
				System.out.println(Actividades.get(i)+" empieza a las "+horariosInicio.get(i)+" y termina a las "+ horariosFin.get(i));
			}
		}	
	}
	
	
}
