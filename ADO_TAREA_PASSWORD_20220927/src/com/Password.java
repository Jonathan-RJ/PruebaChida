package com;

public class Password {
	
	private int longitud = 8;
	private String contrasenia;
	
	//CONSTRUCTORES
	public Password() {
	}
	
	public Password(int longitud, String contrasenia) {
		this.longitud = longitud;
		this.contrasenia = contrasenia;
	}
	
	//Cosntructor para ingreso de longuitud de contraseña
	public Password(int longitud) {
		this.longitud = longitud;
	}

	//GETTERS Y SETTERS
	public int getLonguitud() {
		return longitud;
	}

	public void setLonguitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public void generarPassword() {
		if(longitud >=8) {
			String letrasNumeros = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz0123456789";
			String pass = "";
			int index;
			for (int i = 0; i < longitud	; i++) {
				index = (int)Math.round(Math.random() * letrasNumeros.length() -1);
				//Este código devuelve un índice random
				pass = pass + letrasNumeros.charAt(index);
				System.out.println(pass);
			}
			setContrasenia(pass);
		}
		else {
			System.out.println("No se puede generar una constraseña menor a 8 caracteres");
		}
	}
	
	
	//SOBRECARGA DE MÉTODOS
	
	public void generarPassword(int longitud) {
		if(longitud >=8) {
			String letrasNumeros = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz0123456789";
			String pass = "";
			int index;
			for (int i = 0; i < longitud	; i++) {
				index = (int)Math.round(Math.random() * letrasNumeros.length() -1);
				//Este código devuelve un índice random
				pass = pass + letrasNumeros.charAt(index);
				//System.out.println(pass);
			}
			setContrasenia(pass);
		}
		else {
			System.out.println("No se puede generar una constraseña menor a 8 caracteres");
		}
	}
	public boolean esFuerte() {	
		try {
			int mayusculas = 0;
			int minusculas = 0;
			int numeros = 0;
			for (int i = 0; i < getContrasenia().length(); i++) {
				char capt = getContrasenia().charAt(i);
				String letra = String.valueOf(capt); //convierte String a Char
				if(letra == letra.toUpperCase()) {
					mayusculas++;
				}
				if(letra == letra.toLowerCase()) {
					minusculas++;
				}
				if(letra.matches("[0-9]+")){
					numeros++;
				}
			}			
			if(mayusculas > 12 && minusculas > 1 && numeros > 5) {
				System.out.println("La contraseña es fuerte! \n¡Cielos, que maciza!");
				return true;			
			}else {
				System.out.println("Es una contraseña debil:\nLe falta barrio.");
				return false;	
			}
		} catch (Exception e) {
				System.out.println("Ocurrió un error, verifique su longitud");
				return false;
		}
	}
	
}//FIN DE LA CLASE
