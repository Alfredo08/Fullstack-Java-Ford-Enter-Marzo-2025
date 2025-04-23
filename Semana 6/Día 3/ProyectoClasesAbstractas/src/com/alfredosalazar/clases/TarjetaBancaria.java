package com.alfredosalazar.clases;

public abstract class TarjetaBancaria {
	private double saldo;
	private static String nombreDelBanco = "Banco Central del Mundo";
	
	abstract void depositar(double cantidad);
	abstract boolean retirar(double cantidad);
	abstract void imprimeInformacion();
	
	public static void despliegaNombreDelBanco() {
		System.out.println(nombreDelBanco);
	}
}
