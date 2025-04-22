package com.alfredosalazar.clases;

public class Estudiante extends Persona{
	private String curso;
	private int id;
	
	public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, 
					 int edad, String nacionalidad, String curso, int id) {
		// Ejecutar el constructor de la clase Padre
		super(nombre, apellidoPaterno, apellidoMaterno, edad, nacionalidad);
		this.curso = curso;
		this.id = id;
	}
	
	/*
	public void imprimeInformacionEstudiante() {
		super.imprimeInformacion();
		System.out.println("Curso: " + this.curso);
		System.out.println("Id: " + this.id);
	} */
	
	@Override
	public void imprimeInformacion() {
		System.out.println("Curso: " + this.curso);
		System.out.println("Id: " + this.id);
		super.imprimeInformacion();
	}
}
