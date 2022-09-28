package com;

public class Dueño extends Adopcion{
	private String nomdueño;
	private String ocupacion;
	private int edad;
	
		public Dueño() {
		}

	public Dueño(String animal, String genero, int años, String nombre) {
		super(animal, genero, años, nombre);
			
		}

	public String getNomdueño() {
		return nomdueño;
	}

	public void setNomdueño(String nomdueño) {
		this.nomdueño = nomdueño;
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
