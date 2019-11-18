package com.cms.init.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cms.init.mapper.GrupoPermisoMapper;
import com.cms.init.model.GrupoPermiso;

@Repository
public class GrupoPermisoRepository implements GrupoPermisoRep {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(GrupoPermiso grupoPermiso) {
		// TODO Auto-generated method stub
		try {
			String sql= String.format("insert into GrupoPermiso (IdPermiso, IdGrupo) " 
		    + "values('%d', '%d')" , grupoPermiso.getIdPermiso(), grupoPermiso.getIdGrupo());
			jdbcTemplate.execute(sql);
			return true;
		} 
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(GrupoPermiso grupoPermiso) {
		// TODO Auto-generated method stub
		if(grupoPermiso.getIdGrupo() != 0) {		
			String sql= String.format("update GrupoPermiso set IdPermiso='%d', IdGrupo='%d' ) " +
		    "where IdGrupo='%d'",
		    grupoPermiso.getIdPermiso(), grupoPermiso.getIdGrupo());
			jdbcTemplate.execute(sql);
			return true;
	        }
		  return false;
		  
	}

	@Override
	public List<GrupoPermiso> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from GrupoPermiso", new GrupoPermisoMapper());
	}

	@Override
	public GrupoPermiso findById(int Id) {
		// TODO Auto-generated method stub
		
		Object [] params= new Object [] {Id};
		return jdbcTemplate.queryForObject("select * from GrupoPermiso where IdGrupo=?", params, new GrupoPermisoMapper());
	}
}
