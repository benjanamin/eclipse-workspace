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
	
	public boolean Comparar(Horario horario1,Horario horario2) {
		if(horario1.getHorarioInicio().substring(0,1)=="1") {
			
		}
		return false;
	}
	public String toString(){
		String s="";
		
		return "Tienes: "+this.Actividad+"\n"+"De: "+this.horarioInicio+" a "+this.horarioFin;
		
	}
}
