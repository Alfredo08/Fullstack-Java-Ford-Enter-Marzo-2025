package com.alfredosalazar.clases;

public class Debito extends TarjetaBancaria {
	private String nombreCliente;
	private String numeroDeTarjeta;
	private double sueldo;
	
	public Debito(String nombreCliente, String numeroDeTarjeta, double sueldo) {
		this.nombreCliente = nombreCliente;
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.sueldo = sueldo;
	}

	@Override
	public void depositar(double cantidad) {
		this.sueldo += cantidad;
	}

	@Override
	public boolean retirar(double cantidad) {
		if(cantidad < this.sueldo) {
			this.sueldo -= cantidad;
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void imprimeInformacion() {
		this.despliegaNombreDelBanco();
		System.out.println("Tarjeta de débito");
		System.out.println("Nombre del cliente: " + this.nombreCliente);
		System.out.println("Número de la tarjeta: " + this.numeroDeTarjeta);
		System.out.println("Balance: " + this.sueldo);
	}
}
