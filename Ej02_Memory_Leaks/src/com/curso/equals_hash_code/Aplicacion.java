package com.curso.equals_hash_code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aplicacion {

	
	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("=================================================");
		System.out.println("Iniciando test 'equals/hash mal implementados'...");
		Thread.sleep(10_000);	
		System.out.println("Creando productos y calificaciones...");		
		
		//La clave en el HashMap es el cliente
		Map<Producto,List<Integer>> productos = new HashMap<>();
		for(int a=0; a<10_000_000; a++) {
			Producto p = new Producto("Chisme electromec�nico","ACME", "Bla bla bl�");
			//System.out.println(p.hashCode()); //Vemos que el c�digo hash siempre es el mismo
			
			//Supongamos que a este mapa pueden introducirse valores asociados a claves ya existentes
			//Buscamos la lista de calificaciones asociada al producto
			List<Integer> lista = productos.get(p);
			//Si no existe la creamos y a�adimos al nuevo producto y su lista al mapa
			if(lista == null) {
				lista = new ArrayList<Integer>();
				productos.put(p,lista);
			}
			//A�adimos el valor a la lista
			lista.add(7);
			//System.out.println(lista.size()); //Aunque siempre nos estamos refiriendo al mismo producto vemos que el tama�o de la lista no pasa de 1
		}
		
		//10.000.000
		System.out.println(productos.size());

		System.out.println("=================================================");
		Thread.sleep(160_000);
		System.out.println("FIN");		
		
	}
	
	
	
}
