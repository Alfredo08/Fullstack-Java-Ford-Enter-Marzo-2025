package com.alfredosalazar.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class ControladorPersona {
	
	@GetMapping("/inicio")
	public String inicio() {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession sesion) {
		String nombreCompleto = (String)sesion.getAttribute("nombreCompleto");
		if(nombreCompleto == null) {
			return "redirect:/inicio";
		}
		return "dashboard.jsp";
	}
	
	@PostMapping("/procesa/informacion")
	public String procesaInformacion(@RequestParam("nombre") String nombre,
									 @RequestParam("apellidoPaterno") String apellidoPaterno,
									 @RequestParam("apellidoMaterno") String apellidoMaterno,
									 HttpSession sesion,
									 RedirectAttributes flash) {
		boolean hayError = false;
		
		if(nombre.length() < 3) {
			flash.addFlashAttribute("errorNombre", "Por favor proporciona tu nombre.");
			hayError = true;
		}
		
		if(apellidoPaterno.length() < 3) {
			flash.addFlashAttribute("errorApellidoPaterno", "Por favor proporciona tu apellido paterno.");
			hayError = true;
		}
		
		if(apellidoMaterno.length() < 3) {
			flash.addFlashAttribute("errorApellidoMaterno", "Por favor proporciona tu apellido materno.");
			hayError = true;
		}
		
		if(hayError) {
			return "redirect:/inicio";
		}
		
		sesion.setAttribute("nombreCompleto", nombre + " " + apellidoPaterno + " " + apellidoMaterno);
		return "redirect:/dashboard";
	}
	
	@PostMapping("/procesa/cerrar-sesion")
	public String procesaCerrarSesion(HttpSession sesion) {
		sesion.invalidate();
		return "redirect:/inicio";
	}
	
}
