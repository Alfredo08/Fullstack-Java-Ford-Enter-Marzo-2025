package com.alfredosalazar.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.alfredosalazar.modelos.Pelicula;
import com.alfredosalazar.servicios.ServicioPeliculas;

import jakarta.validation.Valid;

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
	
	@GetMapping("/detalle/pelicula/{peliculaId}")
	public String detallePelicula(@PathVariable("peliculaId") Long peliculaId,
								 Model modelo) {
		Pelicula peliculaActual = this.servicioPeliculas.obtenerPorId(peliculaId);
		
		if(peliculaActual == null) {
			return "redirect:/peliculas";
		}
		
		modelo.addAttribute("pelicula", peliculaActual);
		return "detallePelicula.jsp";
	}
	
	@GetMapping("/formulario/pelicula")
	public String formularioPelicula(@ModelAttribute("pelicula") Pelicula pelicula) {
		return "formularioPelicula.jsp";
	}
	
	@GetMapping("/formulario/editar/pelicula/{peliculaId}")
	public String formularioEditarPelicula(@ModelAttribute("pelicula") Pelicula pelicula,
										   @PathVariable("peliculaId") Long peliculaId,
										   Model modelo){
		Pelicula peliculaActual = this.servicioPeliculas.obtenerPorId(peliculaId);
		
		if(peliculaActual == null) {
			return "redirect:/peliculas";
		}
		
		modelo.addAttribute("pelicula", peliculaActual);
		
		return "formularioEditarPelicula.jsp";
	}
	
	@PostMapping("/agregar/pelicula")
	public String agregarPelicula(@Valid @ModelAttribute("pelicula") Pelicula nuevaPelicula,
								  BindingResult validaciones) {
		// En caso de algún error en el formulario, devolverlo y se desplegarán los errores
		if(validaciones.hasErrors()) {
			return "formularioPelicula.jsp";
		}
		// No hubo errores entonces agregamos el objeto a la BD y luego redireccionamos a otra ruta
		this.servicioPeliculas.insertarPelicula(nuevaPelicula);
		return "redirect:/peliculas";
	}
	
	@DeleteMapping("/eliminar/pelicula/{peliculaId}")
	public String eliminarPelicula(@PathVariable("peliculaId") Long peliculaId) {
		this.servicioPeliculas.eliminarPorId(peliculaId);
		return "redirect:/peliculas";
	}
	
	@PutMapping("/editar/pelicula/{peliculaId}")
	public String editarPelicula(@Valid @ModelAttribute("pelicula") Pelicula pelicula,
								 BindingResult validaciones,
								 @PathVariable("peliculaId") Long peliculaId) {
		if(validaciones.hasErrors()) {
			return "formularioEditarPelicula.jsp";
		}
		
		// Obtenemos lo que se encuentra en la base de datos (Porque queremos su ID)
		Pelicula peliculaActual = this.servicioPeliculas.obtenerPorId(peliculaId);
		
		// Al objeto del formulario de edición le asignamos ese ID
		pelicula.setId(peliculaActual.getId());
		
		// Ejecutar el servicio para actualizar los datos
		this.servicioPeliculas.actualizarPelicula(pelicula);
		
		return "redirect:/peliculas";
	}
	
}
