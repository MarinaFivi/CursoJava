package com.curso.java.maven.aula.dao;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.curso.java.oo.ejercicio01oo.model.Aula;

@Component("miDao")
public class MapDAO implements IDAO {
	
	@Autowired
	@Qualifier("almacenMapaDeAulas")
	private Map<String, Aula> mapaDeAulas;
	
	public Map<String, Aula> getMapaDeAulas() {
		return mapaDeAulas;
	}
	public void setMapaDeAulas(Map<String, Aula> mapaDeAulas) {
		this.mapaDeAulas = mapaDeAulas;
	}
		
	public MapDAO() {
		super();
	}
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

