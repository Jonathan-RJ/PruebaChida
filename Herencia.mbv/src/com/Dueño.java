package com;

public class Due�o extends Adopcion{
	private String nomdue�o;
	private String ocupacion;
	private int edad;
	
		public Due�o() {
		}

	public Due�o(String animal, String genero, int a�os, String nombre) {
		super(animal, genero, a�os, nombre);
			
		}

	public String getNomdue�o() {
		return nomdue�o;
	}

	public void setNomdue�o(String nomdue�o) {
		this.nomdue�o = nomdue�o;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
