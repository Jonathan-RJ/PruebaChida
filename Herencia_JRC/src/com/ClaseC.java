package com;

public class ClaseC extends ClaseA{
	private String material;

	public ClaseC() {
		
	}

	public ClaseC(String nombre, String apellido, int edad, String material) {
		super(nombre, apellido, edad);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	

}
