package com.cms.init.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cms.init.model.Categoria;

public class CategoriaMapper implements RowMapper<Categoria>{

	@Override
	public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Categoria categoria= new Categoria();
		categoria.setCategoriaSuperior(rs.getLong("CategoriaSuperior"));
		categoria.setIdCategoria(rs.getLong("IdCategoria"));
		categoria.setNombre(rs.getString("Nombre"));
		categoria.setDescripcion(rs.getString("Descripcion"));
		categoria.setFecha(rs.getDate("Fecha"));
		return categoria;
	}

}
