package com.ejemplo.tiendaalamano.entities;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name ="puntodeventa")
@Table(indexes = {
   @Index(columnList = "puntodeventa_id", name = "index_puntodeventa_id", unique = true),
   @Index(columnList = "direccion", name = "index_direccion", unique = true),
   @Index(columnList = "telefono", name = "index_telefono", unique = true),
   @Index(columnList = "encargado", name = "index_encargado", unique = true),
})
public class PuntodeVenta implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;
    
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long puntodeventa_id;

    @Column(length = 25, nullable=false)
	private String direccion;

    @Column(length = 25, nullable=false)
	private String telefono;

    
    @Column(length = 25, nullable=false)
	private String encargado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "puntodeVenta")
    private List<Carrito> CarritoList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "puntodeVenta")
    private List<Domiciliario> DomiciliarioList = new ArrayList<>(); 
    
    public PuntodeVenta(Long puntodeventa_id, String direccion, String telefono, String encargado) {
        this.puntodeventa_id = puntodeventa_id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.encargado = encargado;
    }

    public PuntodeVenta(){

    }

    public Long getId() {
        return puntodeventa_id;
    }

    public void setId(Long id) {
        this.puntodeventa_id = id;
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
