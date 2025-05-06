package com.alfredosalazar.controladores;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorPersonas {
	
public static ArrayList<String> personas = new ArrayList<String>();
	
	public ControladorPersonas() {
		personas.add("Alex Miller");
		personas.add("Martha Gómez");
		personas.add("Julieta Vargas");
		personas.add("Roger Anderson");
		personas.add("Miguel López");
	}
	
	@GetMapping("/personas")
	public String listaPersonas(Model modelo) {
		// modelo.addAttribute("nombreCompleto", "Alejandro Miller");
		modelo.addAttribute("personas", personas);
		String urlImagen = "https://www.kia.com/content/dam/kwcms/gt/en/images/discover-kia/voice-search/parts-80-1.jpg";
		modelo.addAttribute("imagen", urlImagen);
		return "index.jsp";
	}
	
	@GetMapping("/formulario/persona")
	public String formularioPersona() {
		return "formularioPersona.jsp";
	}
	
	@PostMapping("/agregar/persona")
	public String agregarPersona(@RequestParam("nombre") String nombre,
								 @RequestParam("apellido") String apellido) {
		personas.add(nombre + " " + apellido);
		return "redirect:/personas";
	}
}
