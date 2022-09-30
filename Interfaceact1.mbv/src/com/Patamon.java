package com;

public class Patamon implements Combate, Resistencia, Habilidad {

	@Override
	public void volar() {
		System.out.println("Patamon puede volar");
	}

	@Override
	public void evolucionar() {
		System.out.println("El digievoluciona a Angemon");
		
	}

	@Override
	public void flesivilidad() {
		System.out.println("No tiene Flexibilidad");
		
	}

	@Override
	public void velocidad() {
		System.out.println("no tiene velocidad");
		
	}

	@Override
	public void golpes() {
		System.out.println("No es bueno Peleando");
		
	}

	@Override
	public void aguilidad() {
		System.out.println("No tiene agilidad");
		
	}

}
