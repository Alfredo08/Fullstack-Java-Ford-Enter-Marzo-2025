package com.alfredosalazar.clases;

public class Persona {
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int edad;
	private String nacionalidad;
	
	public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String nacionalidad) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
	}
	
	public void imprimeInformacion() {
		System.out.println("Nombre completo: " + this.nombre + " " +
							this.apellidoPaterno + " " +this.apellidoMaterno);
		System.out.println("Nacionalidad: " + this.nacionalidad);
		System.out.println("Edad: " + this.edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
}
