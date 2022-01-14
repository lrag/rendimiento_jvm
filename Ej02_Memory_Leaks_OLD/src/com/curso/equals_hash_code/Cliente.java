package com.curso.equals_hash_code;

import java.util.Objects;

public class Cliente {

	private String nombre;
	private String direccion;
	private String telefono;

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(nombre,direccion,telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cliente)) {
			return false;
		}
		
		Cliente otroCliente = (Cliente) obj;
		return nombre.equals(otroCliente.nombre) 
			   && direccion.equals(otroCliente.direccion)
			   && telefono.equals(otroCliente.telefono);
	}
	
	
}
