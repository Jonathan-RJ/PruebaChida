package com;

public class Principal {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		Triangulo t1 = new Triangulo();
		Rectangulo r1 = new Rectangulo();
		Rombo b1 = new Rombo();
		Trapecio p1 = new Trapecio();
		
		
		c1.setLado(4);
		c1.area();
		c1.perimetro();
		System.out.println("Area del Cudrado " + c1.getArea());
		System.out.println("Perimetro del Cudrado " + c1.getPerimetro());
		
		t1.setAltura(4);
		t1.setBase(4);
		t1.area();
		t1.perimetro();
		System.out.println("Area del Triangulo " + t1.getArea());
		System.out.println("Perimetro del Triangulo " + t1.getPerimetro());
	
		r1.setLargo(4);
		r1.setAncho(4);
		r1.area();
		r1.perimetro();
		System.out.println("Area del Rectangulo " + r1.getArea());
		System.out.println("Perimetro del Rectangulo " + r1.getPerimetro());
	
		b1.setDiagonalMayor(4);
		b1.setDiagonalMenor(8);
		b1.setLadoA(5);
		b1.area();
		b1.perimetro();
		System.out.println("Area del Rombo " + b1.getArea());
		System.out.println("Perimetro del Rombo " + b1.getPerimetro());
		
		p1.setBaseMayor(16);
		p1.setBaseMenor(8);
		p1.setHeight(4.5);
		p1.setLadoAB(5);
		p1.area();
		p1.perimetro();
		System.out.println("Area del Trapecio " + p1.getArea());
		System.out.println("Perimetro del Trapecio " + p1.getPerimetro());
		
		
	}

}
