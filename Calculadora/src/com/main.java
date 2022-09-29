package com;

import java.util.Scanner;

//HACER UN MENU CON UN SWITCH, PEDIR LOS DATOS POR CONSOLA (sCANNER ),  Y DEVOLVER EL RESULRADO
// DIVISION DEL SEGUNDO NUMERO NO SEA CERO NOTIFICAR ERROR
//INTERFACE AVANZADA, RAIZ CUADRADA, EXPONENTE GENERA RANDOM, COSENO SEON Y TANGENTE
//INTEFACE BASICA SUMA RESTA DIV Y MULTIPLICACION 

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		Scanner entrada =  new Scanner(System.in);
		boolean bandera=false;
		int num1, num2;
		double angulo;
		do {
		System.out.println("---- Calculadora Cientifica -----\n" + "1 --- Operaciones basicas---\n"
		+ "\n" + "1 Suma, 2 Resta, 3 Multiplicacion, 4 division\n"
				+ "\n2 ---Operaciones avanzadas---" + "\n" 
		+ "\n1 Raiz cuadrada,  2 exponentes, 3 Genera un numero random entero, 4 Genera random con decimales\n5 Seno, 6 Coseno, 7 Tangente");
		System.out.println("Introduzca el tipo de operacion a realizar");
		int opcion = entrada.nextInt();
		
		if (opcion == 1) {
			System.out.println("---Operaciones Basicas---\n "
					+ "\n1 Suma\n2 Resta\n3 Multiplicacion\n4 Division\n");
			
			System.out.println("Elija la operacion");
			opcion =  entrada.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Ingrese el primer numero");
				num1 = entrada.nextInt();
				System.out.println("Ingrese el segundo numero");
				num2 = entrada.nextInt();
				calc.suma(num1, num2);
				break;
			case 2:
				System.out.println("Ingrese el primer numero");
				num1 = entrada.nextInt();
				System.out.println("Ingrese el segundo numero");
				num2 = entrada.nextInt();
				calc.resta(num1, num2);
				break;
			case 3:
				System.out.println("Ingrese el primer numero");
				num1 = entrada.nextInt();
				System.out.println("Ingrese el segundo numero");
				num2 = entrada.nextInt();
				calc.multiplicacion(num1, num2);
				break;
			case 4:
				
				System.out.println("Ingrese el primer numero");
				num1 = entrada.nextInt();
				System.out.println("Ingrese el segundo numero");
				num2 = entrada.nextInt();
				if (num2>0) {
				calc.division(num1, num2);
				break;
			}
				else {
					System.out.println("Error no se puede dividir un numero entre 0");
					break;
				}
			}
		}
		else if (opcion == 2 ) {
			System.out.println("--- Operaciones Avnzadas---\n");
			System.out.println("1 Raiz cuadrada\n2 Exponente\n3 Genera random entero\n4 2Genera random decimal"
					+ "\n5 Calcula el seno de un angulo\n6 Calcula el coseno del angulo\n7 Calcula tangente");
		       opcion = entrada.nextInt();
		       
		       switch (opcion) {
		       case 1:
		    	   System.out.println("Introduzca un numero:");
		    	   num1 = entrada.nextInt();
		           calc.raizCuadrad(num1);
		           break;
		       case 2 :
		    	   System.out.println("Introduzca un numero:");
		    	   num1 = entrada.nextInt();
		    	   System.out.println("Introduzca el exponente:");
		    	   num2 = entrada.nextInt();
		           calc.exponente(num1, num2);
		       case 3 :
		    	   System.out.println("Introduzca un el primer limite menor");
		    	   num1 = entrada.nextInt();
		    	   System.out.println("Introduzca un el primer limite mayor");
		    	   num2 = entrada.nextInt();
		    	   calc.generaRandomEntero(num1, num2);
		    	   break;
		       case 4:
		    	   System.out.println("Introduzca un el primer limite menor");
		    	   num1 = entrada.nextInt();
		    	   System.out.println("Introduzca un el primer limite mayor");
		    	   num2 = entrada.nextInt();
		    	   calc.generaRandomDecimal(num1, num2);
		    	   break;
		       case 5 :
		    	   System.out.println("Introduzca el angulo");
		    	   num1= entrada.nextInt();
		    	   calc.seno(num1);
		    	   break;
		       case 6:
		    	   System.out.println("Introduzca el angulo");
		    	   num1= entrada.nextInt();
		    	   calc.coseno(num1);
		    	   break;
		       case 7 :
		    	   System.out.println("Introduzca el angulo");
		    	   num1= entrada.nextInt();
		    	   calc.tangente(num1);
		    	   break;
		    	   default:
		    		   System.out.println("Error opcion no reconocida");
		       }
			
			
		
		
		}
		
		else {
			System.out.println("Error indroduzca una opcion valida 1 o 2");
		}		System.out.println("\nDesea realizar otra operacion?\nPreseione 1 para si\nPresione 2 para terminar");
		int terminar =  entrada.nextInt();
		if (terminar ==1 ) {
			bandera = true;
		}
		else {
			bandera = false;
		}
		
		}
		while (bandera=true);

		}
		
	}

