package com;

public class Trapecio extends Figuras {
	private double baseMayor;
	private double baseMenor;
	private double height;
	private double ladoAB;
	
	public Trapecio() {
	}

	public Trapecio(double area, double perimetro, double baseMayor, double baseMenor, double height, double ladoAB) {
		super(area, perimetro);
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.height = height;
		this.ladoAB = ladoAB;
	}

	public double getBaseMayor() {
		return baseMayor;
	}

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getLadoAB() {
		return ladoAB;
	}

	public void setLadoAB(double ladoAB) {
		this.ladoAB = ladoAB;
	}

	@Override
	public void area() {
		setArea(getBaseMayor() * getBaseMenor()/2 * getHeight());
	}

	public void perimetro() {
		setPerimetro(getBaseMayor() + getBaseMenor() + getLadoAB()*2);
		
	}
	
	
	
}
