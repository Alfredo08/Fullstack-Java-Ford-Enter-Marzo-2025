package com.alfredosalazar.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alfredosalazar.modelos.Pelicula;

@Repository
public interface RepositorioPeliculas extends CrudRepository<Pelicula, Long>{
	/*
	 * SELECT *
	 * FROM peliculas;
	 */
	List<Pelicula> findAll();
	
	/*
	 * INSERT INTO peliculas(Pelicula p)
	 * VALUES(p);
	 */
	Pelicula save(Pelicula peliculaNueva);
	
	/*
	 * SELECT *
	 * FROM peliculas
	 * WHERE id = peliculaId;
	 */
	// Pelicula findById(Long id);
	
	/*
	 * DELETE FROM peliculas
	 * WHERE id = peliculaId;
	 */
	void deleteById(Long id);
}
