package com.alfredosalazar.clases;

import java.util.ArrayList;

public class Prestamo {
	private String nombre;
	private ArrayList<Libro> libros;
	private boolean estatus;
	
	private static ArrayList<Prestamo> listaDePrestamos = new ArrayList<Prestamo>();
	
	public Prestamo() {
		this.nombre = "Invitado";
		this.libros = new ArrayList<Libro>();
		this.estatus = true;
		this.listaDePrestamos.add(this);
	}
	
	public Prestamo(String nombre, boolean estatus) {
		this.nombre = nombre;
		this.estatus = estatus;
		this.libros = new ArrayList<Libro>();
		this.listaDePrestamos.add(this);
	}
	
	public void agregarLibro(Libro libro) {
		this.libros.add(libro);
	}
	
	public String mostrarEstatus() {
		if(this.estatus) {
			return "Préstamo activo"; 
		}
		else {
			return "Préstamo expirado";
		}
	}
	
	public void mostrarDetallesDelPrestamo() {
		System.out.println("*********");
		System.out.println("Nombre del usuario: " + this.nombre);
		System.out.println("Estatus del préstamo: " + this.mostrarEstatus());
		System.out.println("Lista de libros");
		
		for(Libro libro : this.libros) {
			System.out.println("Título: " + libro.getTitulo());
			System.out.println("Autor: " + libro.getAutor());
			System.out.println("Precio de reemplazo: " + libro.getPrecioDeReemplazo());
			System.out.println("--------");
		}
		System.out.println("");
	}
	
	public double calcularTotalDeReemplazo() {
		double suma = 0.0;
	
		for(Libro libro : this.libros) {
			suma += libro.getPrecioDeReemplazo();
		}
		
		return suma;
	}
	
	public static void imprimeTodosLosPrestamos() {
		for(Prestamo prestamo : Prestamo.listaDePrestamos) {
			prestamo.mostrarDetallesDelPrestamo();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
}
