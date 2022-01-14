package com.curso.clases_internas.fin;

import java.util.Comparator;

public class GeneradorComparadores {

	//Con hacer est�tico el m�todo que crea la instancia de la clase interna an�nima
	//evitamos la referencia que esta tendr� al objeto que la ha creado
	public static Comparator<Integer> crearComparador(Integer valorCorrector) {
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Comparator<Integer> c = new Comparator() {
			@Override
			public int compare(Object v1, Object v2) {
				Integer i1 = (Integer) v1;
				Integer i2 = (Integer) v2;
				return i1 - i2 - valorCorrector;
			}
		};
		
		return c;
		
		/*
		//Con las expresiones lambda pasa lo mismo aunque hay una diferencia
		return (i1, i2) -> {
			//�Y si no se utiliza ning�n componente de la clase nido?
			return i1 - i2 - valorCorrector;			
		};
		*/
		
	}
	
}
