package com.cms.init.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cms.init.model.Comentario;

public class ComentarioMapper implements RowMapper<Comentario> {

	@Override
	public Comentario mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Comentario comentario= new Comentario();
		comentario.setIdComentario(rs.getLong("IdComentario"));
		comentario.setCometario(rs.getString("Comentaio"));
		comentario.setFecha(rs.getDate("Fecha"));
		comentario.setIdPost(rs.getLong("IdPost"));
		comentario.setIdUsuario(rs.getLong("IdUsuario"));
		comentario.setRespuesta(rs.getString("Respuesta"));
		
		return comentario;
	}
	

}
