package com;

public class Principal {

	public static void main(String[] args) {
		Salvajes s1 = new Salvajes();
		Domesticos d1 = new Gatos();
		
		System.out.println("Los Animales Salvajes");
		
		s1.cazan();
		s1.dormir();
		s1.habitad();
		s1.manada();
		
		System.out.println("Los animales domesticos como el gato");
		
		d1.dormir();
		d1.habitad();
		d1.jugar();
		d1.dueño();
		d1.nombre();
		
		
		
		
		
		
	}

}
