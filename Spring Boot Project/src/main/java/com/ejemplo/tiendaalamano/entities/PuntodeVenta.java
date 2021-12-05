package com.ejemplo.tiendaalamano.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="puntodeventa")
public class PuntoDeVenta implements Serializable{
	private static final long serialVersionUID = 1L;
    
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(length = 25, nullable=false)
	private String direccion;

    @Column(length = 25, nullable=false)
	private String telefono;

    
    @Column(length = 25, nullable=false)
	private String encargado;


    public PuntoDeVenta(Long id, String direccion, String telefono, String encargado) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.encargado = encargado;
    }
    
    public PuntoDeVenta(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    
}
