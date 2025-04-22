package com.alfredosalazar;

import com.alfredosalazar.clases.Estudiante;
import com.alfredosalazar.clases.Persona;

public class Aplicacion {

	public static void main(String[] args) {
		Persona alexPersona = new Persona("Alex", "Miller", "Robinson", 30, "Americana");
		alexPersona.imprimeInformacion();
		System.out.println("-----");
		Estudiante marthaEstudiante = new Estudiante("Martha", "Gómez", "Sanchez", 21, 
													"Chilena", "Java", 12345);
		marthaEstudiante.imprimeInformacion();

	}

}
