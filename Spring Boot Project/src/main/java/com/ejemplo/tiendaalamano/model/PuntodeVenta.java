package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuario")
public class PuntodeVenta implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;
    
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(length = 25, nullable=false)
	private String direccion;

    @Column(length = 25, nullable=false)
	private String telefono;

    
    @Column(length = 25, nullable=false)
	private String encargado;


    public PuntodeVenta(Long id, String direccion, String telefono, String encargado) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.encargado = encargado;
    }
    
    public PuntodeVenta(){

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
