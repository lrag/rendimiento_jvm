package com.curso.clases_internas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Aplicacion {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("=======================================");
		System.out.println("Iniciando test 'clases internas anónimas'...");
		Thread.sleep(10_000);	
		System.out.println("Creando objetos...");			
		
		List<Comparator> lista = new ArrayList<>();
		for(int a=0; a<10_000_000; a++) {
			Ejemplo e = new Ejemplo();
			Comparator c = e.crearComparador(100);
			lista.add(c);
		}	
		
		System.out.println("=======================================");
		Thread.sleep(160_000);
		System.out.println("FIN");	
	}
	
}
