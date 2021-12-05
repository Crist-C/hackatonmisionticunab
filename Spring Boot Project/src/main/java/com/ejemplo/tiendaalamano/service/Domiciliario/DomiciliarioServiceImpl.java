package com.ejemplo.tiendaalamano.service.Domiciliario;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.entities.Domiciliario;
import com.ejemplo.tiendaalamano.models.Domiciliario.Dtos.DomiciliarioCrearDto;
import com.ejemplo.tiendaalamano.models.Domiciliario.Dtos.DomiciliarioDto;
import com.ejemplo.tiendaalamano.repository.IDomiciliarioRepository;

@Service
public class DomiciliarioServiceImpl implements IDomiciliarioService {
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	private IDomiciliarioRepository DomiciliarioRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Domiciliario> findAll() {
		return (List<Domiciliario>) DomiciliarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Domiciliario> findById(Long id) {
		return DomiciliarioRepository.findById(id);
	}

	@Override
	@Transactional
	public Domiciliario save(Domiciliario Domiciliario) {
		return DomiciliarioRepository.save(Domiciliario);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		DomiciliarioRepository.deleteById(id);
	}

	@Override
	public DomiciliarioDto crearDomiciliario(DomiciliarioCrearDto domiciliarioCrearDto) {
		
		Domiciliario domiciliarioEntityDto= modelMapper.map(domiciliarioCrearDto, Domiciliario.class);
        //domiciliarioEntityDto.setEncryptedPassword("encryptedPassword");
        //domiciliarioEntityDto.setDomiciliarioId("domiciliarioId");

        Domiciliario domiciliarioEntitySave=DomiciliarioRepository.save(domiciliarioEntityDto);

        DomiciliarioDto domiciliarioDto= modelMapper.map(domiciliarioEntitySave, DomiciliarioDto.class);

        return domiciliarioDto;
	}

	@Override
	public List<Domiciliario> login(String username, String password) {
		return null;
	}



}
