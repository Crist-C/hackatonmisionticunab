package com.ejemplo.tiendaalamano.service.Cliente;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.entities.Cliente;
import com.ejemplo.tiendaalamano.models.Cliente.Dtos.ClienteCrearDto;
import com.ejemplo.tiendaalamano.models.Cliente.Dtos.ClienteDto;
import com.ejemplo.tiendaalamano.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	private IClienteRepository ClienteRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) ClienteRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Cliente> findById(Long id) {
		return ClienteRepository.findById(id);
	}

	@Override
	@Transactional
	public Cliente save(Cliente Cliente) {
		return ClienteRepository.save(Cliente);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		ClienteRepository.deleteById(id);
	}

	@Override
	public ClienteDto crearCliente(ClienteCrearDto clienteCrearDto) {
		
		Cliente clienteEntityDto= modelMapper.map(clienteCrearDto, Cliente.class);
        //clienteEntityDto.setEncryptedPassword("encryptedPassword");
        //clienteEntityDto.setClienteId("clienteId");

        Cliente clienteEntitySave=ClienteRepository.save(clienteEntityDto);

        ClienteDto clienteDto= modelMapper.map(clienteEntitySave, ClienteDto.class);

        return clienteDto;
	}

	@Override
	public List<Cliente> login(String username, String password) {
		return null;
	}



}
