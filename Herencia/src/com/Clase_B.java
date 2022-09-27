package com;

//esto es HERENCIA 

public class Clase_B extends Clase_A{
	private int numSerie;
	
	public Clase_B() {
	}

	public Clase_B(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad); // la utilidad de no tener que volver a crear la preferencia a los atributos
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	
		
	
	
	
	
	
	
	
	

}
