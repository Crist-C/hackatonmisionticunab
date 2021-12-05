package com.ejemplo.tiendaalamano.models.Administrador.Dtos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// Esta es la info que se le muestra al usuario
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdministradorCrearDto implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nombre;
    private String password;
	private boolean correo;

}
