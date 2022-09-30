package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patamon p1 = new Patamon();
		Angemon a1 = new Angemon();
		MagnaAngemon m1 = new MagnaAngemon();
		
		System.out.println("Patamon:");
		p1.volar();
		p1.golpes();
		p1.evolucionar();
		
		System.out.println("Angemon");
		a1.volar();
		a1.golpes();
		a1.evolucionar();
		
		System.out.println("MagnaAngemon");
		m1.volar();
		m1.golpes();
		m1.evolucionar();

	}

}
