package com.ejemplo.tiendaalamano.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//se creo la Entity domiciliario
@Entity
@Table(name="domiciliario")
public class Domiciliario implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long domiciliario_id; 

    @Column(length = 25, nullable=false)
	private String nombre;

    @Column(length = 25, nullable=false)
	private String telefono;

    @ManyToOne
    @JoinColumn(name ="puntodeventa_id")
    private PuntoDeVenta puntodeVenta;   

    public Domiciliario(Long id, String nombre, String telefono) {
        this.domiciliario_id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Domiciliario(){

    }

    public Long getId() {
        return domiciliario_id;
    }

    public void setId(Long id) {
        this.domiciliario_id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}