package com.alfredosalazar.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfredosalazar.modelos.Pelicula;
import com.alfredosalazar.repositorios.RepositorioPeliculas;

@Service
public class ServicioPeliculas {
	@Autowired
	private final RepositorioPeliculas repositorioPeliculas;
	
	public ServicioPeliculas(RepositorioPeliculas repositorioPeliculas) {
		this.repositorioPeliculas = repositorioPeliculas;
	}
	
	public List<Pelicula> obtenerTodasLasPeliculas(){
		return this.repositorioPeliculas.findAll();
	}
	
	public Pelicula insertarPelicula(Pelicula nuevaPelicula) {
		return this.repositorioPeliculas.save(nuevaPelicula);
	}
	
	public Pelicula obtenerPorId(Long peliculaId) {
		return this.repositorioPeliculas.findById(peliculaId).orElse(null);
	}
}
