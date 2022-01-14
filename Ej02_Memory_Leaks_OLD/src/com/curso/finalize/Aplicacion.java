package com.curso.finalize;

public class Aplicacion {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("=======================================");
		System.out.println("Iniciando test 'finalize'...");
		Thread.sleep(10_000);	
		System.out.println("Creando objetos...");			
		
		while(true) {
			ClaseConFinalize ccf = new ClaseConFinalize();
		}
		
		/*
		System.out.println("=======================================");
		Thread.sleep(160_000);
		System.out.println("FIN");
		*/
		
	}	
	
}

