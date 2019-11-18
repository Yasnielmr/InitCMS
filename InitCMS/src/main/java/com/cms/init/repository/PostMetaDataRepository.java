package com.cms.init.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cms.init.mapper.PermisoMapper;
import com.cms.init.mapper.PostMetaDataMapper;
import com.cms.init.model.PostMetaData;

@Repository
public class PostMetaDataRepository implements PostMetaDataRep{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(PostMetaData postMetaData) {
		// TODO Auto-generated method stub
		try {
			String sql= String.format("insert into PostMetaData (IdPostMetaData, Clave, Valor, Tipo, IdPost) " 
		    + "values('%d', '%s', '%s', '%s', '%d')" , 
		    postMetaData.getIdPostMetaData(), postMetaData.getClave(), postMetaData.getValor(), postMetaData.getTipo(), postMetaData.getIdPost());
			jdbcTemplate.execute(sql);
			return true;
		} 
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(PostMetaData postMetaData) {
		// TODO Auto-generated method stub
		if(postMetaData.getIdPostMetaData() != 0) {		
			String sql= String.format("update PostMetaData set IdPostMetaData='%d', Clave='%s', Valor='%s', Tipo='%s', IdPost='%d' ) " +
		    "where IdPostMetaData='%d'",
		    postMetaData.getIdPostMetaData(), postMetaData.getClave(), postMetaData.getValor(), postMetaData.getTipo(), postMetaData.getIdPost());
			jdbcTemplate.execute(sql);
			return true;
	        }
		  return false;
	}

	@Override
	public List<PostMetaData> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from PostMetaDataMapper", new PostMetaDataMapper());
	}

	@Override
	public PostMetaData findById(int Id) {
		// TODO Auto-generated method stub
		Object [] params= new Object [] {Id};
		return jdbcTemplate.queryForObject("select * from PostMetaData where IdPostMetaData=?", params, new PostMetaDataMapper());
		
	}

}
