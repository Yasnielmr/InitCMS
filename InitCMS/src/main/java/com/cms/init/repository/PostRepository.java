package com.cms.init.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cms.init.mapper.PostMapper;
import com.cms.init.mapper.PostMetaDataMapper;
import com.cms.init.model.Post;

@Repository
public class PostRepository implements PostRep {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Post post) {
		// TODO Auto-generated method stub
		try {
			String sql= String.format("insert into Post (IdPost, Titulo, Slug, Extracto, IdUsuario, Categoria, ImagenDestacada, Tipo) " 
		    + "values('%d', '%s', '%s', '%s', '%d', '%d', '%s', '%s' )" , 
		    post.getIdPost(), post.getTitulo(), post.getSlug(), post.getExtracto(), post.getIdUsuario(), post.getCategoria(), 
		    post.getImagenDestacada(), post.getTipo());
			jdbcTemplate.execute(sql);
			return true;
		} 
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Post post) {
		// TODO Auto-generated method stub
		if(post.getIdPost() != 0) {		
			String sql= String.format("update Post set IdPost='%d', Titulo='%s', Slug='%s', Extracto='%s', IdUsuario='%d', Categoria='%d', ImagenDestacada='%s', Tipo='%s'  ) " +
		    "where IdPostMetaData='%d'",
		    post.getIdPost(), post.getTitulo(), post.getSlug(), post.getExtracto(), post.getIdUsuario(), post.getCategoria(), 
		    post.getImagenDestacada(), post.getTipo());
			jdbcTemplate.execute(sql);
			return true;
	        }
		  return false;
	}

	@Override
	public List<Post> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from Post", new PostMapper());
	}

	@Override
	public Post findById(int Id) {
		// TODO Auto-generated method stub
		Object [] params= new Object [] {Id};
		return jdbcTemplate.queryForObject("select * from Post where IdPost=?", params, new PostMapper());
		
	}
}
