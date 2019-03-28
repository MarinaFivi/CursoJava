package com.curso.java.maven.aula;

import java.util.List;
import java.util.Set;

import com.curso.java.maven.aula.dao.ListDAO;
import com.curso.java.maven.aula.dao.MapDAO;
import com.curso.java.maven.aula.negocio.Negocio;
import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

public class Lanzador1 {
	
	public static void main(String[] args) {
/*		Alumno alumno1= new Alumno();
		Alumno alumno2= new Alumno();
		Alumno alumno3= new Alumno();
		Profesor profesor1= new Profesor();
		Profesor profesor2= new Profesor();
		PuestoDeTrabajo puesto1 = new PuestoDeTrabajo(true);
		PuestoDeTrabajo puesto2 = new PuestoDeTrabajo(true);
		PuestoDeTrabajo puesto3 = new PuestoDeTrabajo(true);
		PuestoDeTrabajo puesto4 = new PuestoDeTrabajo(false);
		Set<PuestoDeTrabajo> setPuestos = null;
		setPuestos.add(puesto1);
		setPuestos.add(puesto2);
		setPuestos.add(puesto3);
		setPuestos.add(puesto4);
		Aula aula1 = new Aula("Galileo", true, true, setPuestos);
		Aula aula2 = new Aula("Kepler", false, false, setPuestos);
*/		
		Negocio negocio = new Negocio(new MapDAO());
		negocio.createAula("Galilei", true, false, 4); //crea aula
		//List<Alumno> listAlumGalilei = negocio.listaDeAlumnosPorAula("Galilei"); //obtengo alumnos
		//Alumno alumGalilei= listAlumGalilei.get(0);	
		//System.out.println(alumGalilei.isSubvencionado()); //comprobacion veo alumno
		negocio.asignarAlumnoAula("Galilei", new Alumno());
		System.out.println(negocio.listaDeAlumnosPorAula("Galilei"));
		System.out.println(negocio.listaDeProfesPorAula("Galilei"));	//obtengo profes	
		negocio.deleteAula("Galilei");
		System.out.println(negocio.listaDeAlumnosPorAula("Galilei"));
		//System.out.println(profeGalilei.isMalaLeche()); //comprobacion veo profesor
		
	}

}
