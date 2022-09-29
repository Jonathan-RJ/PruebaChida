package com;

public class Triangulo extends Figuras{
	private double base;
	private double altura;
	
	public Triangulo() {
	
	}

	public Triangulo(double area, double perimetro,double base , double altura) {
		super(area, perimetro);
		this.base = base;
		this.altura = altura;		
		// TODO Auto-generated constructor stub
	}
	


	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		setArea((getAltura()*getBase())/2);
	}

	


}

