package com.ejemplo.tiendaalamano.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="producto")
public class Producto implements Serializable{
    
	private static final long serialVersionUID = -5773962493781143007L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
	@Column(length = 25, nullable=false)
    private String nombreProducto;

    
	@Column(length = 25, nullable=false)
    private int cantidad;

    
	@Column(length = 25, nullable=false)
    private int disponibles;

    
	@Column(length = 25, nullable=false)
    private int precio;

        
	@Column(length = 25, nullable=false)
    private String marca;

        
	@Column(length = 25, nullable=false)
    private int descuento;

        
	@Column(length = 25, nullable=false)
    private int impuestos;

        
	@Column(length = 25, nullable=false)
    private int peso;

        
	@Column(length = 25, nullable=false)
    private int puntos;

        
	@Column(length = 25, nullable=false)
    private String tipo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(int impuestos) {
        this.impuestos = impuestos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Producto(Long id, String nombreProducto, int cantidad, int disponibles, int precio, String marca,
            int descuento, int impuestos, int peso, int puntos, String tipo) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.disponibles = disponibles;
        this.precio = precio;
        this.marca = marca;
        this.descuento = descuento;
        this.impuestos = impuestos;
        this.peso = peso;
        this.puntos = puntos;
        this.tipo = tipo;
    }

    public Producto() {
	}
}
    

