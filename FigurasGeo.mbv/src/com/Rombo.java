package com;

public class Rombo extends Figuras {
	private double diagonalMayor;
	private double diagonalMenor;
	private double ladoA;

public Rombo() {
}

public Rombo(double area, double perimetro, double diagonalMayor, double diagonalMenor, double ladoA) {
	super(area, perimetro);
	this.diagonalMayor = diagonalMayor;
	this.diagonalMenor = diagonalMenor;
	this.ladoA = ladoA;
	
}

public double getDiagonalMayor() {
	return diagonalMayor;
}

public void setDiagonalMayor(double diagonalMayor) {
	this.diagonalMayor = diagonalMayor;
}

public double getDiagonalMenor() {
	return diagonalMenor;
}

public void setDiagonalMenor(double diagonalMenor) {
	this.diagonalMenor = diagonalMenor;
}

public double getLadoA() {
	return ladoA;
}

public void setLadoA(double ladoA) {
	this.ladoA = ladoA;
}

public void area() {
	setArea(getDiagonalMayor() * getDiagonalMenor()/2);
	
}

public void perimetro() {
	setPerimetro(getLadoA()*4);
	
}




}
