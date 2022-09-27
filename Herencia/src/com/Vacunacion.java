package com;

public class Vacunacion extends Adopcion{
		
	private boolean vacunado;
	private boolean esterilizado;
	
	public Vacunacion() {
	}

	public Vacunacion(String animal, String genero, int años, String nombre) {
		super(animal, genero, años, nombre);
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public boolean isEsterilizado() {
		return esterilizado;
	}

	public void setEsterilizado(boolean esterilizado) {
		this.esterilizado = esterilizado;
	}
 
	
	
}
