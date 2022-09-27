package COM;

public class main {
	public static void main(String[] args) {
		
		Padre p = new Padre("Juan", "Sanchez", 43);
		p.muestranombre();
		
		Hijo1 h1 = new Hijo1();
		h1.setNombre("Juanito jr");
		h1.setApellido("Sanchez");
		h1.setEdad(22);
		if (h1.getEdad()>17) {
		h1.setEsMayor(true);
		}

		if (h1.isEsMayor()) {
			System.out.println(h1.getNombre() + " " + h1.getApellido() + " Es mayor de edad" );
			
		}
		else {
			System.out.println(h1.getNombre() + " " + h1.getApellido() + " Es menor de edad" );
		}
	}

}
