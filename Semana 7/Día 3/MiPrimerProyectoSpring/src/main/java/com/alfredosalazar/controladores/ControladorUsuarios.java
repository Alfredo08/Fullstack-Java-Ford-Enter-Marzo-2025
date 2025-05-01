package com.alfredosalazar.controladores;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorUsuarios {
	
	public static ArrayList<String> usuarios = new ArrayList<String>();
	
	public ControladorUsuarios() {
		usuarios.add("Alex Miller");
		usuarios.add("Martha Gómez");
		usuarios.add("Julieta Vargas");
		usuarios.add("Roger Anderson");
		usuarios.add("Miguel López");
	}
	
	@GetMapping("/usuarios")
	public String usuarios() {
		
		String listaCompleta = "";
		
		for(int i = 0; i < usuarios.size(); i ++) {
			listaCompleta += "<li>" + usuarios.get(i) + "</li>";
		}
		
		return "<ul>" + listaCompleta + "</ul>";
	}
	
	// http://localhost:8080/usuario/1
	@GetMapping("/usuario/{indiceDeUsuario}")
	public String usuarioPorIndice(@PathVariable("indiceDeUsuario") int indiceDeUsuario) {
		if(indiceDeUsuario >= usuarios.size()) {
			return "El índice " + indiceDeUsuario + " no existe en nuestra lista!";
		}
		return usuarios.get(indiceDeUsuario);
	}
	
	// http://localhost:8080/usuarioConsulta?indice=1
	@GetMapping("/usuarioConsulta")
	public String usuarioPorParametroConstulta(@RequestParam("indice") int indice) {
		if(indice >= usuarios.size()) {
			return "El índice " + indice + " no existe en nuestra lista!";
		}
		return usuarios.get(indice);
	}
	
}
