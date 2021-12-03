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


	

	public Producto(Long id, String nombreProducto, int cantidad) {
		this.id = id;
		this.nombreProducto = nombreProducto;
        this.cantidad=cantidad;
		
	}
	
	public Producto() {
	}
	
    



}
    

