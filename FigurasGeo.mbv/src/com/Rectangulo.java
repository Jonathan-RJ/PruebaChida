package com;

public class Rectangulo extends Figuras{

	private double largo;
	private double ancho;
	
	public Rectangulo() {
	}
	
	public Rectangulo(double area, double perimetro, double largo, double ancho) {
		super(area, perimetro);
		this.largo = largo;
		this.ancho = ancho;
	}
	
	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public void area() {
		setArea(getLargo() * getAncho());
		
	}

	public void perimetro() {
		setPerimetro(getLargo()*2 + getAncho()*2 );
		
	}

}
