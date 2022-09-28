package com;

public class Triangulo extends Figuras{
	
	private double base, altura;
	
	public Triangulo() {
		
	}
	
	

	public Triangulo(double area, double perimetro,double base, double altura) {
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

	@Override
	public void perimetro() {
		// TODO Auto-generated method stub
		setPerimetro((getBase())+(Math.sqrt((getAltura()*getAltura())+(getBase()/2)*((getBase()/2)))+Math.sqrt((getAltura()*getAltura())+(getBase()/2)*((getBase()/2)))));
	}

}
