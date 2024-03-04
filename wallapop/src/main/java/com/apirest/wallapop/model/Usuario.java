package com.apirest.wallapop.model;

public class Usuario {
	private String email;
	private String nombre;
	private String contrasena;
	
	
	
	
	
	public Usuario(String email, String nombre, String contrasena) {
		super();
		this.email = email;
		this.nombre = nombre;
		this.contrasena = contrasena;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	

}
