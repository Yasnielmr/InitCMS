package com.cms.init.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cms.init.model.Contenido;

public class ContenidoMapper implements RowMapper<Contenido> {

	@Override
	public Contenido mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Contenido contenido= new Contenido();
		contenido.setIdContenido(rs.getLong("IdContenido"));
		contenido.setTipo(rs.getString("Tipo"));
		contenido.setContenido(rs.getString("Contenido"));
		contenido.setIdPost(rs.getLong("IdPost"));		
		
		return contenido;
	}

}
