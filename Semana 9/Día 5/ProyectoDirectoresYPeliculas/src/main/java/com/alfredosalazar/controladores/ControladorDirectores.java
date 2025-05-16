package com.alfredosalazar.controladores;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alfredosalazar.modelos.Director;
import com.alfredosalazar.modelos.LoginDirector;
import com.alfredosalazar.servicios.ServicioDirectores;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorDirectores {
	
	@Autowired
	private final ServicioDirectores servicioDirectores;
	
	public ControladorDirectores(ServicioDirectores servicioDirectores) {
		this.servicioDirectores = servicioDirectores;
	}

	@GetMapping("/registro")
	public String registro(@ModelAttribute("director") Director director) {
		return "registro.jsp";
		
	}
	
	@GetMapping("/login")
	public String login(@ModelAttribute("loginDirector") LoginDirector loginDirector) {
		return "login.jsp";
	}
	
	@PostMapping("/agregar/director")
	public String agregarDirector(@Valid @ModelAttribute("director") Director director,
								  BindingResult validaciones,
								  HttpSession sesion) {
		if(! director.getContrasenia().equals(director.getConfirmarContrasenia())) {
			validaciones.rejectValue("confirmarContrasenia", "contraseniaNoCoincide", 
									 "Las contraseñas no coinciden.");
		}
		if(validaciones.hasErrors()) {
			return "registro.jsp";
		}

		// Pendiente: agregar el ID del director en sesión
		Director directorActual = this.servicioDirectores.agregarDirector(director);
		sesion.setAttribute("id_director", directorActual.getId());
		sesion.setAttribute("nombre", directorActual.getNombre());
		sesion.setAttribute("apellidos", directorActual.getApellidos());
		
		return "redirect:/peliculas";
	}
	
	@PostMapping("/procesa/login")
	public String procesaLogin(@Valid @ModelAttribute("loginDirector") LoginDirector loginDirector,
							   BindingResult validaciones,
							   HttpSession sesion) {
		Director directorActual = this.servicioDirectores.obtenerDirectorPorCorreo(loginDirector.getCorreo());
		
		if(directorActual == null) {
			validaciones.rejectValue("correo", "correoNoExistente", "Correo incorrecto.");
		}
		else {
			if(! BCrypt.checkpw(loginDirector.getContrasenia(), directorActual.getContrasenia())) {
				validaciones.rejectValue("contrasenia", "contraseniaNoCoincide", "Credenciales incorrectas.");
			}
			
		}
		
		if(validaciones.hasErrors()) {
			return "login.jsp";
		}
		// Pendiente: agregar el ID del director en sesión
		sesion.setAttribute("id_director", directorActual.getId());
		sesion.setAttribute("nombre", directorActual.getNombre());
		sesion.setAttribute("apellidos", directorActual.getApellidos());
		return "redirect:/peliculas";
	}
	
	@PostMapping("/cerrar/sesion")
	public String cerrarSesion(HttpSession sesion) {
		sesion.invalidate();
		return "redirect:/login";
	}
}
