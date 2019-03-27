package com.curso.java.oo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class EjemploMap {
	public static void main(String[] args) {
		HashMap<Integer, String> miMap= new HashMap<Integer, String>();
		miMap.isEmpty();
		miMap.size();
		//[primero]
		miMap.put(1, "primero");
		//[primero, segundo]
		miMap.put(2, "segundo");
		Iterator<Integer> miIteradorDeCadenas = miMap.keySet().iterator();
		miIteradorDeCadenas.hasNext();//si hay siguiente elemento
		Integer CadenaActual = miIteradorDeCadenas.next();//devuelve el siguiente elemento
		System.out.println("Devuelve" +CadenaActual);
		
		Iterator<Integer> miNuevoIterador = miMap.keySet().iterator();
		while(miNuevoIterador.hasNext()) {
			Integer clave= miNuevoIterador.next();
			String valor =miMap.get(clave);
			System.out.println("k:" +clave +" V:" +valor);
		}
		//for elemento in lista funciona en iterables
		for(Integer elemento : miMap.keySet()) {
			System.out.println(elemento);
		}
		//este no funciona con set pq solo funciona con estructuras ordenadas
		//for (int i=0; i<miSet.size(); i++) {
		//	miSet.get(i);
		//}
		
		// java 8 vale esto lista.forEach( (miCadenaActual)-> (System.out.println(miCadenaActual);));
		//[Otra cosa, segundo]
		miMap.put(1, "Otra cosa");
		//[Otra cosa, primero, segundo]
		miMap.put(2, "Segundo");
		miMap.remove(2);
		boolean contains = miMap.containsKey(1);
		boolean contains2 = miMap.containsValue("Otra cosa");
		//int indexOf = miSet.indexOf("primero");
		String string = miMap.get(1);
		
		//Pisa el contenido de clave 1 todas las veces
		miMap.put(1, "manolo");
		miMap.put(1, "manolo");
		miMap.put(1, "manolo");
		
	
	}
	
	
	

}
