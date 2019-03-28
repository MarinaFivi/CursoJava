package com.curso.java.maven.aula.negocio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.curso.java.maven.aula.dao.IDAO;
import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

public class Negocio {
	private IDAO miDao;
	
	public Negocio(IDAO miDao) {
		super();
		this.miDao = miDao;
	}
	//Crear Aula
	public void createAula(String nombre, boolean pizarra, boolean proyector, Integer numeroDePuestos) {
		Set<PuestoDeTrabajo> puestos = new HashSet<PuestoDeTrabajo>();
		for(int i =0;i<numeroDePuestos;i++) {
			puestos.add(new PuestoDeTrabajo(true));
		}
		Aula aula = new Aula(nombre, pizarra, proyector, puestos);
		aula.setPuestoDelProfesor(new PuestoDeTrabajo(true));
		miDao.createAula(aula);
	}
	
	//Lista de Alumnos por aula (Mapa con clave el nombre del aula y valor lista de alumnos?)
//Ya te dan un aula, no tienes q formar el set, del aula que te pidan sacas los alumnos de ahí a una lista.
	public List<Alumno> listaDeAlumnosPorAula(String nombreDeAula) 
	{
		Aula aula = miDao.getAula(nombreDeAula);
		if(aula == null) {
			return null;
		}
			
		//new HashMap<String, Set<PuestoDeTrabajo>>();
		Iterator<PuestoDeTrabajo> iteradorpuestos = aula.getPuestosDeAlumnos().iterator();
		ArrayList<Alumno> alumnosPorAula = new ArrayList<Alumno>();
		while(iteradorpuestos.hasNext()) {
			PuestoDeTrabajo puestoDeTrabajo = iteradorpuestos.next();
			alumnosPorAula.add((Alumno)puestoDeTrabajo.getPersona());
		}
		return alumnosPorAula;
	}
	
	//Lista de profesores por aula
	public List<Profesor> listaDeProfesPorAula(String nombreDeAula) {
		List<Profesor> lista = new ArrayList<Profesor>();
		Aula aula = miDao.getAula(nombreDeAula);
		lista.add((Profesor) aula.getPuestoDelProfesor().getPersona());
		return lista;
	}
	
	//Asignar Alumno a Aula
	public void asignarAlumnoAula (String nombreAula, Alumno alumno ) {
		Aula aula = miDao.getAula(nombreAula);
		for(PuestoDeTrabajo puestoDeAlumnoActual : aula.getPuestosDeAlumnos()) {
			if(puestoDeAlumnoActual.getPersona() == null) {
				puestoDeAlumnoActual.setPersona(alumno);
				return;
			}
		}
		
//		PuestoDeTrabajo puestoAlumno= new PuestoDeTrabajo(true);
//		puestoAlumno.setPersona(alumno);
//		Set<PuestoDeTrabajo> setPuestos = aula.getPuestosDeAlumnos();
//		setPuestos.add(puestoAlumno);
//		for (int i=0; i<aula.getPuestosDeAlumnos().size(); i++) {
//				}
	}
	
	
	//Eliminar aula
	public void deleteAula(String nombreAula) {
		miDao.deleteAula(nombreAula);
		
	}

}
