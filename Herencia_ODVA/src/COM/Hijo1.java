package COM;

public class Hijo1 extends Padre{
   
	private boolean esMayor;
	public Hijo1() {
		
	}
	public Hijo1(String nombre, String apellido, int edad,  boolean esMayor) {
		super(nombre, apellido, edad);
		this.esMayor= esMayor;
		// TODO Auto-generated constructor stub
	}
	public boolean isEsMayor() {
		return esMayor;
	}
	public void setEsMayor(boolean esMayor) {
		this.esMayor = esMayor;
	}
	
	
	
	
	
	
	
}
