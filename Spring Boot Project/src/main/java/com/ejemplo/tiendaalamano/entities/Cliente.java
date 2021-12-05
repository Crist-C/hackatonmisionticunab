package com.ejemplo.tiendaalamano.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Index;
import javax.persistence.OneToMany;


 @Entity(name ="cliente")
 @Table(indexes = {
    @Index(columnList = "clienteId", name = "index_cliente_id", unique = true),
    @Index(columnList = "username", name = "index_username", unique = true),
    @Index(columnList = "nombre", name = "index_nombre", unique = true),
    @Index(columnList = "direccion", name = "index_direccion", unique = true),
    @Index(columnList = "celular", name = "index_celular", unique = true),
    @Index(columnList = "correo", name = "index_correo", unique = true),
    @Index(columnList = "puntos", name = "index_puntos", unique = true),
    @Index(columnList = "deuda", name = "index_deuda", unique = true),
    @Index(columnList = "estado_de_cuenta", name = "index_estado_de_cuenta", unique = true),
})
@Data
public class Cliente implements Serializable {
	private static final long serialVersionUID =-5773962493781143007L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clienteId;

    @Column(length = 25, nullable=false)
	private String username;

    @Column(length = 25, nullable=false)
	private String nombre;

    @Column(length = 25, nullable=false)
	private String correo;

    @Column(length = 25, nullable=false)
	private String celular;


    @Column(length = 25, nullable=false)
	private String direccion1;

    @Column(length = 25, nullable=true)
	private String direccion2;


    @Column(length = 25, nullable=true)
	private Long puntos;

    @Column(length = 25, nullable=false)
	private Float deuda;

    @Column(length = 25, nullable=false)
	private boolean estadoDeCuenta;

    @Column(length = 25, nullable=false)
	private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Carrito> CarritoList = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(Long clienteId, String username, String nombre, String correo, String celular, String direccion1,
            String direccion2, Long puntos, Float deuda, boolean estadoDeCuenta, String password,
            List<Carrito> carritoList) {
        this.clienteId = clienteId;
        this.username = username;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.puntos = puntos;
        this.deuda = deuda;
        this.estadoDeCuenta = estadoDeCuenta;
        this.password = password;
        CarritoList = carritoList;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public Long getPuntos() {
        return puntos;
    }

    public void setPuntos(Long puntos) {
        this.puntos = puntos;
    }

    public Float getDeuda() {
        return deuda;
    }

    public void setDeuda(Float deuda) {
        this.deuda = deuda;
    }

    public boolean isEstadoDeCuenta() {
        return estadoDeCuenta;
    }

    public void setEstadoDeCuenta(boolean estadoDeCuenta) {
        this.estadoDeCuenta = estadoDeCuenta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Carrito> getCarritoList() {
        return CarritoList;
    }

    public void setCarritoList(List<Carrito> carritoList) {
        CarritoList = carritoList;
    } 


    
}
