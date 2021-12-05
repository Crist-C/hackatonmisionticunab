package com.ejemplo.tiendaalamano.models.Carrito.Dtos;

import java.io.Serializable;
import java.util.Date;

import com.ejemplo.tiendaalamano.entities.Cliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// Esta es la info que se le muestra al usuario
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarritoCrearDto implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;
    private String pesoenkg;
    private String costoTotal;
	private boolean pagoContraEntrega;
	private String calificacion;
	private Date horarioEntrega;
	private int puntosTotales;
	private boolean estado;
	private boolean enviarDomicilio;
    private Cliente cliente_id;
    

}
