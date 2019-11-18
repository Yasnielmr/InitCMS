package com.cms.init.model;

public class Usuario {

	private Long IdUsuario;
	private String Nombre;
	private String Apellidos;
	private String Contrasenna;
	private String Correo;
	private Long IdGrupo;
	
	public Long getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		IdUsuario = idUsuario;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getContrasenna() {
		return Contrasenna;
	}
	public void setContrasenna(String contrasenna) {
		Contrasenna = contrasenna;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public Long getIdGrupo() {
		return IdGrupo;
	}
	public void setIdGrupo(Long idGrupo) {
		IdGrupo = idGrupo;
	}
	
}
