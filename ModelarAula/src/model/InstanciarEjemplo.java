//package com.curso.java.oo.ejercicio01oo;

package model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//import package model;

public class InstanciarEjemplo {
	
	public static void main(String[] args) {
	
	//Aula aula1 = new Aula("true", "true",  , "kepler");
	/*Puesto puesto1= new Puesto();
	Alumno alumno1 = new Alumno();
	Posicion posicion1= new Posicion();
	posicion1.setColumna(1);
	posicion1.setFila(1);
	puesto1.setOrdenador(true);
	alumno1.setApellidos("Aguirre");
	alumno1.setNombre("Marina");
	puesto1.setAlumno(alumno1);
	aula1.setArea(23.5);
	aula1.setPizarra(true);
	aula1.setProyector(true);
	//aula1.setPuestoProfesor(new Puesto(true));
	aula1.setPuestos(puesto1, posicion1);
	*/
//Profe, copio mas o menos aunq no compilara para tener la idea.
	

	Aula aula1= new Aula ("Kepler", true, true, new HashSet<Puesto>);
	aula1.setPuestoProfesor(new Puesto(true));
	for (int=0; i<14; i++) {
		aula1.getPuestos().add(new Puesto(true));
	}
	aula1.getPuestos().add(new PuestoDeTrabajo(false));
	System.out.println("algo");
	aula1.setPuestos(aula1.getPuestos());
	aula1.getPuestoProfesor().setPersona(new Profesor);	
	Set<Puesto> puestos= aula1.getPuestoAlumno();
	Iterator<Puesto> iterator= puestos.iterator();
	int numerodeAlumnos=12;
	while (iterador.hasNext() && numeroDeAlumnos >0) {
		Puesto puestoactual =iterator.next();
		if (puestoactual.isOrdenador()) {
			puestoactual.setPersona(new Alumno);
			numerodeAlumnos--;
		}
	}
	//aula1.getPuestoAlumno().forEach(puesto);	//NO valdria, meto todos los alm en cada puesto.
	aula1.getPuestoAlumno().stream().filter(predicate);
	}
}
