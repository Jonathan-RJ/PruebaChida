package com;

public class ClaseB extends ClaseA{
	private double precio;

	public ClaseB() {
		
	}

	public ClaseB(String tampelota, String color, String tipopelota, double precio) {
		super(tampelota, color, tipopelota);
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
	
}
