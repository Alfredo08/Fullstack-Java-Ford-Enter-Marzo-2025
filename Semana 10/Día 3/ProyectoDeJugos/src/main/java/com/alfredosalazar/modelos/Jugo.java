package com.alfredosalazar.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="jugos")
public class Jugo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Por favor proporciona el nombre del jugo.")
	@Size(min=5, message="El nombre debe de contener al menos 5 letras.")
	private String nombre;
	
	@NotBlank(message = "Por favor proporciona la descripción.")
	@Size(min=10, message="La descripción debe de contener al menos 10 letras.")
	private String descripcion;
	
	@NotBlank(message = "Por favor proporciona los ingredientes.")
	@Size(min=10, message="Los ingredientes deben de contener al menos 10 letras.")
	private String ingredientes;
	
	@NotBlank(message = "Por favor proporciona las instrucciones.")
	@Size(min=10, message="Las instrucciones deben de contener al menos 10 letras.")
	private String instrucciones;
	
	@NotBlank(message = "Por favor proporciona la URL de la imagen.")
	private String urlImagen;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_actualizacion")
	private Date fechaActualizacion;
	
	public Jugo() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	
	@PrePersist
	protected void onCreate() {
		this.fechaCreacion = new Date();
		this.fechaActualizacion = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.fechaActualizacion = new Date();
	}
}
