package com.apirest.wallapop.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Producto {
	private int id;
	private String denominacion;
	private String email_vendedor;
	private String email_comprador;
	private Categoria categoria;
	private Date fechasubida;
	private int precio;
	//private Date fechacompra;
	
	
	public Producto(int id, String denominacion, String email_vendedor, String email_comprador, Categoria categoria,
			Date fechasubida, int precio) {
		super();
		this.id = id;
		this.denominacion = denominacion;
		this.email_vendedor = email_vendedor;
		this.email_comprador = email_comprador;
		this.categoria = categoria;
		this.fechasubida = fechasubida;
		this.precio = precio;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public String getEmail_vendedor() {
		return email_vendedor;
	}
	public void setId_vendedor(String email_vendedor) {
		this.email_vendedor = email_vendedor;
	}
	public String getEmail_comprador() {
		return email_comprador;
	}
	public void setId_comprador(String email_comprador) {
		this.email_comprador = email_comprador;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Date getFechasubida() {
		return fechasubida;
	}
	public void setFechasubida(Date fechasubida) {
		this.fechasubida = fechasubida;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
