package com;

public class Modelo3 extends Grafica{

	@Override
	public void Ensamblador() {
		System.out.println("\nEnsamblador: Zotac");
	}

	@Override
	public void Serie() {
		System.out.println("Seires: RTX");
	}

	@Override
	public void NumSerie() {
		System.out.println("3070 Twin Edge");
	}

	@Override
	public void Precio() {
		System.out.println("Precio: $ 12'500 MN");
	}

	public void numConector() {
		System.out.println("Tiene alimentadores por medio de 2 conectores PCIe");
	}
	
	public void Diseño() {
		System.out.println("Diseño: Delgado, estético y LED blanco en nombre");
	}
	
}
