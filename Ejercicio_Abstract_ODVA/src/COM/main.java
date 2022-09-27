package COM;

public class main {
 public static void main(String[] args) {
	 Electronicos ps1 = new PlayStation();
	 PC compu = new PC();
	 Telefono cel1 = new Telefono();
	 
	 System.out.println("**PLAYSTATION**");
	 ps1.nombre();
	 ps1.conexion();
	 ps1.voltaje();
	 ps1.watts();
	 System.out.println("");
	 System.out.println("**COMUPTADORA**");
	compu.nombre();
	compu.conexion();
	compu.voltaje();
	compu.watts();
	compu.creaJuegos();
	compu.codigo();
	System.out.println("");
	System.out.println("**TELEFONO**");
	cel1.nombre();
	cel1.conexion();
	cel1.voltaje();
	cel1.watts();
	cel1.llamada();
	cel1.camara();
	
	 
 }
}
