package com.alfredosalazar.servicios;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfredosalazar.modelos.Usuario;
import com.alfredosalazar.repositorios.RepositorioUsuarios;

@Service
public class ServicioUsuarios {
	@Autowired
	private final RepositorioUsuarios repositorioUsuarios;
	
	public ServicioUsuarios(RepositorioUsuarios repositorioUsuarios) {
		this.repositorioUsuarios = repositorioUsuarios;
	}
	
	public Usuario agregarUsuario(Usuario nuevoUsuario) {
		String contraseniaEncriptada = BCrypt.hashpw(nuevoUsuario.getContrasenia(), 
													 BCrypt.gensalt());
		nuevoUsuario.setContrasenia(contraseniaEncriptada);
		return this.repositorioUsuarios.save(nuevoUsuario);
	}
	
	public Usuario obtenerUsuarioPorCorreo(String correo) {
		return this.repositorioUsuarios.findByCorreo(correo);
	}
	
	public Usuario obtenerUsuarioPorId(Long idUsuario) {
		return this.repositorioUsuarios.findById(idUsuario).orElse(null);
	}
}
