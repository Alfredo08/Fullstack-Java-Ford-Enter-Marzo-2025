package com.alfredosalazar.controladores;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alfredosalazar.modelos.LoginUsuario;
import com.alfredosalazar.modelos.Usuario;
import com.alfredosalazar.servicios.ServicioUsuarios;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorUsuarios {
	
	@Autowired
	private final ServicioUsuarios servicioUsuarios;
	
	public ControladorUsuarios(ServicioUsuarios servicioUsuarios) {
		this.servicioUsuarios = servicioUsuarios;
	}

	@GetMapping("/registro")
	public String registro(@ModelAttribute("usuario") Usuario usuario) {
		return "registro.jsp";
	}
	
	@GetMapping("/login")
	public String login(@ModelAttribute("loginUsuario") LoginUsuario loginUsuario) {
		return "login.jsp";
	}
	
	@PostMapping("/agregar/usuario")
	public String agregarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario,
								 BindingResult validaciones,
								 HttpSession sesion) {
		// Validar que el correo sea único
		Usuario usuarioExistente = this.servicioUsuarios.obtenerUsuarioPorCorreo(usuario.getCorreo());
		if(usuarioExistente != null) {
			validaciones.rejectValue("correo", "correoExistente", "Este correo ya está en uso.");
		}
		
		if(! usuario.getContrasenia().equals(usuario.getConfirmarContrasenia())) {
			validaciones.rejectValue("confirmarContrasenia", "contraseniaNoCoincide", "Las contraseñas no coinciden.");
		}
		
		if(validaciones.hasErrors()) {
			return "registro.jsp";
		}
		
		// Crear el usuario en la base de datos
		Usuario nuevoUsuario = this.servicioUsuarios.agregarUsuario(usuario);
		sesion.setAttribute("id_usuario", nuevoUsuario.getId());
		sesion.setAttribute("nombre", usuario.getNombre() + " " + usuario.getApellido());
		
		return "redirect:/jugos";
	}
	
	@PostMapping("/procesa/login")
	public String procesaLogin(@Valid @ModelAttribute("loginUsuario") LoginUsuario loginUsuario,
							   BindingResult validaciones,
							   HttpSession sesion) {
		Usuario usuarioExistente = this.servicioUsuarios.obtenerUsuarioPorCorreo(loginUsuario.getCorreo());
		
		if(usuarioExistente == null) {
			validaciones.rejectValue("correo", "correoNoExistente", "Tu correo es inválido.");
		}
		else {
			if(! BCrypt.checkpw(loginUsuario.getContrasenia(), usuarioExistente.getContrasenia())) {
				validaciones.rejectValue("contrasenia", "credencialesIncorrectas", "Credenciales incorrectas");
			}
		}
		
		if(validaciones.hasErrors()) {
			return "login.jsp";
		}
		sesion.setAttribute("id_usuario", usuarioExistente.getId());
		sesion.setAttribute("nombre", usuarioExistente.getNombre() + " " + usuarioExistente.getApellido());
		
		return "redirect:/jugos";
	}
}
