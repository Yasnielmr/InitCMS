package com.cms.init.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cms.init.mapper.ComentarioMapper;
import com.cms.init.model.Comentario;

@Repository
public class ComentarioRepository implements ComentarioRep{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Comentario comentario) {
		// TODO Auto-generated method stub
		try {
			String sql= String.format("insert into Comentario (Comentario, IdPost, IdUsuario, Respuesta) " 
		    + "values('%s', '%d', '%d', '%d')" , 
			comentario.getCometario(), comentario.getIdPost(), comentario.getIdUsuario(), comentario.getRespuesta());
			jdbcTemplate.execute(sql);
			return true;
		} 
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Comentario comentario) {
		// TODO Auto-generated method stub
		
            if(comentario.getIdComentario() != 0) {		
			String sql= String.format("update Comentario set Comentario='%s', IdPost='%d', IdUsuario='%d', Respuesta='%d' ) " +
		    "where IdCategoria='%d'",
			comentario.getCometario(), comentario.getIdPost(), comentario.getIdUsuario(), comentario.getRespuesta());
			jdbcTemplate.execute(sql);
			return true;
            }
		return false;
	}

	@Override
	public List<Comentario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from Comentario", new ComentarioMapper());
	}

	@Override
	public Comentario findById(int Id) {
		// TODO Auto-generated method stub
		Object [] params= new Object [] {Id}; 
		return jdbcTemplate.queryForObject("select * from Cometario where IdComentario=?", params, new ComentarioMapper());
	}

}
