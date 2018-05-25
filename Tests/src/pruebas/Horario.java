package pruebas;

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
	
	public int Comparar(Horario horario1,Horario horario2) {
		if(Integer.parseInt(horario1.getHorarioInicio().substring(0, 2))>
		Integer.parseInt(horario2.getHorarioInicio().substring(0, 2))) {
			return 1;
		}
		if(Integer.parseInt(horario1.getHorarioInicio().substring(0, 2))<
		Integer.parseInt(horario2.getHorarioInicio().substring(0, 2))) {
			return -1;
		}
		if(Integer.parseInt(horario1.getHorarioInicio().substring(3, 5))>
				Integer.parseInt(horario2.getHorarioInicio().substring(3, 5))) {
			return 1;	
		}
		if(Integer.parseInt(horario1.getHorarioInicio().substring(3, 5))<
				Integer.parseInt(horario2.getHorarioInicio().substring(3, 5))) {
			return -1;	
		}
		
		
		return 0;
	}
	
}
