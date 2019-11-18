package com.cms.init.model;

public class UsuarioMetaData {
	
	private Long IdUsuarioMetaData;
	private Long IdUsuario;
	private String Clave;
	private String Valor;
	private String Tipo;
	
	public Long getIdUsuarioMetaData() {
		return IdUsuarioMetaData;
	}
	public void setIdUsuarioMetaData(Long idUsuarioMetaData) {
		IdUsuarioMetaData = idUsuarioMetaData;
	}
	public Long getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		IdUsuario = idUsuario;
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
