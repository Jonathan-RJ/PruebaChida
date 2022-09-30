package com;

public class Prismas implements cubo, PrismaRectangular, Cilindro, Cono{

	

	@Override
	public void areaCubo(double x1) {
		double resultado = Math.pow(x1*6,2);
		System.out.println("Area: " + resultado);
		
	}

	@Override
	public void perimetroCubo(double x1) {
		double resultado = x1 * 12;
		System.out.println("Perimetro: " + resultado);
	}

	@Override
	public void volumenCubo(double x1) {
		double resultado = Math.pow(x1, 3);
		System.out.println("Volumen: " + resultado);
			
	}

	public void areaPrisma(double x1, double x2, double x3) {
		double resultado = 2*(x1*x2 + x2*x3 + x1*x3);
		System.out.println("Area: " + resultado);
		
	}

	public void perimetroPrisma(double x1, double x2, double x3) {
		
		
	}

	@Override
	public void volumenPrisma(double x1, double x2, double x3) {
		double resultado = x1 * x2 * x3;
		System.out.println("Volumen: " + resultado);
		
	}

	@Override
	public void areaCilindro(double x1, double x2) {
		double resultado = 2*x1*Math.PI *(x1 + x2);
		System.out.println("Area: " + resultado);
		
	}

	public void PerimetroCilindro(double x1, double x2) {
		// TODO Auto-generated method stub
		
	}

	public void volumenCilindro(double x1, double x2) {
		double resultado = Math.PI * Math.pow(x1, 2) * x2;
		System.out.println("Volumen: " + resultado);
		
	}

	@Override
	public void areaCono(double x1, double x2) {
		double resultado = x1*Math.PI *(x1 + x2);
		System.out.println("Area: " + resultado);
		
	}

	@Override
	public void PerimetroCono(double x1, double x2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumenCono(double x1, double x2) {
		double resultado = (Math.PI * x2 * Math.pow(x1, 2))/3;
		System.out.println("Volumen: " + resultado);
		
	}

}
