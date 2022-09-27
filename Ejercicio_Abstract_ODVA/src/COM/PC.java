package COM;

public class PC extends Electronicos{

	@Override
	public void conexion() {
		// TODO Auto-generated method stub
		System.out.println("conexion alambrica ethernet");
	}

	@Override
	public void voltaje() {
		// TODO Auto-generated method stub
		System.out.println("110-220 V");
	}

	@Override
	public void nombre() {
		// TODO Auto-generated method stub
		System.out.println("HP pavilion 5365343");
	}

	@Override
	public void watts() {
		// TODO Auto-generated method stub
		System.out.println("200 watts");
	}
	
	public void codigo() {
		System.out.println("En pc puedes realizar codigo para programar");
	}
	
	public void creaJuegos() {
		System.out.println("En PC puedes crear juegos");
	}

	
}
