package com.curso.java.maven.aula;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.java.maven.aula.negocio.Negocio;
import com.curso.java.oo.ejercicio01oo.model.Alumno;

public class Lanzador1 {
	
	public static ApplicationContext context;
	
	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	public static void main(String[] args) {
		Alumno alumno1= new Alumno();
		alumno1.setNombre("Marina");
/*		Alumno alumno2= new Alumno();
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
		Negocio negocio = context.getBean(Negocio.class);
		negocio.createAula("Galilei", true, false, 4,context); //crea aula
		//List<Alumno> listAlumGalilei = negocio.listaDeAlumnosPorAula("Galilei"); //obtengo alumnos
		//Alumno alumGalilei= listAlumGalilei.get(0);	
		//System.out.println(alumGalilei.isSubvencionado()); //comprobacion veo alumno
		negocio.asignarAlumnoAula("Galilei", alumno1);
		System.out.println(negocio.listaDeAlumnosPorAula("Galilei"));
		//System.out.println(negocio.listaDeProfesPorAula("Galilei"));	//obtengo profes	
		negocio.deleteAula("Galilei");
		System.out.println(negocio.listaDeAlumnosPorAula("Galilei"));
		//System.out.println(profeGalilei.isMalaLeche()); //comprobacion veo profesor
		
	}

}
