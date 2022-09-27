package COM;

public class Padre {
	private String nombre, apellido;
	private int edad;
	
	
	public Padre() {
		
	}


	public Padre(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void muestranombre() {
		System.out.println("Nombre: " + nombre + "\nApellido: " + apellido +  "\nEdad: " + edad + " Años");
	}
	
	

}
