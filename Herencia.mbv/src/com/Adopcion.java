package com;

public class Adopcion {
	private String animal;
	private String genero;
	private int a�os;
	private String nombre; 
	
	public Adopcion() {	
	}

	public Adopcion(String animal, String genero, int a�os, String nombre) {
		this.animal = animal;
		this.genero = genero;
		this.a�os = a�os;
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

	public int getA�os() {
		return a�os;
	}

	public void setA�os(int a�os) {
		this.a�os = a�os;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
}
