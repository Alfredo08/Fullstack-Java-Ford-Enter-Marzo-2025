package com.alfredosalazar.clases;

import com.alfredosalazar.interfaces.FiguraGeometrica;

public class Cuadrado implements FiguraGeometrica{
	private double longitud;
	
	public Cuadrado(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public void imprimeInformacion() {
		System.out.println("Figura geométrica: Cuadrado");
		System.out.println("Longitud de cada lado: " + this.longitud);
		System.out.println("Área: " + this.area());
		System.out.println("Perímetro: " + this.perimetro());
	}

	@Override
	public double area() {
		return this.longitud * this.longitud;
	}

	@Override
	public double perimetro() {
		return this.longitud * 4;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
}
