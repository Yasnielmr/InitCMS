package com.cms.init.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cms.init.mapper.ContenidoMapper;
import com.cms.init.model.Contenido;

@Repository
public class ContenidoRepository implements ContenidoRep{
 
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Contenido contenido) {
		// TODO Auto-generated method stub
		try {
			String sql= String.format("insert into Comentario (IdContenido, Tipo, Contenido, IdPost) " 
		    + "values('%d', '%s', '%s', '%d')" , 
			contenido.getIdContenido(), contenido.getTipo(), contenido.getContenido(), contenido.getIdPost());
			jdbcTemplate.execute(sql);
			return true;
		} 
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Contenido contenido) {
		// TODO Auto-generated method stub

        if(contenido.getIdContenido() > 0) {		
		String sql= String.format("update Contenido set IdContenido='%d', Tipo='%s', Contenido='%s', IdPost='%d' ) " +
	    "where IdContenido='%d'",
	    contenido.getIdContenido(), contenido.getTipo(), contenido.getContenido(), contenido.getIdPost());
		jdbcTemplate.execute(sql);
		return true;
        }
	  return false;
}
	

	@Override
	public List<Contenido> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from Contenido", new ContenidoMapper());
	}

	@Override
	public Contenido findById(int Id) {
		// TODO Auto-generated method stub
		Object [] params = new Object [] {Id};
		return jdbcTemplate.queryForObject("select * from Contenido where IdContenido=?", params, new ContenidoMapper());
	}
}
