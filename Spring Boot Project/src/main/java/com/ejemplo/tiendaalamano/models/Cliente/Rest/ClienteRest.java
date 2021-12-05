package com.ejemplo.tiendaalamano.models.Cliente.Rest;

import java.util.List;

import com.ejemplo.tiendaalamano.entities.Carrito;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRest {
    
    private Long cliente_id;
	private String username;
	private String nombre;
	private String direccion;
	private String celular;
	private String correo;
	private int puntos;
	private int deuda;
	private boolean estado_de_cuenta;
	private String password;
    private List<Carrito> CarritoList; 
}
