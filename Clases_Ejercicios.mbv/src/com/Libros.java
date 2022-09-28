package com;

public class Libros {
	
	private String titulo;
	private String autor;
	private int ISBN;
	private int numPaginas;
	
	public Libros(String titulo, String autor, int iSBN, int numPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
		this.numPaginas = numPaginas;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	@Override
	public String toString() {
		return "El Libro con ISBN" + ISBN + ", de titulo" + titulo + ", del autor" + autor + ", con un num. de paginas" + numPaginas + "]";
	}
	
	}
	
	
	


