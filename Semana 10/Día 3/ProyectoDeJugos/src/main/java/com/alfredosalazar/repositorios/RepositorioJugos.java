package com.alfredosalazar.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alfredosalazar.modelos.Jugo;

import jakarta.transaction.Transactional;

@Repository
public interface RepositorioJugos extends CrudRepository<Jugo, Long> {
	Jugo save(Jugo jugo);
	List<Jugo> findAll();
	void deleteById(Long id);
	
	@Transactional
	@Modifying
	@Query(value="DELETE FROM jugos WHERE id = ?1", nativeQuery = true)
	int eliminarJugo(Long id);
	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO jugos(nombre, descripcion, ingredientes, instrucciones, url_imagen, id_usuario)" + 
				 "VALUES(?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
	void insertarJugo(String nombre, String descripcion, 
					  String ingredientes, String instrucciones, 
					  String urlImagen, Long idUsuario);
	
	@Query(value="SELECT * FROM jugos", nativeQuery = true)
	List<Jugo> seleccionarJugos();
}
