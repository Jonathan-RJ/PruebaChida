package com;

public class Mama  extends Persona {

	@Override
	public void fechnac() {
		// TODO Auto-generated method stub
		System.out.println(" Fecha Nacimiento: 07/09/1993");
	}

	@Override
	public void edad() {
		// TODO Auto-generated method stub
		System.out.println("tengo 32 anos");
	}

	@Override
	public void sexo() {
		// TODO Auto-generated method stub
		System.out.println("Sexo: Mujer");
	}

	@Override
	public void altura() {
		// TODO Auto-generated method stub
		System.out.println("ALtura: 1.50");
	}
	
	public void cocina() {
		System.out.println("Prepara la comida");
	}
	public void limpia() {
		System.out.println("Limpia la casa");
	}

}
