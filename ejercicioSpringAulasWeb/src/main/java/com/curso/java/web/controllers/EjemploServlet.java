package com.curso.java.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.curso.java.maven.aula.negocio.Negocio;
import com.curso.java.oo.ejercicio01oo.model.Alumno;

/**
 * Servlet implementation class EjemploServlet
 */
@WebServlet({ "/patatas", "/limones" })
public class EjemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext context;
	
	
	
	@Override
	public void init() throws ServletException {
		
		ApplicationContext applicationContext = WebApplicationContextUtils
			.getRequiredWebApplicationContext(getServletContext());
		this.context = applicationContext;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EjemploServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Alumno alumno1= new Alumno();
		Alumno alumno2= new Alumno();
		alumno1.setNombre("Marina");
		alumno2.setNombre("Rubén");
		Negocio negocio = context.getBean(Negocio.class);
		negocio.createAula("Galilei", true, false, 4,context); //crea aula
		negocio.asignarAlumnoAula("Galilei", alumno1);
		negocio.asignarAlumnoAula("Galilei", alumno2);
		//System.out.println(negocio.listaDeAlumnosPorAula("Galilei"));
		
		
		List<Alumno> listaAlumno = negocio.listaDeAlumnosPorAula("Galilei");
		System.out.println("Antes de borrar : "+negocio.listaDeAlumnosPorAula("Galilei"));
		// Alumno@34d62b
		for (int i=0; i<listaAlumno.size() ;i++) {
			request.setAttribute("alumno"+i,listaAlumno.get(i));// k:v
		}
		negocio.deleteAula("Galilei");
		System.out.println("Después de borrar : "+negocio.listaDeAlumnosPorAula("Galilei"));
/*		request.setAttribute("mensajeSingleton", context.getBean("mensajeSingleton"));
		request.setAttribute("mensajePrototype", context.getBean("mensajePrototype"));
		request.setAttribute("mensajeRequest", context.getBean("mensajeRequest"));
		request.setAttribute("mensajeSession", context.getBean("mensajeSession"));*/
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/saludar.jsp").forward(request, response);
	}

}
