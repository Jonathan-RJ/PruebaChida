package COM;

public class Hijo2 extends Padre{
	private String sexo;
	private double estatura;
	
	
	public Hijo2 () {
		
		
	}


	public Hijo2(String nombre, String apellido, int edad, String sexo, double estatura) {
		super(nombre, apellido, edad);
		
		this.sexo = sexo;
		this.estatura = estatura;
		// TODO Auto-generated constructor stub
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public double getEstatura() {
		return estatura;
	}


	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	
	

}
