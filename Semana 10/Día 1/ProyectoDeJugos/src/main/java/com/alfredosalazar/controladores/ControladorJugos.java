package com.alfredosalazar.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alfredosalazar.modelos.Jugo;
import com.alfredosalazar.modelos.Usuario;
import com.alfredosalazar.servicios.ServicioJugos;
import com.alfredosalazar.servicios.ServicioUsuarios;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorJugos {
	@Autowired
	private final ServicioJugos servicioJugos;
	private final ServicioUsuarios servicioUsuarios;
	
	public ControladorJugos(ServicioJugos servicioJugos, ServicioUsuarios servicioUsuarios) {
		this.servicioJugos = servicioJugos;
		this.servicioUsuarios = servicioUsuarios;
	}
	
	@GetMapping("/jugos")
	public String jugos(Model modelo) {
		List<Jugo> listaJugos = this.servicioJugos.obtenerTodosLosJugos();
		modelo.addAttribute("listaJugos", listaJugos);
		return "jugos.jsp";
	}
	
	@GetMapping("/formulario/jugo")
	public String formularioJugo(@ModelAttribute("jugo") Jugo jugo) {
		return "formularioJugo.jsp";
	}
	
	@PostMapping("/agregar/jugo")
	public String agregarJugo(@Valid @ModelAttribute("jugo") Jugo jugo,
							  BindingResult validaciones,
							  HttpSession sesion) {
		if(validaciones.hasErrors()) {
			return "formularioJugo.jsp";
		}
		Long idUsuario = (Long) sesion.getAttribute("id_usuario");
		Usuario usuarioExistente = this.servicioUsuarios.obtenerUsuarioPorId(idUsuario);
		jugo.setUsuario(usuarioExistente);
		this.servicioJugos.agregarJugo(jugo);
		
		return "redirect:/jugos";
	}
}
