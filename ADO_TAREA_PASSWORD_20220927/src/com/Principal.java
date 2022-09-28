package com;

public class Principal {

	public static void main(String[] args) {

		/*Haz una clase llamada Password que siga las siguientes condiciones:

		OK - Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
		Los constructores serán los siguiente:
		OK - Un constructor por defecto.
		OK - Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria 
		con esa longitud.
		
		Los métodos que implementa serán:
		esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener 
		mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
		
		generarPassword():  genera la contraseña del objeto con la longitud que tenga.
		Método get para contraseña y longitud.
		Método set para longitud*/
		
		Password p1 = new Password();

		p1.generarPassword(39);
		
		System.out.println(p1.getContrasenia());
		
		System.out.println(p1.esFuerte());
	
		
	} //FIN DEL MAIN

} //FIN DE LA CLASE
