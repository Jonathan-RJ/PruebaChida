package com;

public class Principal {

	public static void main(String[] args) {
		ClaseB cb = new ClaseB();
		ClaseC cc = new ClaseC();
		
		cb.setNombre("Jonathan");
		System.out.println(cb.getNombre());
		
		cc.setApellido("Robles");
		System.out.println(cc.getApellido());
		
		 

	}

}
