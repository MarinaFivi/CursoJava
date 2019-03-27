import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.curso.java.maven.aula.IDAO;
import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Persona;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

public class Negocio {
	private IDAO miDao;
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
//Mejor pensar en hacer un Mapa de aulas para poder asi borrar con metodos y todo..	
	//Lista de Alumnos por aula (Mapa con clave el nombre del aula y valor lista de alumnos?)
//Ya te dan un aula, no tienes q formar el set, del aula que te pidan sacas los alumnos de ahí a una lista.
	public List<Alumno> listaDeAlumnosPorAula(String nombreDeAula) 
	{
		Aula aula = miDao.getAula(nombreDeAula);
		
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
	public Set<Aula> getAulas() {
		
	}
	
	//Asignar Alumno a Aula
	
	//Eliminar aula
	public void deleteAula(String nombreAula) {
		Aula aula = getAula(nombreAula);
		aula= null;
		
	}

}
