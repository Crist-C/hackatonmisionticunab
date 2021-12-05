package com.ejemplo.tiendaalamano.service.Administrador;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.entities.Administrador;
import com.ejemplo.tiendaalamano.models.Administrador.Dtos.AdministradorCrearDto;
import com.ejemplo.tiendaalamano.models.Administrador.Dtos.AdministradorDto;
import com.ejemplo.tiendaalamano.repository.IAdministradorRepository;

@Service
public class AdministradorServiceImpl implements IAdministradorService {
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	private IAdministradorRepository AdministradorRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Administrador> findAll() {
		return (List<Administrador>) AdministradorRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Administrador> findById(Long id) {
		return AdministradorRepository.findById(id);
	}

	@Override
	@Transactional
	public Administrador save(Administrador Administrador) {
		return AdministradorRepository.save(Administrador);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		AdministradorRepository.deleteById(id);
	}

	@Override
	public AdministradorDto crearAdministrador(AdministradorCrearDto administradorCrearDto) {
		
		Administrador administradorEntityDto= modelMapper.map(administradorCrearDto, Administrador.class);
        //administradorEntityDto.setEncryptedPassword("encryptedPassword");
        //administradorEntityDto.setAdministradorId("administradorId");

        Administrador administradorEntitySave=AdministradorRepository.save(administradorEntityDto);

        AdministradorDto administradorDto= modelMapper.map(administradorEntitySave, AdministradorDto.class);

        return administradorDto;
	}

	@Override
	public List<Administrador> login(String username, String password) {
		return null;
	}



}
