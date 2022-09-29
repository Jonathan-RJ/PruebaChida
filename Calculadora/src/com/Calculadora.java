package com;

public class Calculadora implements OperacionesAvanzadas, OperacionesBasicas{

	@Override
	public void suma(double n1, double n2) {
		// TODO Auto-generated method stub
		System.out.println("La resultado de la suma es:" +(n1+n2));
		
	}

	@Override
	public void resta(double n1, double n2) {
		// TODO Auto-generated method stub
		System.out.println("La resultado de la resta es:" + (n1-n2));
	}

	@Override
	public void multiplicacion(double n1, double n2) {
		// TODO Auto-generated method stub
		System.out.println("La resultado de la multiplicacion es:" + (n1*n2));
	}

	@Override
	public void division(double n1, double n2) {
		// TODO Auto-generated method stub
		System.out.println("La resultado de la division es:" + (n1/n2));	
	}

	@Override
	public void raizCuadrad(double n) {
		// TODO Auto-generated method stub
		System.out.println("La raiz cuadrada es: " +(Math.sqrt(n)));
	}

	@Override
	public void exponente(double n1, double n2) {
		// TODO Auto-generated method stub
		System.out.println("El resultado de la operacion es: " + (Math.pow(n1, n2)));
	}

	@Override
	public void generaRandomEntero(int menor, int Myor) {
		// TODO Auto-generated method stub
		System.out.println("El numero aleatorio entero es: " +( Math.floor(Math.random()*(Myor-menor+1)+menor)));
	}

	@Override
	public void generaRandomDecimal(int menor, int mayor) {
		// TODO Auto-generated method stub
		System.out.println("El numero aleatorio entero es: " + Math.random()*(mayor-menor)+menor);
	}

	@Override
	public void seno(double ang) {
		// TODO Auto-generated method stub
		System.out.println("El seno del angulo es: " + Math.sin(ang));
	}

	@Override
	public void coseno(double ang) {
		// TODO Auto-generated method stub
		System.out.println("El coseno del angulo es: " + Math.cos(ang));
	}

	@Override
	public void tangente(double ang) {
		// TODO Auto-generated method stub
		System.out.println("La tangente del angulo es: " + Math.tan(ang));
	}

	

}
