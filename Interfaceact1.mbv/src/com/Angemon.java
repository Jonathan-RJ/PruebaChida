package com;

public class Angemon implements Combate, Resistencia, Habilidad {

	@Override
	public void volar() {
		System.out.println("puede volar");
		
	}

	@Override
	public void evolucionar() {
		System.out.println("Evoluciona a MagnaAngemon");
		
	}

	@Override
	public void flesivilidad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void velocidad() {
		System.out.println("Es muy veloz");
		
	}

	@Override
	public void golpes() {
		System.out.println("Es bueno peleando");
		
	}

	@Override
	public void aguilidad() {
		// TODO Auto-generated method stub
		
	}

}
