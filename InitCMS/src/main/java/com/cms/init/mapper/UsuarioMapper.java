package com.cms.init.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cms.init.model.Usuario;

public class UsuarioMapper implements RowMapper<Usuario> {

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Usuario usuario= new Usuario();
		usuario.setIdUsuario(rs.getLong("IdUsuario"));
		usuario.setNombre(rs.getString("Nombre"));
		usuario.setApellidos(rs.getString("Apellidos"));
		usuario.setContrasenna(rs.getString("Contrasenna"));
		usuario.setCorreo(rs.getString("Correo"));
		usuario.setIdGrupo(rs.getLong("IdGrupo"));

		return usuario;
	}

}
