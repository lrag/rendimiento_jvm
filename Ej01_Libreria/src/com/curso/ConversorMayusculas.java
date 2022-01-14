package com.curso;

public class ConversorMayusculas implements Conversor {

	@Override
	//State of the art
	public String convertir(String entrada) {
		return entrada.toUpperCase();
	}

}

