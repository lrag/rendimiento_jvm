package com.curso.equals_hash_code;

import java.time.LocalDateTime;

public class Factura {

	private String codigo;
	private LocalDateTime fecha;

	public Factura() {
		super();
	}

	public Factura(String codigo, LocalDateTime fecha) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

}
