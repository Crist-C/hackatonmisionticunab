package com.ejemplo.tiendaalamano.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/* import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.EntityListeners;  */


@Entity
@Table(name="carrito")
public class Carrito implements Serializable{
	private static final long serialVersionUID =-5773962493781143007L;
    
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long carritoId;

    @Column(length = 25, nullable=false)
	private String pesoenkg;

    @Column(length = 25, nullable=false)
	private String costoTotal;

    @Column(length = 25, nullable=false)
	private boolean pagoContraEntrega;

    @Column(length = 25, nullable=false)
	private String calificacion;

    @Column(length = 25, nullable=false)
	private Date horarioEntrega;  //de java util

    @Column(length = 25, nullable=false)
	private int puntosTotales;

    @Column(length = 25, nullable=false)
	private boolean estado;

    @Column(length = 25, nullable=false)
	private boolean enviarDomicilio;

    
    @ManyToOne
    @JoinColumn(name ="cliente_id")
    private Cliente cliente;   

    @ManyToOne
    @JoinColumn(name ="producto_id")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name ="puntodeventa_id")
    private  PuntoDeVenta puntodeVenta;


	public Carrito(Long carritoId, String pesoenkg, String costoTotal, boolean pagoContraEntrega, String calificacion,
            Date horarioEntrega, int puntosTotales, boolean estado, boolean enviarDomicilio, Cliente cliente,
            Producto producto, PuntoDeVenta puntodeVenta) {
        this.carritoId = carritoId;
        this.pesoenkg = pesoenkg;
        this.costoTotal = costoTotal;
        this.pagoContraEntrega = pagoContraEntrega;
        this.calificacion = calificacion;
        this.horarioEntrega = horarioEntrega;
        this.puntosTotales = puntosTotales;
        this.estado = estado;
        this.enviarDomicilio = enviarDomicilio;
        this.cliente = cliente;
        this.producto = producto;
        this.puntodeVenta = puntodeVenta;
		}

		public Long getCarrito_id() {
			return carritoId;
		}
	
	
	
	
		public void setCarrito_id(Long carrito_id) {
			this.carritoId = carrito_id;
		}
	
	
	
	
		public String getPesoenkg() {
			return pesoenkg;
		}
	
	
	
	
		public void setPesoenkg(String pesoenkg) {
			this.pesoenkg = pesoenkg;
		}
	
	
	
	
		public String getCostoTotal() {
			return costoTotal;
		}
	
	
	
	
		public void setCostoTotal(String costoTotal) {
			this.costoTotal = costoTotal;
		}
	
	
	
	
		public boolean isPagoContraEntrega() {
			return pagoContraEntrega;
		}
	
	
	
	
		public void setPagoContraEntrega(boolean pagoContraEntrega) {
			this.pagoContraEntrega = pagoContraEntrega;
		}
	
	
	
	
		public String getCalificacion() {
			return calificacion;
		}
	
	
	
	
		public void setCalificacion(String calificacion) {
			this.calificacion = calificacion;
		}
	
	
	
	
		public Date getHorarioEntrega() {
			return horarioEntrega;
		}
	
	
	
	
		public void setHorarioEntrega(Date horarioEntrega) {
			this.horarioEntrega = horarioEntrega;
		}
	
	
	
	
		public int getPuntosTotales() {
			return puntosTotales;
		}
	
	
	
	
		public void setPuntosTotales(int puntosTotales) {
			this.puntosTotales = puntosTotales;
		}
	
	
	
	
		public boolean isEstado() {
			return estado;
		}
	
	
	
	
		public void setEstado(boolean estado) {
			this.estado = estado;
		}
	
	
	
	
		public boolean isEnviarDomicilio() {
			return enviarDomicilio;
		}
	
	
	
	
		public void setEnviarDomicilio(boolean enviarDomicilio) {
			this.enviarDomicilio = enviarDomicilio;
		}
	
	
	
	
		public Cliente getCliente() {
			return cliente;
		}
	
	
	
	
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
	
	
	
	
		public Producto getProducto() {
			return producto;
		}
	
	
	
	
		public void setProducto(Producto producto) {
			this.producto = producto;
		}
	
	
	
	
		public PuntoDeVenta getPuntodeVenta() {
			return puntodeVenta;
		}
	
	
	
	
		public void setPuntodeVenta(PuntoDeVenta puntodeVenta) {
			this.puntodeVenta = puntodeVenta;
		}
	
		
}
