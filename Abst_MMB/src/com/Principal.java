package com;

public class Principal {
	public static void main(String[] args) {
		Mama m=new Mama();
		Papa p=new Papa();
		Hijos h=new Hijos();
		System.out.println("MAMA\n");
		m.fechnac();
		m.edad();
		m.sexo();
		m.altura();
		m.limpia();
		m.cocina();
		
		System.out.println("\nPAPA");
		p.fechnac();
		p.edad();
		p.sexo();
		p.altura();
		p.semana();
		p.trabaja();
		
		System.out.println("\nHijos");
		h.fechnac();
		h.edad();
		h.sexo();
		h.altura();
		h.crecen();
		h.novia();
	}
}
