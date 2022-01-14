package com.curso;

public class ConversorMinusculas implements Conversor {

	@Override
	//State of the art
	public String convertir(String entrada) {
		return entrada.toLowerCase();
	}

}

