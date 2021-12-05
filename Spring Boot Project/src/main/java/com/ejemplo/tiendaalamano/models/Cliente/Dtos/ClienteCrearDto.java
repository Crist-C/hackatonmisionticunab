package com.ejemplo.tiendaalamano.models.Cliente.Dtos;

import java.io.Serializable;
import java.util.List;

import com.ejemplo.tiendaalamano.entities.Carrito;

public class ClienteCrearDto implements Serializable{

    private static final long serialVersionUID = 1L;

    private String clienteId;
    private String username;
    private String nombre;
    private String correo;
    private String celular;
    private String direccion1;
    private String direccion2;
    private Long   puntos;
    private float  deuda;
    private boolean estadoDeCuenta;
    private String password;
    private List<Carrito> CarritoList;

    

    public String getClienteId() {
        return clienteId;
    }
    public void setClienteId(String clienteId) {
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
    public float getDeuda() {
        return deuda;
    }
    public void setDeuda(float deuda) {
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
