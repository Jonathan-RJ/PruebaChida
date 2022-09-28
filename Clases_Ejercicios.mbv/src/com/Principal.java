package com;
//import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {

			//ejercicio 1.
//		Scanner entrada = new Scanner(System.in);
//	
//		Cuenta c1 = new Cuenta("Juan Perez", 1288.45);
//			
//		System.out.println("cantidad que quiere ingresar: ");
//		
//			double ingresos = entrada.nextDouble();
//			c1.ingresar(ingresos);
//		
//		System.out.println("cantidad que quiere retirar: ");
//			double retiros = entrada.nextDouble();
//			c1.retirar(retiros);
//		
//			System.out.println(c1.toString());
		
		//ejercicio 2
		
		Password p1 = new Password();
		
		p1.generarPassword(12);
		System.out.println(p1.getContrasenia());
		System.out.println(p1.esFuerte());
		
		
		
		
		
		
		
		
		
		
		
		
			//ejercicio 3
//		Libros l1 = new Libros(" Harry Potter y la piedra filosofal", " J.K Rowlimg",  705725702,  266);
//		Libros l2 = new Libros(" Percy Jackson y el ladron del rayo", " Rick Riordan",  027575250,  288);
//		
//		System.out.println(l1.toString());
//		System.out.println(l2.toString());
//		
//		if (l1.getNumPaginas() > l2.getNumPaginas()) {
//			System.out.println("Harry Potter tiene mas paginas");
//		} else {
//			System.out.println("Percy Jackson tiene mas paginas");
//		}
		
	}

}
