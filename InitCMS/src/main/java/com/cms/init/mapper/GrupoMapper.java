package com.cms.init.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cms.init.model.Grupo;

public class GrupoMapper implements RowMapper<Grupo> {

	@Override
	public Grupo mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Grupo grupo= new Grupo();
		grupo.setIdGrupo(rs.getLong("IdGrupo"));
		grupo.setNombre(rs.getString("Nombre"));
		
		return grupo;
	}

}
