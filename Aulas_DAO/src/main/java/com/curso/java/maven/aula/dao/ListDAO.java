package com.curso.java.maven.aula.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class ListDAO implements IDAO {

	private List<Aula> listaDeAulas = new ArrayList<Aula>();

	public void createAula(Aula aula) {
		listaDeAulas.add(aula);
	}

	public Aula getAula(String nombreAula) {
		for (int i = 0; i < listaDeAulas.size(); i++) {
			Aula aula = (Aula) listaDeAulas.get(i);
			if (nombreAula == aula.getNombre()) {
				return aula;
			}
		}
		return null;

	}

	public Collection<Aula> getAulas() {

		return listaDeAulas;
	}

	public void updateAula(Aula aula) {

		for (int i = 0; i < listaDeAulas.size(); i++) {
			if (listaDeAulas.remove(aula)) {
				listaDeAulas.add(aula);
			}
		}

	}

	public void deleteAula(String nombreAula) {
		Aula aulaABorrar = new Aula();
		aulaABorrar.setNombre(nombreAula);
		listaDeAulas.remove(aulaABorrar);

		// Esto est� correcto!! 
		/*for (int i = 0; i < listaDeAulas.size(); i++) {
			Aula aula = (Aula) listaDeAulas.get(i);
			if (nombreAula == aula.getNombre()) {
				listaDeAulas.remove(i);
			}
		}*/
	}

}
