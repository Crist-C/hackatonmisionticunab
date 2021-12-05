package com.ejemplo.tiendaalamano.service.PuntoDeVenta;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.entities.PuntoDeVenta;
import com.ejemplo.tiendaalamano.models.PuntoDeVenta.Dtos.PuntoDeVentaCrearDto;
import com.ejemplo.tiendaalamano.models.PuntoDeVenta.Dtos.PuntoDeVentaDto;

public interface IPuntoDeVentaService {
	public List<PuntoDeVenta> findAll();
	public Optional<PuntoDeVenta> findById(Long id);
	public List<PuntoDeVenta> login(String username, String password);
	public PuntoDeVenta save(PuntoDeVenta PuntoDeVenta);
	public void deleteById(Long id);
	public PuntoDeVentaDto crearPuntoDeVenta(PuntoDeVentaCrearDto puntoDeVentaCrearDto);
	
	
}
