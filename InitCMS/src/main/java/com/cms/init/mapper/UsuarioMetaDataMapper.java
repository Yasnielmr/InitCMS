package com.cms.init.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cms.init.model.UsuarioMetaData;

public class UsuarioMetaDataMapper implements RowMapper<UsuarioMetaData>{

	@Override
	public UsuarioMetaData mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		UsuarioMetaData usuarioMetaData= new UsuarioMetaData();
		usuarioMetaData.setIdUsuarioMetaData(rs.getLong("IdUsuarioMetaData"));
		usuarioMetaData.setIdUsuario(rs.getLong("IdUsuario"));
		usuarioMetaData.setClave(rs.getString("Clave"));
		usuarioMetaData.setValor(rs.getString("Valor"));
		usuarioMetaData.setTipo(rs.getString("Tipo"));
		
		return usuarioMetaData;
	}

}
