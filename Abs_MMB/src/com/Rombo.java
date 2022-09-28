package com;

public class Rombo extends Figuras{
	private double DiagonalMayor;
	private double Diagonalmenor;
	
	
	public Rombo() {
		
	}
	
	public Rombo(double area, double perimetro,double DiagonalMayor,double Diagonalmenor) {
		super(area, perimetro);
		this.DiagonalMayor  = DiagonalMayor;
		this.Diagonalmenor = Diagonalmenor;
	}



	public double getDiagonalMayor() {
		return DiagonalMayor;
	}

	public void setDiagonalMayor(double diagonalMayor) {
		DiagonalMayor = diagonalMayor;
	}

	public double getDiagonalmenor() {
		return Diagonalmenor;
	}

	public void setDiagonalmenor(double diagonalmenor) {
		Diagonalmenor = diagonalmenor;
	}

	@Override
	public void area() {
		setArea(((getDiagonalMayor() * getDiagonalmenor())/2));
		
	}

}
