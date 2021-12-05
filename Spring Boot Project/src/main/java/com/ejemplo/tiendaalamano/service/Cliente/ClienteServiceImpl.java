package com.ejemplo.tiendaalamano.service.Cliente;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.entities.Usuario;
import com.ejemplo.tiendaalamano.models.Usuario.UsuarioCrearDto;
import com.ejemplo.tiendaalamano.models.Usuario.UsuarioDto;
import com.ejemplo.tiendaalamano.repository.UsuarioRepository;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	private UsuarioRepository UsuarioRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) UsuarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> findById(Long id) {
		return UsuarioRepository.findById(id);
	}

	@Override
	@Transactional
	public Usuario save(Usuario Usuario) {
		return UsuarioRepository.save(Usuario);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		UsuarioRepository.deleteById(id);
	}

	@Override
	public UsuarioDto crearUsuario(UsuarioCrearDto usuarioCrearDto) {
		
		Usuario usuarioEntityDto= modelMapper.map(usuarioCrearDto, Usuario.class);
        //usuarioEntityDto.setEncryptedPassword("encryptedPassword");
        //usuarioEntityDto.setUsuarioId("usuarioId");

        Usuario usuarioEntitySave=UsuarioRepository.save(usuarioEntityDto);

        UsuarioDto usuarioDto= modelMapper.map(usuarioEntitySave, UsuarioDto.class);

        return usuarioDto;
	}

	@Override
	public List<Usuario> login(String username, String password) {
		return null;
	}



}
