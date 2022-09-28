package com;

public class Trapecio extends Figuras {
	private double baseMayor, baseMenor, altura;
	
	
	
	public Trapecio() {
		
	}
	
	
	
	
	public Trapecio(double area, double perimetro,double baseMayor, double baseMenor, double altura) {
		super(area, perimetro);
		// TODO Auto-generated constructor stub
		
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
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




	public double getAltura() {
		return altura;
	}




	public void setAltura(double altura) {
		this.altura = altura;
	}




	@Override
	public void area() {
		// TODO Auto-generated method stub
		
		setArea((getBaseMenor()+getBaseMayor())*getAltura()/2);
		
	}

	@Override
	public void perimetro() {
		
		setPerimetro(Math.sqrt(((getBaseMayor()-(getBaseMenor()/2))*(getBaseMayor()-getBaseMenor())/2)+(getAltura()*getAltura())));
		// TODO Auto-generated method stub
		
	}

}
