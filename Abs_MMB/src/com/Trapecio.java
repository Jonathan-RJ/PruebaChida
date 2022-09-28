package com;

public class Trapecio extends Figuras{
	private double altura;
	private double ladoa;
	private double ladob;

	public Trapecio() {
		
	}



	public Trapecio(double area, double perimetro,double altura,
			double ladoa,double ladob) {
		super(area, perimetro);
	this.altura=altura;
	this.ladoa=ladoa;
	this.ladob=ladob;
	}

	

	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getLadoa() {
		return ladoa;
	}



	public void setLadoa(double ladoa) {
		this.ladoa = ladoa;
	}



	public double getLadob() {
		return ladob;
	}



	public void setLadob(double ladob) {
		this.ladob = ladob;
	}



	@Override
	public void area() {
		// TODO Auto-generated method stub
		setArea(((getLadoa()+getLadob())/2)*getAltura());

		
	}

}
