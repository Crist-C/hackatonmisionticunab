package com.ejemplo.tiendaalamano.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.web.servlet.FlashMapManager;

@Entity
@Table(name = "detallecarrito")
public class DetalleCarrito {
   
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long detallecarrito_id;

    @ManyToOne
    @JoinColumn(name = "producto_id",nullable = false, referencedColumnName = "producto_id")
    private Producto producto_id;

    @ManyToOne
    @JoinColumn(name = "carrito_id",nullable = false, referencedColumnName = "carrito_id")
    private Carrito carrito_id;

}
