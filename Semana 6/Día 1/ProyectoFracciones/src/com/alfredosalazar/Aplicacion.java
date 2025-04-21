package com.alfredosalazar;

public class Aplicacion {

	public static void main(String[] args) {
		Fraccion fraccion1 = new Fraccion();
        Fraccion fraccion2 = new Fraccion(7, 3);
        Fraccion fraccion3 = new Fraccion(3, 6);

        // fraccion1.imprimeFraccion();
        // fraccion2.imprimeFraccion();
        
        Fraccion resultado = Fraccion.sumaFracciones(fraccion1, fraccion2);
        // resultado.imprimeFraccion();
        
        Fraccion.imprimeListaDeFracciones();

	}

}
