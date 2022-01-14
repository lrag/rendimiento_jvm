package com.curso.finalize;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ClaseConFinalize {

	private List<Integer> lista = new ArrayList<>(10_000);

	private Connection cx; 
	

	//public native void movida();
	//public native void liberarMemoria();
	

	@Override
	public void finalize() {
		System.out.println("Adios mundo cruel");
		//liberarMemoria();
	}	

		
}
