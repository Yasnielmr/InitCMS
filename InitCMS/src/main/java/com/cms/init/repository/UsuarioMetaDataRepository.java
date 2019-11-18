package com.cms.init.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cms.init.mapper.PostMapper;
import com.cms.init.mapper.UsuarioMetaDataMapper;
import com.cms.init.model.UsuarioMetaData;

@Repository
public class UsuarioMetaDataRepository implements UsuarioMetaDataRep {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(UsuarioMetaData usuarioMetaData) {
		// TODO Auto-generated method stub
		try {
			String sql= String.format("insert into UsuarioMetaData (IdUsuarioMetaData, IdUsuario, Clave, Valor, Tipo) " 
		    + "values('%d', '%d', '%s', '%s', '%s')" , 
		    usuarioMetaData.getIdUsuarioMetaData(), usuarioMetaData.getIdUsuario(), usuarioMetaData.getClave(), usuarioMetaData.getValor(), usuarioMetaData.getTipo());
			jdbcTemplate.execute(sql);
			return true;
		} 
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(UsuarioMetaData usuarioMetaData) {
		// TODO Auto-generated method stub
		if(usuarioMetaData.getIdUsuarioMetaData() > 0) {		
			String sql= String.format("update UsuarioMetaData set IdUsuarioMetaData='%d', IdUsuario='%d' Clave='%s', Valor='%s', Tipo='%s' ) " +
		    "where IdUsuarioMetaData='%d'",
		    usuarioMetaData.getIdUsuarioMetaData(), usuarioMetaData.getIdUsuario(), usuarioMetaData.getClave(), usuarioMetaData.getValor(), usuarioMetaData.getTipo());
			jdbcTemplate.execute(sql);
			return true;
	        }
		  return false;
	}

	@Override
	public List<UsuarioMetaData> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from UsuarioMetaData", new UsuarioMetaDataMapper());
	}

	@Override
	public UsuarioMetaData findById(int Id) {
		// TODO Auto-generated method stub
		Object [] params= new Object [] {Id};
		return jdbcTemplate.queryForObject("select * from UsuarioMetaData where IdUsuarioMetaData=?", params, new UsuarioMetaDataMapper());
	}
}
