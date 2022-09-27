package com;

public class Principal {

	public static void main(String[] args) {
//		Clase_B cb = new Clase_B();
//		Clase_C cc = new Clase_C();
//		
//		cb.setNombre(" Marelyn ");
//		System.out.println(cb.getNombre());
//		
//		cc.setApellido(" Bouchet ");
//		System.out.println(cc.getApellido());
		
		//Ejercicio donde se cree una clase con 3 clases hijos
		//Cargar todos los datos de los hijos y mostrarlos
		
	Vacunacion a1 = new Vacunacion();
	Dueño a2 = new Dueño();
	
	a2.setNomdueño("Juan Perez");
		System.out.println("Nombre del dueño " + a2.getNomdueño());
	a2.setOcupacion("Programador");
		System.out.println("Ocupacion: " + a2.getOcupacion());
		
	a1.setAnimal("Felino");	
		System.out.println("Tipo de animal: " + a1.getAnimal());
	a1.setNombre("Hunter");
		System.out.println("Nombre de la mascota: " + a1.getNombre());
	a1.setEsterilizado(true);
		System.out.println("Esterilizado: " + a1.isEsterilizado());
	
	}

}
