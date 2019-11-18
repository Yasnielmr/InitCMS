package com.cms.init.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cms.init.model.PostMetaData;

public class PostMetaDataMapper implements RowMapper<PostMetaData>{

	@Override
	public PostMetaData mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		PostMetaData postMetaData= new PostMetaData();
		postMetaData.setIdPostMetaData(rs.getLong("IdPostMetaData"));
		postMetaData.setIdPost(rs.getLong("IdPost"));
		postMetaData.setClave(rs.getString("Clave"));
		postMetaData.setValor(rs.getString("Valor"));
		postMetaData.setTipo(rs.getString("Tipo"));
		
		return postMetaData;
	}

}
