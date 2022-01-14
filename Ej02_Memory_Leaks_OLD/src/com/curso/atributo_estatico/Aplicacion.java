package com.curso.atributo_estatico;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("=======================================");
		System.out.println("Iniciando test 'static'...");
		Thread.sleep(15_000);
		System.out.println("Creando eventos...");
		
		GestorEventos ge = new GestorEventos();
		for(int a=0; a<10_000_000; a++) {
			ge.emitirEvento(Long.toString(Math.round(Math.random()*10_000)));
		}
		
		System.out.println("=======================================");

		ge = null; //gc es elegible por el recolector de basuras
		
		Thread.sleep(5_000);
		
		System.gc(); // :D
		
		Thread.sleep(160_000);
		
		System.out.println("FIN");
	}
	
}
