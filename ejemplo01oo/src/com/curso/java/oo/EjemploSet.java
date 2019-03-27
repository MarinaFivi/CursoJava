package com.curso.java.oo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class EjemploSet {
	public static void main(String[] args) {
		HashSet<String> miSet= new HashSet<String>();
		miSet.isEmpty();
		miSet.size();
		miSet.add("primero");
		//[primero, segundo]
		miSet.add("segundo");
		Iterator<String> miIteradorDeCadenas = miSet.iterator();
		miIteradorDeCadenas.hasNext();//si hay siguiente elemento
		String CadenaActual = miIteradorDeCadenas.next();//devuelve el siguiente elemento
		System.out.println("Devuelve" +CadenaActual);
		
		Iterator<String> miNuevoIterador = miSet.iterator();
		while(miNuevoIterador.hasNext()) {
			String elementoActual = miNuevoIterador.next();
		}
		//for elemento in lista funciona en iterables
		for(String elemento : miSet) {
			System.out.println(elemento);
		}
		//este no funciona con set pq solo funciona con estructuras ordenadas
		//for (int i=0; i<miSet.size(); i++) {
		//	miSet.get(i);
		//}
		
		// java 8 vale esto lista.forEach( (miCadenaActual)-> (System.out.println(miCadenaActual);));
		//[Otra cosa, segundo]
		//miSet.set(0, "Otra cosa");
		//[Otra cosa, primero, segundo]
		//miSet.add(1, "primero");
		miSet.remove(2);
		boolean contains = miSet.contains("Otra cosa");
		//int indexOf = miSet.indexOf("primero");
		//String string = miSet.get(1);
		
		//Solo lo inserta una vez! no permite cadenas iguales.
		miSet.add("manolo");
		miSet.add("manolo");
		miSet.add("manolo");
	}
	
	
	

}
