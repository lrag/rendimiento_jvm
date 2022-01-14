package com.curso.equals_hash_code;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aplicacion {

	
	public static void main(String[] args) throws InterruptedException {

		
		System.out.println("=====================================================");
		System.out.println("Iniciando test 'equals/hashCode mal implementados'...");
		Thread.sleep(10_000);	
		System.out.println("Creando clientes...");		
		
		GestorFacturas gf = new GestorFacturas();
		for(int a=1; a<10_000_001; a++) {
			Cliente c1 = new Cliente("Bartholomew Jo-Jo Simpson","C/Evergreen Terrace", "555 123 456");
			Factura f1 = new Factura("FAC-"+a, LocalDateTime.now());
			gf.addFactura(c1, f1);

			Cliente c2 = new Cliente("Lisa Simpson","C/Evergreen Terrace", "555 123 456");
			Factura f2 = new Factura("FAC-"+(a*2), LocalDateTime.now());
			gf.addFactura(c1, f1);
		}
		
		System.out.println(gf.getNumeroClientes());
		
		System.out.println("=======================================");
		Thread.sleep(160_000);
		System.out.println("FIN");		
		
	}	
	
}


class GestorFacturas {
	
	private Map<Cliente, List<Factura>> facturasClientes = new HashMap<>();
	
	public void addFactura(Cliente cliente, Factura factura) {
		List<Factura> facturas = facturasClientes.get(cliente);
		if(facturas == null){
			facturas = new ArrayList<>();
			facturas.add(factura);			
			facturasClientes.put(cliente, facturas);
		} 
		facturas.add(factura);	
	}
	
	public int getNumeroClientes() {
		return facturasClientes.size();
	}
	
}


