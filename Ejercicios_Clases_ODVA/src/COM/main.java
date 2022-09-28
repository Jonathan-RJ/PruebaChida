package COM;

import javax.swing.JOptionPane;

public class main {
	
	public static void main(String[] args) {
		
	
  Cuenta c1 = new Cuenta();
  Cuenta c2 = new Cuenta("Maria Lourdes ", 564657.67 );  

  c1.setTitular("Antonio Suarez ");
  c1.setCantidad(50435.657);
  System.out.println(c1.getTitular());
  c1.ingresar( 7874.564);
  System.out.println(c1.getTitular());
  c1.ingresar( 7874.564);
  System.out.println(c2.getTitular());
  c1.ingresar( 45654.564);
  c1.retirar(465464.4);
  System.out.println(c2.toString());
  
  
		
		Libro lib =  new Libro();
		Libro lib2 = new Libro();
		lib.setIsbn(673572657);
		lib.setTitulo("Los juegos del hambre");
		lib.setAutor("suzanne collins");
		lib.setNumPag(455);
		
		System.out.println(lib.toString());
		
		lib2.setIsbn(909574337);
		lib2.setTitulo("El monje que vendio su ferrari");
		lib2.setAutor("Robin zharma");
		lib2.setNumPag(235);
		
		
		if (lib.getNumPag()>lib2.getNumPag() ) {
			System.out.println("El libro " + lib.getTitulo() + " Tiene mas paginas que el libro " + lib2.getTitulo());
		}
		else {
			System.out.println("El libro " + lib2.getTitulo() + " Tiene mas paginas que el libro " + lib.getTitulo());

		}
		
		System.out.println(lib2.toString());
  
  
  Password p1 = new Password();
  p1.generaPassword(Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte la longitud de su contraseña")));
  System.out.println(p1.getContrasenia());
  System.out.println(p1.esFuerte());
  
  
  
	
	}
}
