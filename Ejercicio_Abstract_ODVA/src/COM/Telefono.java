package COM;

public class Telefono extends Electronicos {

	@Override
	public void conexion() {
		// TODO Auto-generated method stub
		System.out.println("conexion wifi ");
	}

	@Override
	public void voltaje() {
		// TODO Auto-generated method stub
		System.out.println("5 v");
	}

	@Override
	public void nombre() {
		// TODO Auto-generated method stub
		System.out.println("Samsung galaxy 20");
	}

	@Override
	public void watts() {
		// TODO Auto-generated method stub
		System.out.println("20 watts");
	}
	
	public void llamada() {
		System.out.println("El telefono puede hacer llamadas sin internet ");
	}
	
	public void camara() {
		System.out.println("Tomar fotografias");
	}

}
