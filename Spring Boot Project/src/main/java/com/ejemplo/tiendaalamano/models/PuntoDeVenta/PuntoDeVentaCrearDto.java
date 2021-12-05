package com.ejemplo.tiendaalamano.models.Carrito;

import java.io.Serializable;
import java.util.Date;


// Esta es la info que se le muestra al usuario
public class PuntoDeVentaCrearDto implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;
    private String pesoenkg;
    private String costo_total;
	private boolean pago_contra_entrega;
	private String calificacion;
	private Date horario_entrega;
	private int puntos_totales;
	private boolean estado;
	private boolean enviar_domicilio;

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
