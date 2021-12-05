package com.ejemplo.tiendaalamano.models.Carrito;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdministradorDto {
    
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nombre;
    private String password;
	private boolean correo;

}
