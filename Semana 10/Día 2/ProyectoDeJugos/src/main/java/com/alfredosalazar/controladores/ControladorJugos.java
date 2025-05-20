package com.alfredosalazar.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
	public String jugos(Model modelo, HttpSession sesion) {
		if(sesion.getAttribute("id_usuario") == null) {
			return "redirect:/login";
		}
		List<Jugo> listaJugos = this.servicioJugos.obtenerTodosLosJugos();
		modelo.addAttribute("listaJugos", listaJugos);
		return "jugos.jsp";
	}
	
	@GetMapping("/formulario/jugo")
	public String formularioJugo(@ModelAttribute("jugo") Jugo jugo,
								 HttpSession sesion) {
		if(sesion.getAttribute("id_usuario") == null) {
			return "redirect:/login";
		}
		return "formularioJugo.jsp";
	}
	
	@GetMapping("/detalle/jugo/{idJugo}")
	public String detalleJugo(@PathVariable("idJugo") Long idJugo,
							  Model modelo,
							  HttpSession sesion) {
		if(sesion.getAttribute("id_usuario") == null) {
			return "redirect:/login";
		}
		Jugo jugo = this.servicioJugos.obtenerPorId(idJugo);
		modelo.addAttribute("jugo", jugo);
		return "detalleJugo.jsp";
	}
	
	@GetMapping("/formulario/editar/jugo/{idJugo}")
	public String formularioEditarJugo(@ModelAttribute("jugo") Jugo jugo,
									   @PathVariable("idJugo") Long idJugo,
									   Model modelo,
									   HttpSession sesion) {
		if(sesion.getAttribute("id_usuario") == null) {
			return "redirect:/login";
		}
		jugo = this.servicioJugos.obtenerPorId(idJugo);
		modelo.addAttribute("jugo", jugo);
		return "editarFormularioJugo.jsp";
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
	
	@DeleteMapping("/eliminar/jugo/{idJugo}")
	public String eliminarJugo(@PathVariable("idJugo") Long idJugo) {
		this.servicioJugos.eliminarJugo(idJugo);
		return "redirect:/jugos";
	}
	
	@PutMapping("/editar/jugo/{idJugo}")
	public String editarJugo(@Valid @ModelAttribute("jugo") Jugo jugo,
							 BindingResult validaciones,
							 @PathVariable("idJugo") Long idJugo) {
		if(validaciones.hasErrors()) {
			return "editarFormularioJugo.jsp";
		}
		
		Jugo jugoActual = this.servicioJugos.obtenerPorId(idJugo);
		jugo.setId(jugoActual.getId());
		
		this.servicioJugos.editarJugo(jugo);
		return "redirect:/jugos";
	}
}
