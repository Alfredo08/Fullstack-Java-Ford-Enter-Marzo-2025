package com.alfredosalazar.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alfredosalazar.modelos.Director;
import com.alfredosalazar.modelos.LoginDirector;
import com.alfredosalazar.servicios.ServicioDirectores;

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
								  BindingResult validaciones) {
		if(! director.getContrasenia().equals(director.getConfirmarContrasenia())) {
			validaciones.rejectValue("confirmarContrasenia", "contraseniaNoCoincide", 
									 "Las contraseñas no coinciden.");
		}
		if(validaciones.hasErrors()) {
			return "registro.jsp";
		}
		// Agregar el director a la base de datos
		// Pendiente: agregar el ID del director en sesión
		this.servicioDirectores.agregarDirector(director);
		
		return "redirect:/peliculas";
	}
	
	@PostMapping("/procesa/login")
	public String procesaLogin(@Valid @ModelAttribute("loginDirector") LoginDirector loginDirector,
							   BindingResult validaciones) {
		Director directorActual = this.servicioDirectores.obtenerDirectorPorCorreo(loginDirector.getCorreo());
		
		if(directorActual == null) {
			validaciones.rejectValue("correo", "correoNoExistente", "Correo incorrecto.");
		}
		else {
			if(! directorActual.getContrasenia().equals(loginDirector.getContrasenia())) {
				validaciones.rejectValue("contrasenia", "contraseniaNoCoincide", "Credenciales incorrectas.");
			}
			
		}
		
		if(validaciones.hasErrors()) {
			return "login.jsp";
		}
		// Pendiente: agregar el ID del director en sesión
		return "redirect:/peliculas";
	}
}
