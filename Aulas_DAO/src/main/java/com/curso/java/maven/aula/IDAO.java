package com.curso.java.maven.aula;

import java.util.Collection;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

public interface IDAO {
	
	// Visibilidad Tipo/clase nombre (parametros)
	public void createAula(Aula aula);
	public Aula getAula(String nombreAula);
	public Set<Aula> getAulas();
	public void updateAula(Aula aula);
	public void deleteAula(String nombreAula);
	public Collection<Alumno> listaDeAlumnosPorAula(String nombreDeAula);

}
