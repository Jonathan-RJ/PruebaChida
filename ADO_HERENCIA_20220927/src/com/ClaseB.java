package com;

public class ClaseB extends ClaseA {
	
	private int numSerie;
	
	public ClaseB() {
		
	}

	public ClaseB(String nombre, String apellido, int edad, int numSerie) {
		super(nombre, apellido, edad); 
		//la utilidad del super es no volver a crear la referencia a los atributos y métodos 
		this.numSerie = numSerie;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	
	
	
	
	
	
} //FIN DE LA CLASE
