package com.curso.java.oo;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploLista {
	public static void main(String[] args) {
		ArrayList<String> lista= new ArrayList<String>();
		lista.isEmpty();
		lista.size();
		lista.add("primero");
		//[primero, segundo]
		lista.add("segundo");
		Iterator<String> miIteradorDeCadenas = lista.iterator();
		miIteradorDeCadenas.hasNext();//si hay siguiente elemento
		String CadenaActual = miIteradorDeCadenas.next();//devuelve el siguiente elemento
		System.out.println("Devuelve" +CadenaActual);
		
		Iterator<String> miNuevoIterador = lista.iterator();
		while(miNuevoIterador.hasNext()) {
			String elementoActual = miNuevoIterador.next();
		}
		//for elemento in lista funciona en iterables
		for(String elemento : lista) {
			System.out.println(elemento);
		}
		for (int i=0; i<lista.size(); i++) {
			lista.get(i);
		}
		
		// java 8 vale esto lista.forEach( (miCadenaActual)-> (System.out.println(miCadenaActual);));
		//[Otra cosa, segundo]
		lista.set(0, "Otra cosa");
		//[Otra cosa, primero, segundo]
		lista.add(1, "primero");
		lista.remove(2);
		boolean contains = lista.contains("Otra cosa");
		int indexOf = lista.indexOf("primero");
		String string = lista.get(1);
		
	}
	
	
	

}
