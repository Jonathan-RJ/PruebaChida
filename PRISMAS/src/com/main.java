package com;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner entrada =new Scanner(System.in);
		Prismas fig =  new Prismas();
		boolean bandera = true;
		do {
			
		
		System.out.println("--- Bienvenido ---");
		System.out.println("Seleccione el prisma que desea calcular"
				+ "\n\n1 Cubo"
				+ "\n\n2 Prisma rectangular"
				+ "\n\n3 Cilindro"
				+ "\n\n4 Cono");
		int opcion = entrada.nextInt();
		
		switch (opcion) {
		
		case 1 :
			System.out.println("Ingrese el valor del lado");
			int lado =  entrada.nextInt();
			fig.volumen(lado);
			fig.perimetroCubo(lado);
			fig.areaCubo(lado);
			break;
			
		case 2 :
			System.out.println("Ingrese el valor del largo");
			int largo =  entrada.nextInt();
			System.out.println("Ingrese el valor del ancho");
			int ancho =  entrada.nextInt();
			System.out.println("Ingrese el valor de la altura");
			int altura =  entrada.nextInt();
			fig.volumen(largo, ancho, altura);
			fig.perimetrPrisma(largo, ancho, altura);
			fig.areaPrisma(largo, ancho);
			
			break;
		case 3 :
			System.out.println("Ingrese el valor de la altura");
			int alto =  entrada.nextInt();
			System.out.println("Ingrese el valor del radio");
			int radio =  entrada.nextInt();
			fig.volumen(alto, radio);
			fig.perimetroCilindro(alto, radio);
			fig.areaoCilindro(radio);
			break;
			case 4:
				System.out.println("Ingrese el valor de la altura");
				int alt =  entrada.nextInt();
				System.out.println("Ingrese el valor del radio");
				int rad =  entrada.nextInt();
				fig.volumenCilindro(alt, rad);
				fig.area(rad);
				
				break;
				
				default:
					break;
				
			
		}
		

		
		System.out.println("\nDesea realizar otra operacion?"
	       		+ "\n1 Si \n"
	       		+ "\n2 Terminar");
	       int terminar = entrada.nextInt();
	       if (terminar == 1) {
	    	   bandera =true;
	       }
	       else 
	       {
	    	   bandera = false;}
	       
	}
	while(bandera);
	}
}
		

	



