package com.cms.init.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cms.init.mapper.PermisoMapper;
import com.cms.init.model.Permiso;

@Repository
public class PermisoRepository implements PermisoRep{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Permiso permiso) {
		// TODO Auto-generated method stub
		try {
			String sql= String.format("insert into Permiso (IdPermiso, Nombre) " 
		    + "values('%d', '%s')" , 
			permiso.getIdPermiso(), permiso.getNombre());
			jdbcTemplate.execute(sql);
			return true;
		} 
		catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean update(Permiso permiso) {
		// TODO Auto-generated method stub
	    if(permiso.getIdPermiso() != 0) {		
			String sql= String.format("update Permiso set IdPermiso='%d', Nombre='%s' ) " +
		    "where IdPermiso='%d'", permiso.getIdPermiso(), permiso.getNombre());
			jdbcTemplate.execute(sql);
			return true;
	        }
		  return false;
		  
	}

	@Override
	public List<Permiso> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from Permiso", new PermisoMapper());
	}

	@Override
	public Permiso findById(int Id) {
		// TODO Auto-generated method stub
		
		Object [] params= new Object [] {Id};
		return jdbcTemplate.queryForObject("select * from Permiso where IdPermiso=?", params, new PermisoMapper());
		
	}
}
