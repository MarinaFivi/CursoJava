import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Aula {
	//public List<Alumno> listaAlumnos;
	private Boolean proyector;
	private Boolean pizarra;
	private double area;
	private Puesto puestoProfesor;
	private Set<Puesto> puestoAlumno;
	private HashMap<Posicion, Puesto> puestos;
	private String nombre;
	
	public Aula( String nombre, Boolean proyector, Boolean pizarra, Set<Puesto> puestoAlumno) {
		super();
		this.proyector = proyector;
		this.pizarra = pizarra;
		this.puestoAlumno = puestoAlumno;
		this.nombre = nombre;
		this.puestoAlumno = new HashSet<Puesto>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getProyector() {
		return proyector;
	}
	public void setProyector(Boolean proyector) {
		this.proyector = proyector;
	}
	public Boolean getPizarra() {
		return pizarra;
	}
	public void setPizarra(Boolean pizarra) {
		this.pizarra = pizarra;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Puesto getPuestoProfesor() {
		return puestoProfesor;
	}
	public void setPuestoProfesor(Puesto puestoProfesor) {
		this.puestoProfesor = puestoProfesor;
	}
	public HashMap<Posicion, Puesto> getPuestos() {
		return puestos;
	}
	public void setPuestos(HashMap<Posicion, Puesto> puestos) {
		this.puestos = puestos;
	}
	
	
}
