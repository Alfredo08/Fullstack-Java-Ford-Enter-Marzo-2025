package com.alfredosalazar.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alfredosalazar.modelos.Pelicula;
import com.alfredosalazar.servicios.ServicioPeliculas;

@Controller
public class ControladorPeliculas {
	@Autowired
	private final ServicioPeliculas servicioPeliculas;
	
	public ControladorPeliculas(ServicioPeliculas servicioPeliculas) {
		this.servicioPeliculas = servicioPeliculas;
	}
	
	@GetMapping("/peliculas")
	public String peliculas(Model modelo) {
		List<Pelicula> listaDePeliculas = this.servicioPeliculas.obtenerTodasLasPeliculas();
		modelo.addAttribute("listaDePeliculas", listaDePeliculas);
		return "peliculas.jsp";
	}
	
}
