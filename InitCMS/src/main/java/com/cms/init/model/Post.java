package com.cms.init.model;

public class Post {
	
	private Long IdPost;
	private String Titulo;
	private String Slug;
	private String Extracto;
	private Long IdUsuario;
	private Long Categoria;
	private String ImagenDestacada;
	private String Tipo;
	
	public Long getIdPost() {
		return IdPost;
	}
	public void setIdPost(Long idPost) {
		IdPost = idPost;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getSlug() {
		return Slug;
	}
	public void setSlug(String slug) {
		Slug = slug;
	}
	public String getExtracto() {
		return Extracto;
	}
	public void setExtracto(String extracto) {
		Extracto = extracto;
	}
	public Long getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		IdUsuario = idUsuario;
	}
	public Long getCategoria() {
		return Categoria;
	}
	public void setCategoria(Long categoria) {
		Categoria = categoria;
	}
	public String getImagenDestacada() {
		return ImagenDestacada;
	}
	public void setImagenDestacada(String imagenDestacada) {
		ImagenDestacada = imagenDestacada;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	

}
