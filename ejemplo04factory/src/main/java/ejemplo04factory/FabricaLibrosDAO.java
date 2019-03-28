/*package ejemplo04factory;

import com.curso.java.ejemplo03dao.ejemplo03dao.ILibroDAO;

public class FabricaLibrosDAO {
	
	public static ILibroDAO getLibroDaoInstance (String  nombreImplementacion) {
	
	if (nombreImplementacion == "LibroListaDAO") {
		String nombreDeInstancia= getNombreDeInstanciaDeFichero();
		return (ILibroDAO)
				Class
					.forName("com.curso.java.ejemplo03dao." +"ejemplo03dao.LibroMemoryDao")
					.newInstance();
	} else {
		return new LibroBBDDDao();
	}
}

}
*/