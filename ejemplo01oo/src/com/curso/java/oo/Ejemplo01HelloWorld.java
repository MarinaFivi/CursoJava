package com.curso.java.oo;
import java.util.ArrayList;
import java.util.HashMap;
//CTRL MAYUSC O Organiza los imports
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.curso.java.oo.model.Persona;
import com.curso.java.oo.model.Policia;
import com.curso.java.oo.model.PoliciaDeLasPorras;
import com.curso.java.oo.model.PoliciaPistolero;

public class Ejemplo01HelloWorld {
	
	
	public static void main(String[] args) {
		String miCadena ="Hola Mundo";
		System.out.println(miCadena);
		Persona.algoExplicito = "algo";
		Persona persona = new Persona();
		Persona persona2 = new Persona();
		persona.setNombre("Rubencillo");
		persona.algoExplicito ="Es de rubencillo";
		persona2.setNombre("Otro nombre");
		
		Persona persona3= new PoliciaDeLasPorras();
		PoliciaDeLasPorras poliPorrero = (PoliciaDeLasPorras) persona3;
		Policia policia= new Policia();
		
		//Set SetDePolicias= new HashSet<E>();
		Set<Policia> setDePolicias =  new HashSet<Policia>();
		setDePolicias.add(poliPorrero);
		setDePolicias.add((Policia)persona3);
		setDePolicias.add(new PoliciaPistolero());
		System.out.println(setDePolicias.size());
		List<Policia> lista= new ArrayList<Policia>();
		lista.add(poliPorrero);
		lista.add((Policia)persona3);
		lista.add(new PoliciaPistolero());
		System.out.println(lista.size());
		Map<String, Persona> mapa = new HashMap <String, Persona> ();
		mapa.put("ROJO", policia);
		mapa.put("VERDE", poliPorrero);
		mapa.put("ROJO", poliPorrero);
		mapa.get("ROJO");
		
	} 
}
