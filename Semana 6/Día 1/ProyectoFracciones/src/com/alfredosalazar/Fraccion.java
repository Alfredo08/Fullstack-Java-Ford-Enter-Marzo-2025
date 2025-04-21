package com.alfredosalazar;

import java.util.ArrayList;

public class Fraccion {
	// Atributos de instancia
	private int numerador;
	private int denominador;

	// Atributos estáticos
	private static ArrayList<Fraccion> listaDeFracciones = new ArrayList<Fraccion>();
	
	// Constructores
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
		listaDeFracciones.add(this);
	}
	
	public Fraccion() {
		this.numerador = 5;
		this.denominador = 8;
		listaDeFracciones.add(this);
	}
	
	// Métodos de instancia
	public Fraccion imprimeFraccion(){
        System.out.println(this.numerador + "/" + this.denominador);
        return this;
    }

    public Fraccion sumaFracciones(Fraccion fraccion2){
        int nuevoNum = this.numerador * fraccion2.getDenominador() + fraccion2.getNumerador() * this.denominador;
        int nuevoDen = this.denominador * fraccion2.getDenominador();
        Fraccion nueva = new Fraccion(nuevoNum, nuevoDen);
        return nueva;
    }

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
    // Métodos estáticos
    public static Fraccion sumaFracciones(Fraccion fraccion1, Fraccion fraccion2) {
    	int nuevoNum = fraccion1.getNumerador() * fraccion2.getDenominador() + 
    					fraccion2.getNumerador() * fraccion1.getDenominador();
        int nuevoDen = fraccion1.getDenominador() * fraccion2.getDenominador();
        
        Fraccion nueva = new Fraccion(nuevoNum, nuevoDen);
        return nueva;
    }
    
    public static void imprimeListaDeFracciones(){
    	for(int i = 0; i < Fraccion.listaDeFracciones.size(); i ++) {
    		Fraccion.listaDeFracciones.get(i).imprimeFraccion();
    	}
    }
}
