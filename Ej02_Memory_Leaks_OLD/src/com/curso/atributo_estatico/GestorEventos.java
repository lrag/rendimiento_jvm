package com.curso.atributo_estatico;

import java.util.ArrayList;
import java.util.List;

public class GestorEventos {

	//¿Y si quitamos este static?
	public static List<String> eventos = new ArrayList<String>();

	public void emitirEvento(String evento) {
		//Procesar el evento
		//entregarselo a quienes se hayan subscrito/suscrito/apuntao
		//...
		eventos.add(evento);
	}	
	
}

