package com.cms.init.model;

import java.util.Date;

public class Comentario {
	
	private Long IdComentario;
	private String Cometario;
	private Date Fecha;
	private Long IdPost;
	private Long IdUsuario;
	private String Respuesta;
	
	public Long getIdComentario() {
		return IdComentario;
	}
	public void setIdComentario(Long idComentario) {
		IdComentario = idComentario;
	}
	public String getCometario() {
		return Cometario;
	}
	public void setCometario(String cometario) {
		Cometario = cometario;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public Long getIdPost() {
		return IdPost;
	}
	public void setIdPost(Long idPost) {
		IdPost = idPost;
	}
	public Long getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		IdUsuario = idUsuario;
	}
	public String getRespuesta() {
		return Respuesta;
	}
	public void setRespuesta(String respuesta) {
		Respuesta = respuesta;
	}
	
	

}
