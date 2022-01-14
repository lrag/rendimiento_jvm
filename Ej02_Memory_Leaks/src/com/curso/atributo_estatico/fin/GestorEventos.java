package com.curso.atributo_estatico.fin;

import java.util.ArrayList;
import java.util.List;

public class GestorEventos {

	//Quitamos el static para que la lista de eventos desaparezca con el GestorEventos
	//o proporcionamos un sistema para que siga siendo estatico y los eventos antiguos se eliminen del listado
	public List<String> eventos = new ArrayList<String>();

	public void addEvento(String evento) {
		//Procesar el evento
		//disparar el evento
		//...
		eventos.add(evento);
	}
	
	
}

