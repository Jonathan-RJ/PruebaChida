package com;

public class Gatos extends Domesticos {

	
	@Override
	public void jugar() {
		System.out.println("Tienen jugetes de plastico");
		
	}

	@Override
	public void habitad() {
		System.out.println("Los hogares de su dueño");
		
	}

	@Override
	public void comida() {
		System.out.println("Les compran su alimento");
		
	}

	@Override
	public void dormir() {
		System.out.println("Duermen en casas");
		
	}
	

}
