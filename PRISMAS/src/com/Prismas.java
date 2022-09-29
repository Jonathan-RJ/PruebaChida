package com;

public class Prismas implements Cilindro, Cubo, Cono, PrismaRectangular {

	@Override
	public void volumen(double largo, double ancho, double altura) {
		// TODO Auto-generated method stub
		System.out.println("El volumen del prisma es:" +(largo*ancho*altura));
	}

	@Override
	public void volumen(double lado) {
		// TODO Auto-generated method stub
		System.out.println("El volumen del cubo es:" +(lado*lado*lado));

	}

	@Override
	public void volumen(double altura, double radio) {
		// TODO Auto-generated method stub
		System.out.println("El volumen del cono es:" +((1/3)*3.1416*(radio*radio)*altura));

	}

	@Override
	public void volumenCilindro(double altura, double radio) {
		// TODO Auto-generated method stub
		System.out.println("El volumen del cilindro es: " + (3.1416*(radio*radio)*altura));
	}

	@Override
	public void areaPrisma(double largo, double ancho) {
		// TODO Auto-generated method stub
		System.out.println("El area del prisma ract es:" + (largo*ancho));
	}

	@Override
	public void perimetrPrisma(double largo, double ancho, double altura) {
		// TODO Auto-generated method stub
		System.out.println("El area del prisma ract es:" + (largo+ancho+altura)*3);

	}

	@Override
	public void area(double radio) {
		// TODO Auto-generated method stub
		System.out.println("El area del cono es:" +(3.1416*(radio*radio)));
	}

	@Override
	public void areaCubo(double lado) {
		// TODO Auto-generated method stub
		System.out.println("El area del cuno es:" + (lado*lado));
	}

	@Override
	public void perimetroCubo(double lado) {
		// TODO Auto-generated method stub
		System.out.println("El perimetro del cubo es: " + (lado*12));
	}

	@Override
	public void perimetroCilindro(double altura, double radio) {
		// TODO Auto-generated method stub
		System.out.println("El perimetro del ciclindro es: " + (2*3.1416));
	}

	@Override
	public void areaoCilindro(double radio) {
		// TODO Auto-generated method stub
		System.out.println("El area del cilindro es: " + (3.1416*(radio*radio)));
	}

}
