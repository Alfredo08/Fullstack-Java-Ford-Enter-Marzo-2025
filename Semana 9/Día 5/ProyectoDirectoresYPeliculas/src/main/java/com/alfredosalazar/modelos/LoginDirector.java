package com.alfredosalazar.modelos;

import jakarta.validation.constraints.Email;

public class LoginDirector {
	
	@Email(message="Por favor proporciona un correo válido.")
	private String correo;
	private String contrasenia;
	
	public LoginDirector() {}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
}
