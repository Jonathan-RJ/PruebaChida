package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1=new Cuadrado();
		Triangulo t1=new Triangulo();
		Rombo r1=new Rombo();
		Trapecio t2=new Trapecio();
		Rectangulo r2=new Rectangulo();
	
		
		c1.setLado(4);
		c1.area();
		System.out.println(c1.getArea());
		
		t1.setAltura(5);
		t1.setBase(2);
		t1.area();
		System.out.println(t1.getArea());
		
		r1.setDiagonalMayor(5);
		r1.setDiagonalmenor(5);
		r1.area();
		System.out.println(r1.getArea());
		
		t2.setAltura(10);
		t2.setLadoa(4);
		t2.setLadob(4);
		t2.area();
		System.out.println(t2.getArea());
		
		
		r2.setBase(3);
		r2.setAltura(5);
		r2.area();
		System.out.println(r2.getArea());
	
	
	}

}
