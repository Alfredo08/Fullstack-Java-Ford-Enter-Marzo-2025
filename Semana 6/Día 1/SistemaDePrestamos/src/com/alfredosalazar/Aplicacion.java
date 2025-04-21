package com.alfredosalazar;

import com.alfredosalazar.clases.Libro;
import com.alfredosalazar.clases.Prestamo;

public class Aplicacion {

	public static void main(String[] args) {
		Prestamo prestamoUno = new Prestamo();
		Prestamo prestamoDos = new Prestamo();
		Prestamo prestamoAlex = new Prestamo("Alex Miller", true);
		Prestamo prestamoMartha = new Prestamo("Martha Gómez", false);
		Prestamo prestamoRoger = new Prestamo("Roger Anderson", true);
		
		Libro elReyDeRoma = new Libro("El rey de Roma.", "Pedro González", 3000.0);
		Libro elEclipse = new Libro("El eclipse.", "Pedro González", 4500.0);
		Libro comoProgramarEnJava = new Libro("¿Cómo programar en Java?", "Ana Mendoza", 2750.0);
		Libro recetarioDeCocina = new Libro("Recetario de cocina.", "Julieta Vargas", 1000.0);
		
		prestamoUno.agregarLibro(recetarioDeCocina);
		prestamoUno.agregarLibro(elEclipse);
		
		prestamoDos.agregarLibro(elReyDeRoma);

		prestamoAlex.agregarLibro(recetarioDeCocina);
		prestamoAlex.agregarLibro(elEclipse);
		prestamoAlex.agregarLibro(elReyDeRoma);
		prestamoAlex.agregarLibro(comoProgramarEnJava);
		
		prestamoMartha.agregarLibro(elEclipse);
		prestamoMartha.agregarLibro(elReyDeRoma);
		
		prestamoRoger.agregarLibro(comoProgramarEnJava);

		Prestamo.imprimeTodosLosPrestamos();
		
		double totalAPagar = prestamoMartha.calcularTotalDeReemplazo();
		System.out.println("Martha debe de pagar un total de:  $" + totalAPagar);
		prestamoAlex.setEstatus(false);
		totalAPagar = prestamoAlex.calcularTotalDeReemplazo();
		System.out.println("Alex debe de pagar un total de:  $" + totalAPagar);
	}

}
