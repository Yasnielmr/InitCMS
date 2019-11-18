package com.cms.init.model;

public class PostMetaData {
	
	private Long IdPostMetaData;
	private Long IdPost;
	private String Clave;
	private String Valor;
	private String Tipo;
	
	public Long getIdPostMetaData() {
		return IdPostMetaData;
	}
	public void setIdPostMetaData(Long idPostMetaData) {
		IdPostMetaData = idPostMetaData;
	}
	public Long getIdPost() {
		return IdPost;
	}
	public void setIdPost(Long idPost) {
		IdPost = idPost;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String clave) {
		Clave = clave;
	}
	public String getValor() {
		return Valor;
	}
	public void setValor(String valor) {
		Valor = valor;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}

}
