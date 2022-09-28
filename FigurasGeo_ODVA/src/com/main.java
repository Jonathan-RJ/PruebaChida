package com;


//Ejerciio en dodne squemos el area y el perimetro de las figuras geometricas

//CUADRADO
//TRIANGULO
//RECTANGULO
//ROMBO
//TRAPECIO
public class main {
	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		Cuadrado c1= new Cuadrado();
		Rectangulo r1 =new Rectangulo();
		Rombo rombo1 = new Rombo();
		Trapecio trap1 = new Trapecio();
		
		c1.setLado(5);
		c1.area();
		c1.perimetro();
		System.out.println("El area del cuadrado es " + c1.getArea());
		System.out.println("El perimetro del cuadrado es " + c1.getPerimetro());
		t1.setAltura(3);
		t1.setBase(4);
		t1.area();
		t1.perimetro();
		System.out.println("El area del triangulo es " + t1.getArea());
		System.out.println("El perimetro del triangulo es "+ t1.getPerimetro());
		r1.setLargo(3);
		r1.setAncho(4);
		r1.area();
		r1.perimetro();
		System.out.println("El area del rectangulo es " + r1.getArea());
		System.out.println("El perimetro del Rectanguloes "+ r1.getPerimetro());
		rombo1.setD(3);
		rombo1.setd(4);
		rombo1.area();
		rombo1.perimetro();
		System.out.println("El area del rombo es " + r1.getArea());
		System.out.println("El perimetro del Rombo "+ r1.getPerimetro());
		trap1.setBaseMayor(7);
		trap1.setBaseMenor(4);
		trap1.setAltura(3.5);
		trap1.area();
		trap1.perimetro();
		System.out.println("El area del Trapecio es " + trap1.getArea());
		System.out.println("El perimetro del Trapecio es  "+ trap1.getPerimetro());
		
		
	}

}
