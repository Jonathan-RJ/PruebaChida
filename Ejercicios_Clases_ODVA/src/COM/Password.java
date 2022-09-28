package COM;

public class Password {

	
	private int longitud = 8;
	private String contrasenia;
	
	public Password() {
		
	}

	public Password(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public void generaPassword(int longitud) {
		if (longitud>=8) {
			String letrasNumeros ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			String pass = "";
			int index; 
			
			for (int i=0; i <longitud; i++) {
				index =(int) Math.round(Math.random() * letrasNumeros.length() -1);
		
				pass = pass + letrasNumeros.charAt(index);
				
		}
			setContrasenia(pass);
			}
		
		else {
			System.out.println("No se puede generar contrasena menor a 8 caracteres");
		
			}
		}
	
	public boolean esFuerte() {
		try {
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0 ;
		for (int i = 0; i < getContrasenia().length(); i++) {
			char ch =  getContrasenia().charAt(i);
			String letra =  String.valueOf(ch);
			if (letra ==  letra.toUpperCase()) {
				mayusculas++;
			}
			
			if (letra ==  letra.toLowerCase()) {
				minusculas++;
			}
			
			if (letra.matches("[0-9]+")){
				numeros++;
			}
					
		}
		
		
		if (mayusculas>2 && minusculas > 2 && numeros>2) {
			System.out.println("La contrasenia " + getContrasenia() + " Es fuerte " );
		}
			
		else {
			System.out.println("La contraseña es debil");
		}
		
		
		return true;
	}
		catch (Exception e) {
			System.out.println(" Ocurrio un error verifique su longitud");
			return false;
		}
			
		
	}
	

	
		
		
	}//Fin
	
	
	

