package com.cms.init.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cms.init.model.Permiso;

public class PermisoMapper implements RowMapper<Permiso> {

	@Override
	public Permiso mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Permiso permiso= new Permiso();
		permiso.setIdPermiso(rs.getLong("IdPermiso"));
		permiso.setNombre(rs.getString("Nombre"));
		
		return permiso;
	}

}
