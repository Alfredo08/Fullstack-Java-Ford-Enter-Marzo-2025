package com.alfredosalazar.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alfredosalazar.modelos.Jugo;

@Repository
public interface RepositorioJugos extends CrudRepository<Jugo, Long> {
	Jugo save(Jugo jugo);
	List<Jugo> findAll();
}
