package com;

//Aqui estoy haciendo herencia y la clase padre es la A, para ello uso extends y el nombre de la clase 
//a la que deseo heredar o que me pase tanto sus atributos como sus metodos
//Nota no olvidar la parte del super
public class ClaseB extends ClaseA{
	private int numSerie;

	public ClaseB() {
		
	}

	public ClaseB(String nombre, String apellido, int edad, int numSerie) {
		super(nombre, apellido, edad); //La utilidad del super es no tener que volver a crear la referencia a los atributos y metodos
		this.numSerie = numSerie;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	
	

}
