package com;

public class Principal {

	public static void main(String[] args) {
	
		Prismas p1 = new Prismas();
		
		System.out.println("Figuras Geometricas");
		
		System.out.println("Cubo");
		p1.areaCubo(4);
		p1.perimetroCubo(4);
		p1.volumenCubo(4);
		
		System.out.println("Prisma Rectangular");
		p1.areaPrisma(5, 5, 5);
		p1.volumenPrisma(8, 9, 4);
		
		System.out.println("Cilindro");
		p1.areaCilindro(5, 5);
		p1.volumenCilindro(5, 6);
		
		System.out.println("Cono");
		p1.areaCono(8, 9);
		p1.volumenCono(9, 9);
		

	}

}
