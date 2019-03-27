package com.curso.java.oo.model;

public class DronConPistola extends Maquina implements PuedeDisparar {

	@Override
	void cargar() {		
	 //syso control espacio para eso:
		System.out.println("Cargando con cargador cutre");
		
	}
//Control 1 en puede disparar le manddas escribir los no implementados
	@Override
	public void dispararSinJuicio(String objetivo) {
	System.out.println("Disparando con el dron a" +objetivo);
		
	}

}
