package com;

public class ClaseD extends ClaseA{

	private String color;

	public ClaseD() {
	}

	public ClaseD(String nombre, String apellido, int edad, String color) {
		super(nombre, apellido, edad);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
} //FIN DE LA CLASE
