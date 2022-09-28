package com;

public class Cuenta {
	
	private String titular;
	private double cantidad;
	
	public Cuenta() {
		
	}

	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public void ingresar(double cantidad) {
		System.out.println("Se ingreso: " + cantidad );
			if (cantidad > 0) {
				this.cantidad += cantidad;
			}
	}
	public void retirar(double cantidad) {
		System.out.println("Se retiro: " + cantidad );
			if (cantidad > this.cantidad) {
				this.cantidad = 0;
			} else { 
				this.cantidad -= cantidad;
				}
			}
	@Override
	public String toString() {
		return "Cuenta [titular: " + this.titular + " cantidad: " + this.cantidad + "]";
	}
	
}
	

