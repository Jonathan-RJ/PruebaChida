package com;

public class ClaseC extends ClaseA{
	private String tienda;

	public ClaseC() {
		
	}

	public ClaseC(String tampelota, String color, String tipopelota, String tienda) {
		super(tampelota, color, tipopelota);
		this.tienda = tienda;
		// TODO Auto-generated constructor stub
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
	}

	
	
	

}
