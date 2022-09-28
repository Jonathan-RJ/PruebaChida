package com;

public class Principal {
	
	public static void main(String[] args) {
		
		//TERCER CONTACTO DEL POLIMORFISMO
//		
//		Hombre n1 = new Ni�o(); //Esto es instanciar Padre-Hija
//		Hombre a1 = new Adulto();
//		Mujer m1 = new Mujer();
//		
//		
//		m1.comer();
//		m1.darALuz();
//		m1.amamantar();
//		n1.comer();
//		a1.comer();

		
		//EJERCICIO:
		//- Modelar un ABSTRACT que comparta los m�todos (m�nimo 4 compartidos)
		// con sus hijas pero que esas clases hijas (al menos 3 hijas)
		// a su vez tambi�n tengan m�todos propios (al menos dos m�todos)
		// al final en la clase principal imprimir cada m�todo
		// - Instanciar por medio de padre-hija al menos en una clase,
		// y de la manera com�n en la que se ha trabajado
		// Subir al Git
		
		
		System.out.println("LOS MODELOS DE GR�FICAS SON LOS SIGUIENTES:\n");
		Grafica g1 = new Modelo1();
		Modelo1 m1 = new Modelo1();
		
		Grafica g2 = new Modelo2();
		Modelo2 m2 = new Modelo2();
		
		Grafica g3 = new Modelo3();
		Modelo3 m3 = new Modelo3();
		
		g1.Ensamblador();
		g1.Serie();
		g1.NumSerie();
		m1.color();
		m1.numVentiladores();
		
		g2.Ensamblador();
		g2.Serie();
		g2.NumSerie();
		m2.Consumo();
		m2.RGB();
		
		g2.Ensamblador();
		g2.Serie();
		g2.NumSerie();
		m3.Dise�o();
		m3.numConector();
		
	}//FIN DEL MAIN

} //FIN DE LA CLASE
