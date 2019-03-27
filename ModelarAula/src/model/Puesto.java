package model;

public class Puesto {
	//public HashMap<double, double> posicion;
	//public String sistemaOperativo;
	private Boolean ordenador;
	//private Alumno alumno;
	//private Profesor profesor;
	private Persona persona;
	
	public Puesto (boolean ordenador) {
		this.ordenador=ordenador;
	}
	
	public Boolean getOrdenador() {
		return ordenador;
	}
	public void setOrdenador(Boolean ordenador) {
		this.ordenador = ordenador;
	}
/*	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
*/
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
}

