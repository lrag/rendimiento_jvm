package com.curso.atributo_estatico;

import java.util.ArrayList;
import java.util.List;

public class GestorEventos {

	//¿Y si quitamos este static?
	public /*static*/ List<String> eventos = new ArrayList<String>();

	public void addEvento(String evento) {
		//Procesar el evento
		//disparar el evento
		//...
		eventos.add(evento);
	}	
	
}

