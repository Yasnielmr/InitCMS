package com.cms.init.model;

import java.util.Date;

public class Categoria {
	
	private Long IdCategoria;
	private String Nombre;
	private String Categoria;
	private Date fecha;
	private Long CategoriaSuperior;
	private String Descripcion;
	
	public Categoria() {
		
	}

	public Categoria(Long idCategoria, String nombre, String categoria, Date fecha, Long categoriaSuperior, String descripcion) {
		IdCategoria = idCategoria;
		Nombre = nombre;
		Categoria = categoria;
		this.fecha = fecha;
		CategoriaSuperior = categoriaSuperior;
		Descripcion= descripcion;
	}

	public Long getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		IdCategoria = idCategoria;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getCategoriaSuperior() {
		return CategoriaSuperior;
	}

	public void setCategoriaSuperior(Long categoriaSuperior) {
		CategoriaSuperior = categoriaSuperior;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Categoria [IdCategoria=" + IdCategoria + ", Nombre=" + Nombre + ", Categoria=" + Categoria + ", fecha="
				+ fecha + ", CategoriaSuperior=" + CategoriaSuperior + ", Descripcion=" + Descripcion + "]";
	}


}
