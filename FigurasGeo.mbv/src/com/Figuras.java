package com;

public abstract class Figuras {
	//Ejercicio en donde saquemos el area y perimetro de las figuras geometricas
	//cuadrado, triangulo, rectangulo, rombo, trapecio
	//atributos que comparten todas las clases hijas 
	
	private double area;
	private double perimetro;
	
	public Figuras () {
	}

	public Figuras(double area, double perimetro) {
		this.area = area;
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public abstract void area();
	
	public abstract void perimetro();
	

}
