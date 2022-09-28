package com;

public class Rectangulo extends Figuras {

	private double largo, ancho;
	
	
	
	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}

	public Rectangulo(double area, double perimetro,double largo, double ancho) {
		super(area, perimetro);
		this.largo=largo;
		this.ancho=ancho;
		// TODO Auto-generated constructor stub
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

	@Override
	public void area() {
		// TODO Auto-generated method stub
		setArea(getLargo()*getAncho());
	}

	@Override
	public void perimetro() {
		// TODO Auto-generated method stub
		setPerimetro(getLargo()*2 + getAncho()*2);
		
	}
	
	

}
