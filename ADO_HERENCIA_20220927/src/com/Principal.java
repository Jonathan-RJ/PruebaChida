package com;

public class Principal {
	public static void main(String[] args) {
		
		//HERENCIAS
		//Se hace en el "public class _Clase hijo__" usando "extends _Clase padre_ {"
//		ClaseB cb = new ClaseB();
//		ClaseC cc = new ClaseC();
//		
//		cb.setNombre("Abraham");
//		System.out.println(cb.getNombre());
//		
//		cc.setApellido("Dorantes");
//		System.out.println(cc.getApellido());
		
		
		//EJERCICIO:
		// Crear una clase  padre con tres clases hijo y se comparta un método de acción
		// Cargar todos los datos de los hijos y mostrarlos 
		
		ClaseB cb2 = new ClaseB();
		ClaseB cb3 = new ClaseB();
		ClaseC cc2 = new ClaseC();
		ClaseC cc3 = new ClaseC();
		ClaseD cd2 = new ClaseD();
		ClaseD cd3 = new ClaseD();
		
		cb2.setNombre("Abraham");
		System.out.println(cb2.getNombre());
		
		cd2.setApellido("Dorantes");
		System.out.println(cd2.getApellido());
		
		cc2.setEdad(29);
		System.out.println(cc2.getEdad());
		
		cb3.setNumSerie(117);
		System.out.println(cb3.getNumSerie());
		
		cc3.setMaterial("CROMO-LY");
		System.out.println(cc3.getMaterial());
		
		cd3.setColor("Petrol");
		System.out.println(cd3.getColor());

		
	} //FIN DEL MAIN
} // FIN DE LA CLASE
