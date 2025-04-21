package com.alfredosalazar.clases;

public class Libro {
	private String titulo;
	private String autor;
	private double precioDeReemplazo;
	
	public Libro(String titulo, String autor, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precioDeReemplazo = precio;
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

	public double getPrecioDeReemplazo() {
		return precioDeReemplazo;
	}

	public void setPrecioDeReemplazo(double precioDeReemplazo) {
		this.precioDeReemplazo = precioDeReemplazo;
	}
}
