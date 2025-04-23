package com.alfredosalazar;

import com.alfredosalazar.clases.Debito;

public class Aplicacion {

	public static void main(String[] args) {
		Debito cuentaAlex = new Debito("Alejandro Miller", "2734 9283 7485 9483", 20000.0);
		boolean estatus;
		
		cuentaAlex.imprimeInformacion();
		cuentaAlex.depositar(17000.0);
		System.out.println("-----");
		cuentaAlex.imprimeInformacion();
		estatus = cuentaAlex.retirar(30000.0);
		
		if(estatus) {
			System.out.println("Se retiró exitosamente el monto.");
		}
		cuentaAlex.imprimeInformacion();
		estatus = cuentaAlex.retirar(10000.0);
		
		if(estatus) {
			System.out.println("Se retiró exitosamente el monto.");
		}
		else {
			System.out.println("Fondos insuficientes.");
		}
		cuentaAlex.imprimeInformacion();

	}

}
