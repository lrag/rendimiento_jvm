package com.curso.clases_internas;

import java.util.Comparator;

public class Ejemplo {

	//new String("")
	private String texto = 
		new String("Lorem fistrum papaar papaar te voy a borrar el cerito est� la cosa muy malar condemor se calle ust�e condemor est� la cosa muy malar me cago en tus muelas amatomaa me cago en tus muelas. Ese que llega papaar papaar de la pradera te va a has� pupitaa diodenoo mamaar jarl. Condemor va ust� muy cargadoo diodenoo se calle ust�e. Papaar papaar ahorarr por la gloria de mi madre condemor por la gloria de mi madre tiene musho peligro no te digo trigo por no llamarte Rodrigor amatomaa est� la cosa muy malar. Mamaar ahorarr ese que llega fistro a gramenawer de la pradera de la pradera. Al ataquerl la caidita papaar papaar fistro diodeno a wan de la pradera condemor a gramenawer tiene musho peligro caballo blanco caballo negroorl. Ese hombree apetecan ese que llega no puedor pecador. De la pradera quietooor me cago en tus muelas tiene musho peligro apetecan. Jarl hasta luego Lucas sexuarl no te digo trigo por no llamarte Rodrigor de la pradera sexuarl ahorarr ese pedazo de hasta luego Lucas."+
		"Va ust� muy cargadoo diodeno benemeritaar no te digo trigo por no llamarte Rodrigor est� la cosa muy malar papaar papaar hasta luego Lucas no te digo trigo por no llamarte Rodrigor no puedor me cago en tus muelas ese que llega. Al ataquerl jarl torpedo a gramenawer condemor diodeno condemor torpedo llevame al sircoo ese hombree. No te digo trigo por no llamarte Rodrigor torpedo diodenoo mamaar pecador diodenoo. No te digo trigo por no llamarte Rodrigor diodeno caballo blanco caballo negroorl jarl se calle ust�e ese hombree. A wan diodeno me cago en tus muelas ahorarr."+
		"Diodeno al ataquerl quietooor caballo blanco caballo negroorl. Jarl no puedor te va a has� pupitaa papaar papaar mamaar de la pradera quietooor tiene musho peligro al ataquerl al ataquerl caballo blanco caballo negroorl. Va ust� muy cargadoo llevame al sircoo va ust� muy cargadoo benemeritaar. Mamaar diodeno diodeno qu� dise usteer diodeno benemeritaar mamaar de la pradera no te digo trigo por no llamarte Rodrigor. Te va a has� pupitaa fistro de la pradera apetecan ese que llega se calle ust�e a wan hasta luego Lucas ese hombree de la pradera qu� dise usteer. Ese hombree diodenoo no puedor apetecan ese hombree no te digo trigo por no llamarte Rodrigor caballo blanco caballo negroorl me cago en tus muelas. Apetecan te va a has� pupitaa por la gloria de mi madre torpedo apetecan te voy a borrar el cerito papaar papaar mamaar se calle ust�e tiene musho peligro. Papaar papaar jarl mamaar apetecan sexuarl est� la cosa muy malar ese pedazo de. A wan pupita me cago en tus muelas ese hombree apetecan pupita me cago en tus muelas ahorarr te va a has� pupitaa pecador condemor."+
		"Apetecan pecador mamaar a gramenawer amatomaa. Te va a has� pupitaa la caidita la caidita tiene musho peligro. Amatomaa benemeritaar va ust� muy cargadoo ahorarr a wan de la pradera ese pedazo de apetecan te voy a borrar el cerito. Quietooor condemor sexuarl benemeritaar papaar papaar. A peich a wan por la gloria de mi madre me cago en tus muelas torpedo llevame al sircoo torpedo ahorarr fistro apetecan diodeno."+
		"Pupita qu� dise usteer me cago en tus muelas de la pradera caballo blanco caballo negroorl pecador qu� dise usteer jarl. Fistro apetecan est� la cosa muy malar al ataquerl te voy a borrar el cerito condemor amatomaa hasta luego Lucas a wan caballo blanco caballo negroorl. Ese que llega a wan te voy a borrar el cerito me cago en tus muelas qu� dise usteer te va a has� pupitaa no te digo trigo por no llamarte Rodrigor caballo blanco caballo negroorl tiene musho peligro tiene musho peligro caballo blanco caballo negroorl. Ese que llega ese que llega ese que llega pupita a peich. Benemeritaar qu� dise usteer la caidita a peich a wan llevame al sircoo te va a has� pupitaa ahorarr va ust� muy cargadoo pecador quietooor."+
		"Hasta luego Lucas apetecan la caidita diodenoo benemeritaar va ust� muy cargadoo caballo blanco caballo negroorl condemor diodenoo. Ese pedazo de apetecan ese pedazo de quietooor. A gramenawer fistro va ust� muy cargadoo la caidita se calle ust�e pecador al ataquerl. Te voy a borrar el cerito por la gloria de mi madre amatomaa est� la cosa muy malar pecador de la pradera mamaar. La caidita llevame al sircoo benemeritaar sexuarl a wan a peich te va a has� pupitaa a peich me cago en tus muelas jarl torpedo. Te voy a borrar el cerito te voy a borrar el cerito est� la cosa muy malar ahorarr qu� dise usteer papaar papaar. Torpedo por la gloria de mi madre la caidita tiene musho peligro. Caballo blanco caballo negroorl diodenoo llevame al sircoo se calle ust�e te va a has� pupitaa la caidita caballo blanco caballo negroorl no puedor tiene musho peligro est� la cosa muy malar. Va ust� muy cargadoo te voy a borrar el cerito te va a has� pupitaa ese que llega ese hombree tiene musho peligro no puedor caballo blanco caballo negroorl quietooor.");
	private int dato = 0;
	
	//static?
	public Comparator<Integer> crearComparador(Integer valorCorrector) {
		
		/*
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
		 */
		
		
		//Con las expresiones lambda pasa lo mismo aunque hay una diferencia
		return (i1, i2) -> {
			//�Y si no se utiliza ning�n componente de la clase nido?
			return i1 - i2 - valorCorrector;			
		};
		
		
	}
	
}







