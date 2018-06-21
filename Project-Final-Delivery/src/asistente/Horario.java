package asistente;

import java.util.ArrayList;

public class Horario {
	private String horarioInicio;
	private String horarioFin;
	private String Actividad;
	private String Dia;
	private String Mes;
	private String Year;
	private boolean Leido=false;
	private boolean Notificado=false;
	public Horario() {
		
	}
	
	public Horario(String dia,String mes,String year,String Inicio, String Fin,String actividad) {
		this.Dia=dia;
		this.Mes=mes;
		this.Year=year;
		this.horarioInicio=Inicio;
		this.horarioFin=Fin;
		this.Actividad=actividad;
	}
	
	public boolean getNotificado() {
		return this.Notificado;
	}
	
	public void Notificado() {
		this.Notificado=true;
	}
	
	public String getHorarioInicio(){
		return this.horarioInicio;
	}
	
	public String getHorarioFin(){
		return this.horarioFin;
	}
	
	public String getActividad(){
		return this.Actividad;
	}
	
	public String getDia(){
		return this.Dia;
	}
	
	public String getMes(){
		return this.Mes;
	}
	
	public String getYear(){
		return this.Year;
	}
	public boolean getLeido() {
		return this.Leido;
	}
	
	public void setHorarioInicio(String Inicio) {
		this.horarioInicio=Inicio;
	}
	
	public void setHorarioFin(String Fin) {
		this.horarioFin=Fin;
	}
	
	public void setActividad(String Actividad) {
		this.Actividad=Actividad;
	}
	
	public void setDia(String Actividad) {
		this.Dia=Actividad;
	}

	public void setMes(String Actividad) {
		this.Mes=Actividad;
	}

	public void setYear(String Actividad) {
		this.Year=Actividad;
	}
	
	public void setLeido(boolean b) {
		this.Leido=b;
	}
	
	
	public int IniciotoInt() {
		int entero;
		String s;
		/*Inicio.length()!=5||Inicio.charAt(1)==':'||Integer.parseInt(Inicio.substring(0, 2))>24||
		 * Integer.parseInt(Inicio.substring(3, 5))>60||Fin.length()!=5||Fin.charAt(1)==':'||
		 * Integer.parseInt(Fin.substring(0, 2))>24||Integer.parseInt(Fin.substring(3, 5))>60||
		 * Integer.parseInt(Inicio.substring(0, 2))>Integer.parseInt(Fin.substring(0, 2))
		 */
		s=this.horarioInicio.substring(0, 2)+this.horarioInicio.substring(3, 5);
		entero=Integer.parseInt(s);
		return entero;
	}
	
	public int FinotoInt() {
		int entero;
		String s;
		/*Inicio.length()!=5||Inicio.charAt(1)==':'||Integer.parseInt(Inicio.substring(0, 2))>24||
		 * Integer.parseInt(Inicio.substring(3, 5))>60||Fin.length()!=5||Fin.charAt(1)==':'||
		 * Integer.parseInt(Fin.substring(0, 2))>24||Integer.parseInt(Fin.substring(3, 5))>60||
		 * Integer.parseInt(Inicio.substring(0, 2))>Integer.parseInt(Fin.substring(0, 2))
		 */
		s=this.horarioFin.substring(0, 2)+this.horarioFin.substring(3, 5);
		entero=Integer.parseInt(s);
		return entero;
	}
	
	public int FechatoInt() {
		int entero;
		String s;
		/*Inicio.length()!=5||Inicio.charAt(1)==':'||Integer.parseInt(Inicio.substring(0, 2))>24||
		 * Integer.parseInt(Inicio.substring(3, 5))>60||Fin.length()!=5||Fin.charAt(1)==':'||
		 * Integer.parseInt(Fin.substring(0, 2))>24||Integer.parseInt(Fin.substring(3, 5))>60||
		 * Integer.parseInt(Inicio.substring(0, 2))>Integer.parseInt(Fin.substring(0, 2))
		 */
		s=this.Year+this.Mes+this.Dia;
		entero=Integer.parseInt(s);
		return entero;
	}
	
	public String getFecha() {
		String s;
		
		s=this.Dia+"/"+this.Mes+"/"+this.Year;
		return s;
	}
	
	public double FechatoDouble() {
		double n;
		String s;
		
		s=this.Year+this.Mes+this.Dia+this.IniciotoInt();
		n=Double.parseDouble(s);
		return n;
	}
	
	
	

	public String toString(){
		String s="";
		
		return "Tienes: "+this.Actividad+"\n"+"De: "+this.horarioInicio+" a "+this.horarioFin;
		
	}

	public void leido() {
		this.Leido=true;
	}

}
