package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseB cb = new  ClaseB();
		ClaseC cc = new ClaseC();
		cb.setTampelota("Grande");
		cb.setColor("Blanco y negro");
		cb.setTipopelota("Futboll");
		cb.setPrecio(150.50);
		cc.setTienda("Wallmart");
		
		System.out.println("Tamaño de Pelota: "+cb.getTampelota());
		System.out.println("Color de pelota: "+cb.getColor());
		System.out.println("Tipo de pelota: "+cb.getTipopelota());
		System.out.println("Precio: "+cb.getPrecio());
		System.out.println("Tienda de Venta: "+cc.getTienda());

	}

}
