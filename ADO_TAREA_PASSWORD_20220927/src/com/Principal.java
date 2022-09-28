package com;

public class Principal {

	public static void main(String[] args) {

		/*Haz una clase llamada Password que siga las siguientes condiciones:

		OK - Que tenga los atributos longitud y contrase�a . Por defecto, la longitud sera de 8.
		Los constructores ser�n los siguiente:
		OK - Un constructor por defecto.
		OK - Un constructor con la longitud que nosotros le pasemos. Generara una contrase�a aleatoria 
		con esa longitud.
		
		Los m�todos que implementa ser�n:
		esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener 
		mas de 2 may�sculas, mas de 1 min�scula y mas de 5 n�meros.
		
		generarPassword():  genera la contrase�a del objeto con la longitud que tenga.
		M�todo get para contrase�a y longitud.
		M�todo set para longitud*/
		
		Password p1 = new Password();

		p1.generarPassword(39);
		
		System.out.println(p1.getContrasenia());
		
		System.out.println(p1.esFuerte());
	
		
	} //FIN DEL MAIN

} //FIN DE LA CLASE
