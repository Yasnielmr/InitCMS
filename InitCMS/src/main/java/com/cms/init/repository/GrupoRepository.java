package com.cms.init.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cms.init.mapper.GrupoMapper;
import com.cms.init.model.Grupo;

@Repository
public class GrupoRepository implements GrupoRep {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Grupo grupo) {
		// TODO Auto-generated method stub
		try {
			String sql= String.format("insert into Grupo (IdGrupo, Nombre) " 
		    + "values('%d', '%s')" , grupo.getIdGrupo(), grupo.getNombre());
			jdbcTemplate.execute(sql);
			return true;
		} 
		catch (Exception e) {
			return false;
		}	
		
	}

	@Override
	public boolean update(Grupo grupo) {
		// TODO Auto-generated method stub

        if(grupo.getIdGrupo() != 0) {		
		String sql= String.format("update Grupo set IdGrupo='%d', Nombre='%s' ) " +
	    "where IdGrupo='%d'", grupo.getIdGrupo(), grupo.getNombre());
		jdbcTemplate.execute(sql);
		return true;
        }
	  return false;
	  
	}

	@Override
	public List<Grupo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from Grupo", new GrupoMapper());
	}

	@Override
	public Grupo findById(int Id) {
		// TODO Auto-generated method stub
		
		Object [] params= new Object [] {Id};
		return jdbcTemplate.queryForObject("select * from Grupo where IdGrupo=?", params, new GrupoMapper());
	}
}
