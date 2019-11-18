package com.cms.init.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cms.init.mapper.UsuarioMapper;
import com.cms.init.mapper.UsuarioMetaDataMapper;
import com.cms.init.model.Usuario;

public class UsuarioRepository implements UsuarioRep {
 
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Usuario usuario) {
		// TODO Auto-generated method stub
		try {
			String sql= String.format("insert into Usuario (IdUsuario, Nombre, Apellidos, Contrasena, Correo, IdGrupo) " 
		    + "values('%d', '%s', '%s', '%s', '%s', '%d')" , 
		    usuario.getIdUsuario(), usuario.getNombre(), usuario.getApellidos(), usuario.getContrasenna(), usuario.getCorreo(), usuario.getIdGrupo());
			jdbcTemplate.execute(sql);
			return true;
		} 
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Usuario usuario) {
		// TODO Auto-generated method stub
		if(usuario.getIdUsuario() > 0) {		
			String sql= String.format("update Usuario set IdUsuario='%d', Nombre='%s' Apellidos='%s', Contrasena='%s', Correo='%s', IdGrupo='%d' ) " +
		    "where IdUsuarioMetaData='%d'",
		    usuario.getIdUsuario(), usuario.getNombre(), usuario.getApellidos(), usuario.getContrasenna(), usuario.getCorreo(), usuario.getIdGrupo());
			jdbcTemplate.execute(sql);
			return true;
	        }
		  return false;
	}

	@Override
	public List<Usuario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from Usuario", new UsuarioMapper());
	}

	@Override
	public Usuario findById(int Id) {
		// TODO Auto-generated method stub
		Object [] params= new Object [] {Id};
		return jdbcTemplate.queryForObject("select * from Usuario where IdUsuario=?", params, new UsuarioMapper());
	}
}
