package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Calculadora c1 = new Calculadora();
			double a1;
			double a2;
			double a3;
		//ejercicio calculadora: hacer un menu switch, pedir datos por consola,
		//devolver el resultado
		//estructura de control para la division (segundo numero es 0)
		//Generar numero ramdom con decimal o con enteros 
		
	System.out.println("Calculadora Cientifica");
	
		System.out.println( "1: SUMA \n" + "2: REESTA \n" + "3: MULTIPLICACION \n" + "4: DIVISION \n" 
				+ "5: RAIZ \n" + "6: EXPONENTE \n" + "7: ANGULOS \n" + "8: NUMERO RAMDOM \n");
	
		System.out.println("Elige una Operacion");
			int opcion = entrada.nextInt();
	
			switch(opcion) {
				case 1: 
					System.out.println("ingresa un numero");
						a1 = entrada.nextDouble();
					System.out.println("ingresa un numero");
						a2 = entrada.nextDouble();
							c1.sumar(a1, a2);
				break;
				case 2: 
					System.out.println("ingresa un numero");
						a1 = entrada.nextDouble();
					System.out.println("ingresa un numero");
						a2 = entrada.nextDouble();
							c1.restar(a1, a2);
				break;
				case 3: 
					System.out.println("ingresa un numero");
						a1 = entrada.nextDouble();
					System.out.println("ingresa un numero");
						a2 = entrada.nextDouble();
							c1.multiplicar(a1, a2);
				break;
				case 4: 
					System.out.println("ingresa un numero");
						a1 = entrada.nextDouble();
					System.out.println("ingresa un numero");
						a2 = entrada.nextDouble();
							c1.dividir(a1, a2);
				break;
				case 5: 
					System.out.println("ingresa un numero");
						a1 = entrada.nextDouble();
							c1.raizcuadrada(a1);
				break;
				case 6: 
					System.out.println("ingresa un numero");
						a1 = entrada.nextDouble();
							c1.alcuadrado(a1);
				break;
				case 7: 
					System.out.println("Para sacar sen, cos y tan: ingresa los angulos");
						a1 = entrada.nextDouble();
						a2 = entrada.nextDouble();
						a3 = entrada.nextDouble();
							c1.seno(a1, a3);
							c1.tangente(a1, a2);
							c1.coseno(a2, a3);
				break;
				case 8:
					System.out.println("Numero alazar");
							c1.random();
				break;
			default: 
	}	
	
	}

}
