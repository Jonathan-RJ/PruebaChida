package COM;

public class Libro {

	private String  titulo, autor;
	private int numPag,isbn;
	
	public Libro() {
		
	}
	
	public Libro(int isbn, String titulo, String autor, int numPag) {
		this.isbn= isbn;
		this.autor=autor;
		this.numPag = numPag;
		this.titulo= titulo;
		
	}
	
	
	public void setIsbn(int isbn) {
		this.isbn=isbn;
		
	}
	public int getIsbn() {
		return isbn;
		
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
				
	}
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + ", isbn=" + isbn + "]";
	}
	
	
	
}
