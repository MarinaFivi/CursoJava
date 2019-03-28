package com.curso.java.maven.aula.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class MapDAO implements IDAO {
	
	private Map<String, Aula> mapaDeAulas = new HashMap<String, Aula>();

	public void createAula(Aula aula) {

		String nombreAula= aula.getNombre();
		mapaDeAulas.put(nombreAula, aula);
	}
	public Aula getAula(String nombreAula) {
		return mapaDeAulas.get(nombreAula);
		
	}
	public Collection<Aula> getAulas() {
		return mapaDeAulas.values();
		
	}
	public void updateAula(Aula aula) {
		String nombreAula= aula.getNombre();
		mapaDeAulas.put(nombreAula, aula);
	}
	public void deleteAula(String nombreAula) {
		mapaDeAulas.remove(nombreAula);		
	}

}

