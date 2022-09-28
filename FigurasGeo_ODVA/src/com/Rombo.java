package com;

public class Rombo extends Figuras{
	
	private double D,d;
	
	public Rombo(){
		
	}
	

	public Rombo(double area, double perimetro, double D, double d) {
		super(area, perimetro);
		this.d = d;
		this.D = D;
		// TODO Auto-generated constructor stub
	}
	

	public double getD() {
		return D;
	}


	public void setD(double D) {
		this.D = D;
	}


	public double getd() {
		return d;
	}


	public void setd(double d) {
		this.d = d;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		setArea((getD()*getd())/2);
	}

	@Override
	public void perimetro() {
		// TODO Auto-generated method stub
		setPerimetro((Math.sqrt((getD()/2)*(getD()/2)+((getd()/2)*(getd()/2))))*4);
	}

}
