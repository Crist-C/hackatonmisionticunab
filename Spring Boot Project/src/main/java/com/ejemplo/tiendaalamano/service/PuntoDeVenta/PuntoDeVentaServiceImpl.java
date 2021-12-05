package com.ejemplo.tiendaalamano.service.PuntoDeVenta;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.entities.PuntoDeVenta;
import com.ejemplo.tiendaalamano.models.PuntoDeVenta.Dtos.PuntoDeVentaCrearDto;
import com.ejemplo.tiendaalamano.models.PuntoDeVenta.Dtos.PuntoDeVentaDto;
import com.ejemplo.tiendaalamano.repository.IPuntoDeVentaRepository;

@Service
public class PuntoDeVentaServiceImpl implements IPuntoDeVentaService {
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	private IPuntoDeVentaRepository PuntoDeVentaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<PuntoDeVenta> findAll() {
		return (List<PuntoDeVenta>) PuntoDeVentaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<PuntoDeVenta> findById(Long id) {
		return PuntoDeVentaRepository.findById(id);
	}

	@Override
	@Transactional
	public PuntoDeVenta save(PuntoDeVenta PuntoDeVenta) {
		return PuntoDeVentaRepository.save(PuntoDeVenta);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		PuntoDeVentaRepository.deleteById(id);
	}

	@Override
	public PuntoDeVentaDto crearPuntoDeVenta(PuntoDeVentaCrearDto puntoDeVentaCrearDto) {
		
		PuntoDeVenta puntoDeVentaEntityDto= modelMapper.map(puntoDeVentaCrearDto, PuntoDeVenta.class);
        //puntoDeVentaEntityDto.setEncryptedPassword("encryptedPassword");
        //puntoDeVentaEntityDto.setPuntoDeVentaId("puntoDeVentaId");

        PuntoDeVenta puntoDeVentaEntitySave=PuntoDeVentaRepository.save(puntoDeVentaEntityDto);

        PuntoDeVentaDto puntoDeVentaDto= modelMapper.map(puntoDeVentaEntitySave, PuntoDeVentaDto.class);

        return puntoDeVentaDto;
	}

	@Override
	public List<PuntoDeVenta> login(String username, String password) {
		return null;
	}



}
