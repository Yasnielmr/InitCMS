package com.cms.init.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cms.init.model.GrupoPermiso;

public class GrupoPermisoMapper implements RowMapper<GrupoPermiso> {

	@Override
	public GrupoPermiso mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		GrupoPermiso grupoPermiso= new GrupoPermiso();
		grupoPermiso.setIdGrupo(rs.getLong("IdGrupo"));
		grupoPermiso.setIdPermiso(rs.getLong("IdPermiso"));
		
		return grupoPermiso;
	}

}
