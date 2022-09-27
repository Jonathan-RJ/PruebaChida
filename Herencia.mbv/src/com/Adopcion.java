package com;

public class Adopcion {
	private String animal;
	private String genero;
	private int años;
	private String nombre; 
	
	public Adopcion() {	
	}

	public Adopcion(String animal, String genero, int años, String nombre) {
		this.animal = animal;
		this.genero = genero;
		this.años = años;
		this.nombre = nombre;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
}
