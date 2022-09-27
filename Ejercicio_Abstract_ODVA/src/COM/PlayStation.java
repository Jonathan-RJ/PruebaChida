package COM;

public class PlayStation extends Electronicos{

	@Override
	public void conexion() {
		// TODO Auto-generated method stub
		System.out.println("Conexion wifi");
	}

	@Override
	public void voltaje() {
		// TODO Auto-generated method stub
		System.out.println("110-220 V");
	}

	@Override
	public void nombre() {
		// TODO Auto-generated method stub
		System.out.println("Playstation");
	}

	@Override
	public void watts() {
		// TODO Auto-generated method stub
		System.out.println("150 watts");
	}
	
	public void jugar() {
		System.out.println("Puedes jugar juegos exclusivos de ps");
	}
	
	public void leerDisco() {
		System.out.println("PS cuenta con lector de CD");
	}

}
