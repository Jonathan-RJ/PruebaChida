package com;

public class Modelo2 extends Grafica{

	@Override
	public void Ensamblador() {
		System.out.println("\nEnsamblador: EVGA");
	}

	@Override
	public void Serie() {
		System.out.println("Series: RTX");
	}

	@Override
	public void NumSerie() {
		System.out.println("3090 FTW3");
	}

	@Override
	public void Precio() {
		System.out.println("Precio: $ 20'000 MN");
		
	}

	public void RGB() {
		System.out.println("Diseño: Barra y nombre con RGB");
	}
	
	public void Consumo() {
		System.out.println("Consumo: 340 Watts");
	}
}
