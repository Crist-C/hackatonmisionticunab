package com.ejemplo.tiendaalamano.service.Usuario;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.entities.Usuario;
import com.ejemplo.tiendaalamano.models.Usuario.UsuarioCrearDto;
import com.ejemplo.tiendaalamano.models.Usuario.UsuarioDto;

public interface IUsuarioService {
	public List<Usuario> findAll();
	public Optional<Usuario> findById(Long id);
	public List<Usuario> login(String username, String password);
	public Usuario save(Usuario Usuario);
	public void deleteById(Long id);
	public UsuarioDto crearUsuario(UsuarioCrearDto usuarioCrearDto);
	
	
}
