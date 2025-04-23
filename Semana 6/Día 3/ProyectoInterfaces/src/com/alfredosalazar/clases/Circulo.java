package com.alfredosalazar.clases;

import com.alfredosalazar.interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica{
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public void imprimeInformacion() {
		System.out.println("Figura geométrica: Círculo");
		System.out.println("Radio: " + this.radio);
		System.out.println("Área: " + this.area());
		System.out.println("Perímetro: " + this.perimetro());	
	}

	@Override
	public double area() {	
		return Math.PI * Math.pow(this.radio, 2);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * this.radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
}
