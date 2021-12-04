package com.ejemplo.tiendaalamano.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
	private Long id;

    @Column(length = 25, nullable=false)
	private String pesoenkg;

    @Column(length = 25, nullable=false)
	private String costo_total;

    @Column(length = 25, nullable=false)
	private boolean pago_contra_entrega;

    @Column(length = 25, nullable=false)
	private String calificacion;

    @Column(length = 25, nullable=false)
	private Date horario_entrega;  //de java util

    @Column(length = 25, nullable=false)
	private int puntos_totales;

    @Column(length = 25, nullable=false)
	private boolean estado;

    @Column(length = 25, nullable=false)
	private boolean enviar_domicilio;

    
    @ManyToOne
    @JoinColumn(name ="cliente_id")
    private Cliente cliente;

    public Carrito(Long id, String pesoenkg, String costo_total, boolean pago_contra_entrega, String calificacion,
            Date horario_entrega, int puntos_totales, boolean estado, boolean enviar_domicilio) {
        this.id = id;
        this.pesoenkg = pesoenkg;
        this.costo_total = costo_total;
        this.pago_contra_entrega = pago_contra_entrega;
        this.calificacion = calificacion;
        this.horario_entrega = horario_entrega;
        this.puntos_totales = puntos_totales;
        this.estado = estado;
        this.enviar_domicilio = enviar_domicilio;
    }

    public Carrito() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPesoenkg() {
        return pesoenkg;
    }

    public void setPesoenkg(String pesoenkg) {
        this.pesoenkg = pesoenkg;
    }

    public String getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(String costo_total) {
        this.costo_total = costo_total;
    }

    public boolean isPago_contra_entrega() {
        return pago_contra_entrega;
    }

    public void setPago_contra_entrega(boolean pago_contra_entrega) {
        this.pago_contra_entrega = pago_contra_entrega;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Date getHorario_entrega() {
        return horario_entrega;
    }

    public void setHorario_entrega(Date horario_entrega) {
        this.horario_entrega = horario_entrega;
    }

    public int getPuntos_totales() {
        return puntos_totales;
    }

    public void setPuntos_totales(int puntos_totales) {
        this.puntos_totales = puntos_totales;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEnviar_domicilio() {
        return enviar_domicilio;
    }

    public void setEnviar_domicilio(boolean enviar_domicilio) {
        this.enviar_domicilio = enviar_domicilio;
    }

}
