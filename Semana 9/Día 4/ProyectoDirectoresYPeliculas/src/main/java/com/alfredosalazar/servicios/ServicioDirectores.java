package com.alfredosalazar.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfredosalazar.modelos.Director;
import com.alfredosalazar.repositorios.RepositorioDirectores;

@Service
public class ServicioDirectores {
	@Autowired
	private final RepositorioDirectores repositorioDirectores;
	
	public ServicioDirectores(RepositorioDirectores repositorioDirectores) {
		this.repositorioDirectores = repositorioDirectores;
	}
	
	public List<Director> obtenerTodosLosDirectores(){
		return this.repositorioDirectores.findAll();
	}
	
	public Director obtenerDirectorPorId(Long idDirector) {
		return this.repositorioDirectores.findById(idDirector).orElse(null);
	}
	
	public Director agregarDirector(Director director) {
		return this.repositorioDirectores.save(director);
	}
	
	public Director obtenerDirectorPorCorreo(String correo) {
		return this.repositorioDirectores.findByCorreo(correo);
	}
}
