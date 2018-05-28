package asistente;

public class Horario {
	private String horarioInicio;
	private String horarioFin;
	private String Actividad;
	public Horario() {
		
	}
	
	public Horario(String Inicio, String Fin,String actividad) {
		
		this.horarioInicio=Inicio;
		this.horarioFin=Fin;
		this.Actividad=actividad;
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
	
	public void setHorarioInicio(String Inicio) {
		this.horarioInicio=Inicio;
	}
	
	public void setHorarioFin(String Fin) {
		this.horarioFin=Fin;
	}
	
	public void setActividad(String Actividad) {
		this.Actividad=Actividad;
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
	
	
	public boolean Comparar(Horario that) {
		
		return false;
	}
	public String toString(){
		String s="";
		
		return "Tienes: "+this.Actividad+"\n"+"De: "+this.horarioInicio+" a "+this.horarioFin;
		
	}
}
