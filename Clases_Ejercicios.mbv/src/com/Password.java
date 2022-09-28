package com;

public class Password {
		
	private double longitud = 8;
	private String contrasenia;
	
	public Password() {
	}
	public Password(double longitud, String contrasenia) {
		this.longitud = longitud;
		this.contrasenia = contrasenia;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;	
	}
	
	public void generarPassword() {
		if (longitud >= 8) {
			String letrasNumeros = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz0123456789";
				String pass = "";
				int index;
					for (int i = 0; i < longitud; i++) {
						index = (int)Math.round(Math.random() * letrasNumeros.length() -1);
							pass = pass + letrasNumeros.charAt(index);
					}
				setContrasenia(pass);
		} else {
			System.out.println("No se puede generar una contraseña menor a 8 caracteres");
		}
	}
	
	public void generarPassword(int longitud) {
		if (longitud >= 8) {
			String letrasNumeros = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz0123456789";
				String pass = "";
				int index;
					for (int i = 0; i < longitud; i++) {
						index = (int)Math.round(Math.random() * letrasNumeros.length() -1);
							pass = pass + letrasNumeros.charAt(index);
					}
				setContrasenia(pass);
		} else {
			System.out.println("No se puede generar una contraseña menor a 8 caracteres");
		}
	}
	 
	public boolean esFuerte() {
	 try {
		 int mayusculas = 0;
			int minusculas = 0;
			int numeros = 0;
			
			for (int i = 0; i < getContrasenia().length();i++) {
				char capt = getContrasenia().charAt(i);
				String letra = String.valueOf(capt);
				
					if(letra == letra.toUpperCase()) {
						mayusculas++;
					}
						if (letra.matches("[0-9)+")) {
							numeros++;
						}
			}
			if (mayusculas > 2 && minusculas > 1 && numeros > 5) {
				return true;
			} else {
				return false;
			}

	 } catch (Exception e) {
		 System.out.println("Ocurrio un error");
		 return false;
	 }
	 }
	
}

	
	
	
	
	
	
	
	

