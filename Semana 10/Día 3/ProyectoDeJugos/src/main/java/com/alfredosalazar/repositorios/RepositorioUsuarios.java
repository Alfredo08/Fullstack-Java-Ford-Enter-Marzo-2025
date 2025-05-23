package com.alfredosalazar.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alfredosalazar.modelos.Usuario;

@Repository
public interface RepositorioUsuarios extends CrudRepository<Usuario, Long> {
	Usuario save(Usuario usuario);
	Usuario findByCorreo(String correo);
}
