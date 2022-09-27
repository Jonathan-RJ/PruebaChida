package com;

public class Modelo1 extends Grafica{

	@Override
	public void Ensamblador() {
		System.out.println("\nEnsamblador: GIGABYTE");
		
	}

	@Override
	public void Serie() {
		System.out.println("Series: RXT");
		
	}

	@Override
	public void NumSerie() {
		System.out.println("3060 Ti Vision");
		
	}

	@Override
	public void Precio() {
		System.out.println("Precio: $ 8'500 MN");
		
	}

	public void numVentiladores() {
		System.out.println("Este modelo tiene 3 ventiladores");
	}
	
	public void color() {
		System.out.println("Color: Blanco");
	}
	
} //FIN DE LA CLASE
