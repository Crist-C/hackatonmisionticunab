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
    

