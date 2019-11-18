package com.cms.init.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cms.init.model.Post;

public class PostMapper implements RowMapper<Post>{

	@Override
	public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Post post= new Post();
		post.setIdPost(rs.getLong("IdPost"));
		post.setTitulo(rs.getString("Titulo"));
		post.setSlug(rs.getString("Slug"));
		post.setExtracto(rs.getString("Extracto")); 
		post.setIdUsuario(rs.getLong("IdUsuario"));
		post.setCategoria(rs.getLong("Categoria")); 
		post.setImagenDestacada(rs.getString("ImagenDestacada")); 
		post.setTipo(rs.getString("Tipo")); 
		
		return post;
	}

}
