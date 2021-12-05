package com.ejemplo.tiendaalamano.models.Cliente;

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
    private List<Carrito> CarritoList = new ArrayList<>(); 
}
