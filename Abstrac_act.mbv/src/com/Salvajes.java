package com;

public class Salvajes extends Animales{

	
	public void manada() {
		System.out.println("Ellos tienen manadas");	
	}
	
	public void cazan() {
		System.out.println("Cazan su propio alimento");	
	}

	@Override
	public void jugar() {
		System.out.println("Juegan con ellos mismos");	
		
	}

	@Override
	public void habitad() {
		System.out.println("Vieven en zonas alejadas de los humanos");	
		
	}

	@Override
	public void comida() {
		System.out.println("consigen su propio alimento");	
		
	}

	@Override
	public void dormir() {
		System.out.println("Duermen en los suelos");	
		
	}
	

}
