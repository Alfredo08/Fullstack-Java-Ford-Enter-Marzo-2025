package com.alfredosalazar.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfredosalazar.modelos.Jugo;
import com.alfredosalazar.repositorios.RepositorioJugos;

@Service
public class ServicioJugos {
	@Autowired
	private final RepositorioJugos repositorioJugos;
	
	public ServicioJugos(RepositorioJugos repositorioJugos) {
		this.repositorioJugos = repositorioJugos;
	}
	
	public Jugo agregarJugo(Jugo jugoNuevo) {
		return this.repositorioJugos.save(jugoNuevo);
	}
	
	public List<Jugo> obtenerTodosLosJugos(){
		return this.repositorioJugos.findAll();
	}
}
