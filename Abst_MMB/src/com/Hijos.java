package com;

public class Hijos extends Persona{

	public void fechnac() {
		// TODO Auto-generated method stub
		System.out.println(" Fecha Nacimiento: 07/09/2000");
	}

	@Override
	public void edad() {
		// TODO Auto-generated method stub
		System.out.println("tengo 22 anos");
	}

	@Override
	public void sexo() {
		// TODO Auto-generated method stub
		System.out.println("Sexo: Hombre");
	}

	@Override
	public void altura() {
		// TODO Auto-generated method stub
		System.out.println("ALtura: 1.64");
	}
	
	public void crecen() {
		System.out.println("Se alimenta bien para Crecer");
	}
	public void novia() {
		System.out.println("Tiene novia");
	}
	

}
