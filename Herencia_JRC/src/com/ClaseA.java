package com;
//Ejercicio donde se cree una clase padre con tres clases hijos, y se 
//comparta como tal un metodo de accion
//Cargar TODOS los datos de los hijos y mostrarlos (getter)
public class ClaseA {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public ClaseA() {
		
	}
	public ClaseA(String nombre, String apellido, int edad) {
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
	
	
	
	
	
	

}
