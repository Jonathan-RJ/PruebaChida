package com;

public class Calculadora implements OpeAvanzadas, OpeBasicas{

	
	public void sumar(double b1, double b2) {
		double resultado = b1 + b2;
		System.out.println("Suma = " + resultado);
		
	}

	public void restar(double b1, double b2) {
		double resultado = b1 - b2;
		System.out.println("Resta = " + resultado);
		
	}

	public void multiplicar(double b1, double b2) {
		double resultado = b1 * b2;
		System.out.println("Multiplicacion = " + resultado);
		
	}

	public void dividir(double b1, double b2) {
		double resultado = b1 % b2;
			if (b2 == 0) {
				System.out.println("Error no se puede generar un resultado");
			} else {
				System.out.println("Divison = " + resultado);
			}
	}

	@Override
	public void raizcuadrada(double b1) {
		double resultado = Math.sqrt(b1);
		System.out.println("Raiz cuadrado = " + resultado);
		
	}

	public void alcuadrado(double b1) {
		double resultado = Math.pow(b1, 2);
		System.out.println("Al cuadrado = " + resultado);
		
	}

	@Override
	public void random() {
		double resultado = Math.random();
		System.out.println("Ramdom = " + resultado);
		
	}

	public void coseno(double b2, double b3) {
		double resultado = Math.cos(b2/b3);
		System.out.println("Cos = " + resultado);
		
	}

	public void seno(double b1, double b3) {
		double resultado = Math.sin(b1/b3);
		System.out.println("Sen = " + resultado);		
	}

	
	public void tangente(double b1, double b2) {
		double resultado = Math.tan(b1/b2);
		System.out.println("Tan = " + resultado);
		
	}

	
	

	
	
	
}
